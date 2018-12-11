/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CTPNDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class CTPNDAL extends ConnectDB {

    public boolean insertListCTPN(ArrayList<CTPNDTO> listCTPN) {
        boolean status;
        try {
            getConnection();
            Statement statement = cn.createStatement();
            cn.setAutoCommit(false);
            for (CTPNDTO ctpn : listCTPN) {
                statement.executeUpdate(ctpn.toInsertString());
            }
            cn.commit();
            status = true;
        } catch (SQLException e) {
            status = false;
            e.printStackTrace();
            try {
                cn.rollback();
            } catch (SQLException exception) {
                exception.printStackTrace();
            }
        }
        getClose();
        return status;
    }
    
    public boolean getByIdPN(ArrayList<CTPNDTO> listCTPN, String idPN) {
        boolean status = false;
        String sql = "SELECT * FROM CTPHIEUNHAP WHERE MaPN = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, idPN);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CTPNDTO ctpn = new CTPNDTO();
                ctpn.setMaPN(rs.getInt("MaPN"));
                ctpn.setGiaNhap(rs.getFloat("GiaNhap"));
                ctpn.setThanhTien(rs.getFloat("ThanhTien"));
                ctpn.setMaSach(rs.getInt("MaSach"));
                ctpn.setSoLuongNhap(rs.getInt("SoLuongNhap"));
                listCTPN.add(ctpn);
            }
            
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        getClose();
        return status;
    }
}
