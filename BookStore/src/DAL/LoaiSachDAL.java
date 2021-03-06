/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiSachDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sun.security.rsa.RSACore;

/**
 *
 * @author Viet Anh
 */
public class LoaiSachDAL extends ConnectDB {

    private final String GET_BY_ID = "SELECT  * FROM LoaiSach WHERE MaLoaiSach = ?";
    private final String GET_ALL = "SELECT  * FROM LoaiSach";

    public ArrayList<LoaiSachDTO> getById(int id) {
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listLoaiSach;
    }

    public ArrayList<LoaiSachDTO> getAll() {
        ArrayList<LoaiSachDTO> listLoaiSach = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiSachDTO loaiSach = new LoaiSachDTO();
                loaiSach.setMaLoaiSach(rs.getInt("MaLoaiSach"));
                loaiSach.setTenLoaiSach(rs.getString("TenLoaiSach"));
                listLoaiSach.add(loaiSach);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listLoaiSach;
    }

    public int getIdByName(String name) {
        String sql = "SELECT MaLoaiSach FROM LoaiSach WHERE TenLoaiSach = ?";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MaLoaiSach");
                closeCn(cn, ps, rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return id;
    }

//    public Integer generateId() {
//        String sql = "SELECT MAX(MaLoaiSach) AS MaxId FROM LoaiSach";
//        int id = 0;
//        try {
//            getConnection();
//            PreparedStatement ps = cn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                id = rs.getInt("MaxId") + 1;
//                closeCn(cn, ps, rs);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return id;
//    }

    public boolean insertTL(LoaiSachDTO loaiSach) {
        String sql = "INSERT INTO LOAISACH (TenLoaiSach) VALUES (?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, loaiSach.getTenLoaiSach());
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean updatetTL(LoaiSachDTO loaiSach) {
        String sql = "UPDATE LOAISACH SET TenLoaiSach = ? WHERE MaLoaiSach = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, loaiSach.getTenLoaiSach());
            ps.setInt(2, loaiSach.getMaLoaiSach());
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
