/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.CongTyDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class CtyDAL extends  ConnectDB{
    public boolean getAll(ArrayList<CongTyDTO> listCongTy) {
        String sql = "SELECT * FROM CONGTY";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs  = ps.executeQuery();
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
        } catch (Exception e) {
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
        } catch (Exception e) {
            e.printStackTrace();
            getClose();
            return false;
        }
    }
}
