/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiSachDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class LoaiSachDAL extends ConnectDB{
    private final String GET_BY_ID = "SELECT  * FROM LoaiSach WHERE MaLoaiSach = ?";
    private final String GET_ALL = "SELECT  * FROM LoaiSach";
    public ArrayList<LoaiSachDTO> getById (int id) {
        ArrayList<LoaiSachDTO> listLoaiSach = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSachDTO loaiSach = new LoaiSachDTO();
                loaiSach.setMaLoaiSach(rs.getInt("MaLoaiSach"));
                loaiSach.setTenLoaiSach(rs.getString("TenLoaiSach"));
                listLoaiSach.add(loaiSach);
            }
            closeCn(cn, ps, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLoaiSach;
    }
    
        public ArrayList<LoaiSachDTO> getAll () {
        ArrayList<LoaiSachDTO> listLoaiSach = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSachDTO loaiSach = new LoaiSachDTO();
                loaiSach.setMaLoaiSach(rs.getInt("MaLoaiSah"));
                loaiSach.setTenLoaiSach(rs.getString("TenLoaiSach"));
                listLoaiSach.add(loaiSach);
            }
            closeCn(cn, ps, rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listLoaiSach;
    }
}