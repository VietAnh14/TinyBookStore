/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.BaoCaoDoanhThuDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Viet Anh
 */
public class BaoCaoDoanhThuDAL extends ConnectDB {

    public ArrayList<BaoCaoDoanhThuDTO> getAll() {
        ArrayList<BaoCaoDoanhThuDTO> listBaoCao = new ArrayList<>();
        String sql = "SELECT * FROM BAOCAODOANHTHU";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BaoCaoDoanhThuDTO baoCaoDoanhThuDTO = new BaoCaoDoanhThuDTO();
                baoCaoDoanhThuDTO.setTuNgay(rs.getDate("TuNgay"));
                baoCaoDoanhThuDTO.setDenNgay(rs.getDate("DenNgay"));
                baoCaoDoanhThuDTO.setNgayLap(rs.getDate("NgayLap"));
                baoCaoDoanhThuDTO.setTongThu(rs.getFloat("TongThu"));
                listBaoCao.add(baoCaoDoanhThuDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getClose();
        return listBaoCao;
    }

    public Float TongThu(String tuNgay, String denNgay) {
        String sql = "set dateformat DMY SELECT SUM(TriGia) AS TongThu FROM HOADON WHERE NgHD BETWEEN ? AND ?";
        Float trigia = new Float('0');
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, tuNgay);
            ps.setString(2, denNgay);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                trigia = rs.getFloat("TongThu");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        getClose();
        return  trigia;
    }
     public ArrayList<BaoCaoDoanhThuDTO> tinhTongThu(String tuNgay, String denNgay) throws SQLException {
        ArrayList<BaoCaoDoanhThuDTO> listBaoCao = new ArrayList<>();
        String sql = "set dateformat DMY SELECT SUM(TriGia) AS TongThu FROM HOADON WHERE NgHD BETWEEN ? AND ?";
        Float trigia = new Float('0');
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, tuNgay);
            ps.setString(2, denNgay);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                BaoCaoDoanhThuDTO baoCaoDoanhThuDTO = new BaoCaoDoanhThuDTO();
                trigia = rs.getFloat("TongThu");
                Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(tuNgay);  
                Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(denNgay);
                Date d = new java.util.Date();
                baoCaoDoanhThuDTO.setTuNgay(date1);
                baoCaoDoanhThuDTO.setDenNgay(date2);
                baoCaoDoanhThuDTO.setNgayLap(d);
                baoCaoDoanhThuDTO.setTongThu(trigia);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        getClose();
        return listBaoCao;
    }
     public boolean insertBC(BaoCaoDoanhThuDTO BC,float tt) {
        String sql ="set dateformat DMY INSERT INTO BAOCAODOANHTHU (TuNgay,DenNgay,NgayLap,TongThu) VALUES (?,?,?,?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String s2 = formatter.format(BC.getDenNgay());
            String s1 = formatter.format(BC.getTuNgay());
            Date d = new java.util.Date();
            String cd = formatter.format(d);
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setString(3, cd);
            ps.setFloat(4, tt);
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
        }

        return false;
    }

}
