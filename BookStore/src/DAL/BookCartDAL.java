/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.BookCartDTO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DaoLam
 */
public class BookCartDAL extends ConnectDB{
    // hàm tìm Info sách trong fTaoDonHang

    public ArrayList<BookCartDTO> addbook(String masach,int sl) {
       ArrayList<BookCartDTO> listBook = new ArrayList<>();
        try {
            getConnection();
            String strCall = "{call INFO_SACH(?)}";
            CallableStatement caSt = cn.prepareCall(strCall); 
            caSt.setString(1, masach); 
            ResultSet rs = caSt.executeQuery();
            while (rs.next()) {
                BookCartDTO book = new BookCartDTO();
                book.setMaSach(rs.getInt("MaSach"));
               // book.setMaNXB(rs.getInt("MaNXB"));
                book.setTenSach(rs.getString("TenSach"));
                book.setTacGia(rs.getString("TacGia"));
                //book.setMaLoaiSach(rs.getInt("MaLoaiSach"));
                book.setGiaBan(rs.getFloat("GiaBan"));
                
                book.setSoLuong(sl);
                book.setThanhTien();
                
                listBook.add(book);
            }
            getClose();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listBook;
    }
}
