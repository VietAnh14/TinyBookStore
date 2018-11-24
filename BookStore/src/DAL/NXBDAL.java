/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NXBDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                nxbdto.setDiaChi(rs.getString("SDT"));
                nxbdto.setDeleted(rs.getBoolean("Deleted"));
                listNXBDTO.add(nxbdto);
            }
            closeCn(cn, ps, rs);
        } catch (Exception e) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNXBDTO;
    }
}
