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
import java.util.ArrayList;

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

    public Float tinhTongThu(String tuNgay, String denNgay) {
        String sql = "set dateformat DMY"
                + "SELECT SUM(TriGia) AS TongThu, SUM() FROM HOADON WHERE NgHD BETWEEN '?' AND '?'";
        Float trigia = new Float('0');
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(0, tuNgay);
            ps.setString(1, denNgay);
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
}
