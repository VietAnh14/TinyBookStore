/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NXBDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class NXBDAL extends ConnectDB {

    private final String GET_ALL = "SELECT * FROM  NXB";
    private final String GET_BY_ID = "SELECT * FROM NXB WHERE  MaNXB = ?";

    public ArrayList<NXBDTO> getAll() {
        ArrayList<NXBDTO> listNXBDTO = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NXBDTO nxbdto = new NXBDTO();
                nxbdto.setMaNXB(rs.getInt("MaNXB"));
                nxbdto.setTenNXB(rs.getString("TenNXB"));
                nxbdto.setDiaChi(rs.getString("DiaChi"));
                nxbdto.setSDT(rs.getString("SDT"));
                nxbdto.setDeleted(rs.getBoolean("Deleted"));
                listNXBDTO.add(nxbdto);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNXBDTO;
    }

    public ArrayList<NXBDTO> getById(Integer id) {
        ArrayList<NXBDTO> listNXBDTO = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                NXBDTO nxbdto = new NXBDTO();
                nxbdto.setMaNXB(rs.getInt("MaNXB"));
                nxbdto.setTenNXB(rs.getString("TenNXB"));
                nxbdto.setDiaChi(rs.getString("DiaChi"));
                nxbdto.setDiaChi(rs.getString("SDT"));
                nxbdto.setDeleted(rs.getBoolean("Deleted"));
                listNXBDTO.add(nxbdto);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNXBDTO;
    }

    public Integer getIdByName(String name) {
        String sql = "SELECT MaNXB FROM NXB WHERE TENNXB = ?";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MaNXB");
                closeCn(cn, ps, rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    public Integer generateId() {
        String sql = "SELECT MAX(MaNXB) AS MaxId FROM NXB";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MaxId") + 1;
                closeCn(cn, ps, rs);
            }
        } catch (SQLException e) {
        }
        return id;
    }
    
    public boolean insertNXB(NXBDTO nxb) {
        String sql = "INSERT INTO NXB (MaNXB, TenNXB, DiaChi, SDT) VALUES        (?, ?, ?, ?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, nxb.getMaNXB());
            ps.setString(2, nxb.getTenNXB());
            ps.setString(3, nxb.getDiaChi());
            ps.setString(4, nxb.getSDT());
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
        public boolean updateNXB(NXBDTO nxb) {
        String sql = "UPDATE NXB  SET TenNXB = ?, DiaChi = ?, SDT = ? WHERE MaNXB = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nxb.getTenNXB());
            ps.setString(2, nxb.getDiaChi());
            ps.setString(3, nxb.getSDT());
            ps.setInt(4, nxb.getMaNXB());
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
