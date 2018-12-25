/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;


import DTO.KhachHangDTO;
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
public class KhachHangDAL extends ConnectDB {
    private final String GET_ALL = "SELECT  * FROM KHACHHANG";
/**
 *
 * @author QuyNam
*/
    //  getInfoKH form 
    public boolean GetInfoKH(KhachHangDTO a){
        boolean check = false;
        try{
            getConnection();
            String strCall = "{call Info_KhachHang(?)}"; 
            CallableStatement caSt = cn.prepareCall(strCall); 
            caSt.setString(1, Integer.toString(a.GetMaKH())); 
            ResultSet rs = caSt.executeQuery();

            while (rs.next()){

                a.SetHoten(rs.getString("HoTen"));
                a.SetSDT(rs.getString("SDT"));
                a.SetDiemTichLuy(rs.getInt("DiemTichLuy"));

                
 
                
                check = true;
                return check;
            }
            getClose();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        return check;
    }

    public boolean getById(KhachHangDTO KhachHang,int Id) {
        String sql = "SELECT * FROM KHACHHANG WHERE MaKH = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                KhachHang.SetMaKH(rs.getInt("MaKH"));
                KhachHang.SetHoten(rs.getString("HoTen"));
                KhachHang.SetSDT(rs.getString("SDT"));
                KhachHang.SetEmail(rs.getString("Email"));
                KhachHang.SetNgaySinh(rs.getDate("NgaySinh"));
                KhachHang.SetDiemTichLuy(rs.getInt("DiemTichLuy"));
                KhachHang.SetCMND(rs.getString("CMND"));
                closeCn(cn, ps, rs);
                return true;
            }
            return false;
         } catch (SQLException e) {
            getClose();
            return false;
         }  
    }

    public ArrayList<KhachHangDTO> getAll() {
        ArrayList<KhachHangDTO> listKhachHang = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangDTO KhachHang = new KhachHangDTO();
                KhachHang.SetMaKH(rs.getInt("MaKH"));
                KhachHang.SetHoten(rs.getString("HoTen"));
                KhachHang.SetSDT(rs.getString("SDT"));
                KhachHang.SetEmail(rs.getString("Email"));
                KhachHang.SetNgaySinh(rs.getDate("NgaySinh"));
                KhachHang.SetDiemTichLuy(rs.getInt("DiemTichLuy"));
                KhachHang.SetCMND(rs.getString("CMND"));
                listKhachHang.add(KhachHang);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
        }
        return listKhachHang;
    }

    public int getIdByName(String name) {
        String sql = "SELECT MaKH FROM KHACHHANG WHERE HoTen = ?";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MaKH");
                closeCn(cn, ps, rs);
            }
        } catch (SQLException e) {
        }

        return id;
    }

    public Integer generateId() {
        String sql = "SELECT MAX(MaKH) AS MaxId FROM KHACHHANG";
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

    public boolean insertKH(KhachHangDTO KhachHang) {
        String sql = "INSERT INTO KHACHHANG (HoTen,SDT,Email,CMND,NgaySinh) VALUES (?,?,?,?,?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, KhachHang.GetHoten());
            ps.setString(2, KhachHang.GetSDT());
            ps.setString(3, KhachHang.GetEmail());
            ps.setString(4, KhachHang.GetCMND());
            Format formatter = new SimpleDateFormat("MM-dd-yyyy");
            String s = formatter.format(KhachHang.GetNgaySinh());
            ps.setString(5, s);
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
        }

        return false;
    }

    public boolean updatetKH(KhachHangDTO KhachHang) {
        String sql = "UPDATE KHACHHANG SET HoTen = ?,SDT = ?, Email = ?,CMND = ?,NgaySinh = ? WHERE MaKH = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, KhachHang.GetHoten());
            
            ps.setString(2, KhachHang.GetSDT());
            ps.setString(3, KhachHang.GetEmail());
            ps.setString(4, KhachHang.GetCMND());
            Format formatter = new SimpleDateFormat("MM-dd-yyyy");
            String s = formatter.format(KhachHang.GetNgaySinh());
            ps.setString(5, s);
            
            
            
            
            ps.setInt(6, KhachHang.GetMaKH());
            
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean updatetDTL(Integer a,KhachHangDTO KH) {
        String sql = "UPDATE KHACHHANG SET DiemTichLuy = ? WHERE MaKH = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, a);                       
            ps.setInt(2, KH.GetMaKH());
            
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public ArrayList<KhachHangDTO> searchByName(String name) {
        String sql = "SELECT * FROM KHACHHANG WHERE HoTen LIKE N'%"+name+"%'";
        ArrayList<KhachHangDTO> listKhachHang = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangDTO KH = new KhachHangDTO();
                KH.SetMaKH(rs.getInt("MaKH"));
                KH.SetHoten(rs.getString("HoTen"));
                KH.SetSDT(rs.getString("SDT"));
                KH.SetEmail(rs.getString("Email"));
                KH.SetCMND(rs.getString("CMND"));
                KH.SetNgaySinh(rs.getDate("NgaySinh"));
                listKhachHang.add(KH);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            e.printStackTrace();
            getClose();
        }
        return listKhachHang;
    }
    
}
