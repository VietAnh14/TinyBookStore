/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.BookDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author Viet Anh
 */
public class BookDAL extends ConnectDB{
    private final String GET_ALL = "SELECT SACH.* FROM SACH";
    
    
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBook;
    }
}
