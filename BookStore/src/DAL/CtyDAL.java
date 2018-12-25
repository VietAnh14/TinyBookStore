/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CongTyDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class CtyDAL extends ConnectDB {

    public boolean getAll(ArrayList<CongTyDTO> listCongTy) {
        String sql = "SELECT * FROM CONGTY";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CongTyDTO congTyDTO = new CongTyDTO();
                congTyDTO.setMaCty(rs.getInt("MaCty"));
                congTyDTO.setTenCty(rs.getString("TenCty"));
                congTyDTO.setDiaChi(rs.getString("DiaChi"));
                congTyDTO.setSDT(rs.getString("SDT"));
                listCongTy.add(congTyDTO);
            }
            getClose();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            getClose();
            return false;
        }
    }

    public boolean getById(CongTyDTO congTyDTO, Integer id) {
        String sql = "SELECT * FROM CONGTY WHERE MaCTy = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                congTyDTO.setMaCty(rs.getInt("MaCTy"));
                congTyDTO.setDiaChi(rs.getString("DiaChi"));
                congTyDTO.setSDT(rs.getString("SDT"));
                congTyDTO.setTenCty(rs.getString("TenCTy"));
            }
            getClose();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            getClose();
            return false;
        }
    }

    public boolean insertCty(CongTyDTO congTy) {
        Boolean status = false;
        String sql = "INSERT INTO CONGTY (MaCty, TenCty, DiaChi, SDT) VALUES (?, ?, ?, ?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, congTy.getMaCty());
            ps.setString(2, congTy.getTenCty());
            ps.setString(3, congTy.getDiaChi());
            ps.setString(4, congTy.getSDT());
            Integer rs = ps.executeUpdate();
            if (rs > 0) {
                status = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            status = false;
        }

        getClose();
        return status;
    }

    public boolean updateCty(CongTyDTO congTy) {
        Boolean status = false;
        String sql = "UPDATE CONGTY SET TenCty = ?, DiaChi = ?, SDT = ? WHERE MaCty = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, congTy.getTenCty());
            ps.setString(2, congTy.getDiaChi());
            ps.setString(3, congTy.getSDT());
            ps.setInt(4, congTy.getMaCty());
            Integer rs = ps.executeUpdate();
            if (rs > 0) {
                status = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            status = false;
        }

        getClose();
        return status;
    }

    public Integer generateId() {
        String sql = "SELECT MAX(MaCty) AS MAXID FROM CONGTY";
        Integer id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MAXID") + 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getClose();
        return id;
    }

    public boolean searchByName(String name, ArrayList<CongTyDTO> listCongTy) {
        String sql = "SELECT * FROM CONGTY WHERE TenCty LIKE N'%" + name + "%'";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CongTyDTO congTyDTO = new CongTyDTO();
                congTyDTO.setMaCty(rs.getInt("MaCty"));
                congTyDTO.setTenCty(rs.getString("TenCty"));
                congTyDTO.setDiaChi(rs.getString("DiaChi"));
                congTyDTO.setSDT(rs.getString("SDT"));
                listCongTy.add(congTyDTO);
            }
            getClose();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            getClose();
            return false;
        }
    }
}
