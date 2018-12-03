/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.BookDTO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class BookDAL extends ConnectDB {

    private final String GET_ALL = "SELECT SACH.* FROM SACH ORDER BY TenSach ASC";

    public ArrayList<BookDTO> getAll() {
        ArrayList<BookDTO> listBook = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookDTO book = new BookDTO();
                book.setMaSach(rs.getInt("MaSach"));
                book.setMaNXB(rs.getInt("MaNXB"));
                book.setTenSach(rs.getString("TenSach"));
                book.setTacGia(rs.getString("TacGia"));
                book.setMaLoaiSach(rs.getInt("MaLoaiSach"));
                book.setGiaBan(rs.getFloat("GiaBan"));
                book.setSoLuong(rs.getInt("SoLuong"));
                book.setDeleted(rs.getBoolean("deleted"));
                listBook.add(book);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listBook;
    }

    public boolean insertBook(BookDTO book) {
        String sql = "INSERT INTO SACH (MaSach, MaNXB, TenSach, TacGia, MaLoaiSach, GiaBan, SoLuong) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, book.getMaSach());
            ps.setInt(2, book.getMaNXB());
            ps.setString(3, book.getTenSach());
            ps.setString(4, book.getTacGia());
            ps.setInt(5, book.getMaLoaiSach());
            ps.setFloat(6, book.getGiaBan());
            ps.setInt(7, book.getSoLuong());

            int rs = ps.executeUpdate();
            if (rs > 0) {
                cn.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Integer generateId() {
        String sql = "SELECT MAX(MaSach) AS MaxId FROM Sach ";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MaxId") + 1;
                closeCn(cn, ps, rs);
            }
        } catch (Exception e) {
        }
        return id;
    }

    public boolean updateBook(BookDTO book) {
        String sql = "UPDATE SACH SET TenSach = ?, MaNXB = ?, TacGia = ?, MaLoaiSach = ?, GiaBan = ? WHERE MaSach = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, book.getTenSach());
            ps.setInt(2, book.getMaNXB());
            ps.setString(3, book.getTacGia());
            ps.setInt(4, book.getMaLoaiSach());
            ps.setFloat(5, book.getGiaBan());
            ps.setInt(6, book.getMaSach());

            int rs = ps.executeUpdate();
            if (rs > 0) {
                cn.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<BookDTO> searchByName(String name) {
        String sql = "SELECT * FROM SACH WHERE TenSach LIKE N'%"+name+"%'";
        ArrayList<BookDTO> listBook = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookDTO book = new BookDTO();
                book.setMaSach(rs.getInt("MaSach"));
                book.setMaNXB(rs.getInt("MaNXB"));
                book.setTenSach(rs.getString("TenSach"));
                book.setTacGia(rs.getString("TacGia"));
                book.setMaLoaiSach(rs.getInt("MaLoaiSach"));
                book.setGiaBan(rs.getFloat("GiaBan"));
                book.setSoLuong(rs.getInt("SoLuong"));
                book.setDeleted(rs.getBoolean("deleted"));
                listBook.add(book);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listBook;
    }




    
}