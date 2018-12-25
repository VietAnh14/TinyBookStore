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
        } catch (SQLException e) {
            e.printStackTrace();
        }

        getClose();
        return status;
    }

    public boolean insertCTPN(CTPNDTO ctpn) {
        boolean status = false;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(ctpn.toInsertString());
            int rs = ps.executeUpdate();
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

    public boolean deleteCTPN(String maPN, String maSach) {
        boolean status = false;
        String sql = "DELETE CTPHIEUNHAP WHERE MaPN = ? AND MaSach = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(maPN));
            ps.setInt(2, Integer.parseInt(maSach));
            int rs = ps.executeUpdate();
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
    
    public boolean updateCTPN(CTPNDTO ctpn) {
        String sql = "UPDATE CTPHIEUNHAP SET "
                            + "SoLuongNhap = ?, GiaNhap = ?, ThanhTien = ? "
                            + "WHERE MaPN = ? AND MaSach = ?";
        boolean status = false;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, ctpn.getSoLuongNhap());
            ps.setFloat(2, ctpn.getGiaNhap());
            ps.setFloat(3, ctpn.getThanhTien());
            ps.setInt(4, ctpn.getMaPN());
            ps.setInt(5, ctpn.getMaSach());
            int rs = ps.executeUpdate();
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
}
