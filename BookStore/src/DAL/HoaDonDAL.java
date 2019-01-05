/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author DaoLam
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.HoaDonDTO;

public class HoaDonDAL extends ConnectDB {
    // hàm tìm mã hóa đơn thích hợp

    public Integer generateId() {
        String sql = "SELECT MAX(MaHD) AS MAHD FROM HOADON ";
        Integer result = 0;
        try {
            getConnection();
            ResultSet rs = cn.createStatement().executeQuery(sql);
            if (rs.next()) {
                result = rs.getInt("MAHD") + 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getClose();
        return result;
    }   

    public boolean insertHD(HoaDonDTO hd) {
        boolean status = false;
        String sql = "INSERT INTO HOADON"
                + "                         (MaHD, MaNV, MaKH, NgHD, TriGia, DiemTichLuy)"
                + " VALUES        (?, ?, ?, ?, ?, ?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, hd.getMaHD());
            ps.setInt(2, hd.getMaNv());
            ps.setInt(3, hd.getMaKH());
            ps.setString(4, hd.getNgHD());
            ps.setFloat(5, hd.getTriGia());
            ps.setInt(6, hd.getDiemTichLuy());
            Integer rs = ps.executeUpdate();
            if (rs > 0) {
                status = true;
            }
        } catch (SQLException e) {
            status = false;
            e.printStackTrace();
        }
        
        getClose();
        return status;
    }
    
    public boolean updateDTL(Integer dtl, Integer maKH) {
        String sql = "Update KHACHHANG set DiemTichLuy = DiemTichLuy + "+dtl+"  WHERE MaKH = "+maKH+"";
        boolean status = false;
        try {
            getConnection();
            int rs = cn.createStatement().executeUpdate(sql);
            if (rs > 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
        }
        
        getClose();
        return status;
    }
    
    public Float getQD() {
        String sql = "SELECT * FROM QUYDINH";
        Float qd = 100f;
        try {
            getConnection();
            ResultSet rs = cn.createStatement().executeQuery(sql);
            if (rs.next()) {
                qd = rs.getFloat("GiaTriDiemTichLuy");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        getClose();
        return qd;
    }
}
