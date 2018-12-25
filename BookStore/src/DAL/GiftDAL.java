/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.GiftDTO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author HUY
 */
public class GiftDAL extends ConnectDB {
    public boolean getById(GiftDTO Gift,int Id) {
        String sql = "SELECT * FROM DOIQUA WHERE ID = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Gift.setMaQua(rs.getInt("ID"));
                Gift.setMucDiem(rs.getInt("MucDiem"));
                Gift.SetTenQua(rs.getString("Qua"));
                closeCn(cn, ps, rs);
                return true;
            }
            return false;
         } catch (SQLException e) {
            getClose();
            return false;
         }  
    }

    public ArrayList<GiftDTO> getAll() {
        ArrayList<GiftDTO> listGift = new ArrayList<>();
        try {
            getConnection();
            String sql = "SELECT * FROM DOIQUA";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiftDTO Gift = new GiftDTO();
                Gift.setMaQua(rs.getInt("ID"));
                Gift.setMucDiem(rs.getInt("MucDiem"));
                Gift.SetTenQua(rs.getString("Qua"));
                listGift.add(Gift);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
        }
        return listGift;
    }

    public int getIdByName(String name) {
        String sql = "SELECT ID FROM DOIQUA WHERE MucDiem = ?";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("ID");
                closeCn(cn, ps, rs);
            }
        } catch (SQLException e) {
        }

        return id;
    }

    public Integer generateId() {
        String sql = "SELECT MAX(ID) AS MaxId FROM DOIQUA";
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

    public boolean insertGift(GiftDTO Gift) {
        String sql = "INSERT INTO DOIQUA (MucDiem,Qua) VALUES (?,?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, Gift.getMucDiem());
            ps.setString(2, Gift.GetTenQua());
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
        }

        return false;
    }

    public boolean updatetGift(GiftDTO Gift) {
        String sql = "UPDATE DOIQUA SET Qua = ?,MucDiem = ? WHERE ID = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, Gift.GetTenQua());
            
            ps.setInt(2, Gift.getMucDiem());
            ps.setInt(6, Gift.getMaQua());
            
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public ArrayList<GiftDTO> searchByName(String name) {
        String sql = "SELECT * FROM DOIQUA WHERE Qua LIKE N'%"+name+"%'";
        ArrayList<GiftDTO> listGift = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiftDTO Gift = new GiftDTO();
                Gift.setMaQua(rs.getInt("ID"));
                Gift.SetTenQua(rs.getString("Qua"));
                Gift.setMucDiem(rs.getInt("MucDiem"));
                
                listGift.add(Gift);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
            getClose();
        }
        return listGift;
    }

}
