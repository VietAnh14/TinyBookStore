/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVienDTO;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author HUY
 */
public class NhanVienDAL extends ConnectDB {
    private final String GET_ALL = "SELECT  * FROM NHANVIEN";
    public boolean GetInfoNV(NhanVienDTO a) throws ParseException{
        boolean check = false;
        try{
            getConnection();
            String strCall = "{call Info_NhanVien(?)}"; 
            CallableStatement caSt = cn.prepareCall(strCall); 
            caSt.setString(1, Integer.toString(a.GetMaNV())); 
            ResultSet rs = caSt.executeQuery();

            while (rs.next()){

                a.SetHoten(rs.getString("HoTen"));
                a.SetSDT(rs.getString("SDT"));
                a.SetCMND(rs.getString("CMND"));
                a.SetDiaChi(rs.getString("DiaChi"));
                a.SetNgaySinh(rs.getDate("NgaySinh"));
                check = true;
            }
            getClose();
        }
        catch(SQLException e){
        }
        
        return check;
    }
    public boolean getById(NhanVienDTO NhanVien,int Id) {
        String sql = "SELECT * FROM NHANVIEN WHERE MaNV = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NhanVien.SetMaNV(rs.getInt("MaNV"));
                NhanVien.SetHoten(rs.getString("HoTen"));
                NhanVien.SetSDT(rs.getString("SDT"));
                NhanVien.SetDiaChi(rs.getString("DiaChi"));
                NhanVien.SetNgaySinh(rs.getDate("NgaySinh"));
                NhanVien.SetCMND(rs.getString("CMND"));
                closeCn(cn, ps, rs);
                return true;
            }
            return false;
         } catch (SQLException e) {
            getClose();
            return false;
         }  
    }

    public ArrayList<NhanVienDTO> getAll() {
        ArrayList<NhanVienDTO> listNhanVien = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienDTO NhanVien = new NhanVienDTO();
                NhanVien.SetMaNV(rs.getInt("MaNV"));
                NhanVien.SetHoten(rs.getString("HoTen"));
                NhanVien.SetSDT(rs.getString("SDT"));
                NhanVien.SetDiaChi(rs.getString("DiaChi"));
                NhanVien.SetNgaySinh(rs.getDate("NgaySinh"));
                NhanVien.SetCMND(rs.getString("CMND"));
                NhanVien.Setdeleted(rs.getBoolean("Deleted"));
                listNhanVien.add(NhanVien);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
        }
        return listNhanVien;
    }

    public int getIdByName(String name) {
        String sql = "SELECT MaNV FROM NHANVIEN WHERE HoTen = ?";
        int id = 0;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("MaNV");
                closeCn(cn, ps, rs);
            }
        } catch (SQLException e) {
        }

        return id;
    }

    public Integer generateId() {
        String sql = "SELECT MAX(MaNV) AS MaxId FROM NHANVIEN";
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

    public boolean insertNV(NhanVienDTO NhanVien) {
        String sql = "INSERT INTO NHANVIEN (HoTen,SDT,CMND,DiaChi,NgaySinh) VALUES (?,?,?,?,?)";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, NhanVien.GetHoten());
            ps.setString(2, NhanVien.GetSDT());
            ps.setString(3, NhanVien.GetCMND());
            ps.setString(4, NhanVien.GetDiaChi());
            Format formatter = new SimpleDateFormat("MM-dd-yyyy");
            String s = formatter.format(NhanVien.GetNgaySinh());
            ps.setString(5, s);
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
        }

        return false;
    }

    public boolean updateNV(NhanVienDTO NhanVien) {
        String sql = "UPDATE NHANVIEN SET HoTen = ?,SDT = ?, CMND = ?,DiaChi = ?,NgaySinh = ? WHERE MaNV = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, NhanVien.GetHoten());
            ps.setString(2, NhanVien.GetSDT());
            ps.setString(3, NhanVien.GetCMND());
            ps.setString(4, NhanVien.GetDiaChi());
            Format formatter = new SimpleDateFormat("MM-dd-yyyy");
            String s = formatter.format(NhanVien.GetNgaySinh());
            ps.setString(5, s);            
            ps.setInt(6, NhanVien.GetMaNV());          
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
        }

        return false;
    }
    public boolean sathaiNV(NhanVienDTO NhanVien) {
        String sql = "UPDATE NHANVIEN SET Deleted =? WHERE MaNV = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            Integer S = null;
            if(NhanVien.Getdeleted()==true)
            {
                S=1;
            ps.setInt(1, S);
            }
            else
            {
                S=0;
                ps.setInt(1, S);

            }
            ps.setInt(2, NhanVien.GetMaNV());          
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
        }

        return false;
    }
    public ArrayList<NhanVienDTO> searchByName(String name) {
        String sql = "SELECT * FROM NHANVIEN WHERE HoTen LIKE N'%"+name+"%'";
        ArrayList<NhanVienDTO> listNhanVien = new ArrayList<>();
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);    
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienDTO NV = new NhanVienDTO();
                NV.SetMaNV(rs.getInt("MaNV"));
                NV.SetHoten(rs.getString("HoTen"));
                NV.SetSDT(rs.getString("SDT"));
                NV.SetDiaChi(rs.getString("DiaChi"));
                NV.SetCMND(rs.getString("CMND"));
                NV.SetNgaySinh(rs.getDate("NgaySinh"));
                NV.Setdeleted(rs.getBoolean("Deleted"));
                listNhanVien.add(NV);
            }
            closeCn(cn, ps, rs);
        } catch (SQLException e) {
            getClose();
        }
        return listNhanVien;
    }
    
   
}
