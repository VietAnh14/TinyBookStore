/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.AccountDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Viet Anh
 * @author HUY
 */
public class AccountDAL extends ConnectDB {

    public Integer login(AccountDTO account) {
        String sql = "SELECT * FROM ACCOUNT WHERE TenTaiKhoan = ? AND MatKhau = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, account.getTenTaiKhoan());
            ps.setString(2, account.getMatKhau());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                account.setTenTaiKhoan(rs.getString("TenTaiKhoan"));
                account.setChucVu(rs.getString("ChucVu"));
                account.setMatKhau("MatKhau");
                account.setMaNV(rs.getInt("MaNV"));
                closeCn(cn, ps, rs);
                return 1000; // TRUE
            }
            closeCn(cn, ps, rs);
            return 1001; // FALSE
        } catch (Exception e) {
            e.printStackTrace();
            closeCn(cn, null, null);
            return 1002; // DATABASE EXCEPTION

        }
    }
    //kiểm tra đăng nhập
    public boolean checkLogin(Integer MaNV, String pass){
        String SQL = "select * from ACCOUNT where MaNV= ? and MatKhau=? ";
        try{
            getConnection();
            PreparedStatement ps = cn.prepareStatement(SQL);
            ps.setInt(1, MaNV);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if(rs!=null&&rs.next())
                return true;
            getClose();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    //sửa mật khâu
    public boolean  suaMatKhau(Integer MaNV, String matkhau){
        String sql = "UPDATE ACCOUNT SET MatKhau = ? WHERE MaNV = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1,matkhau );                       
            ps.setInt(2, MaNV);
            
            int rs = ps.executeUpdate();
            if (rs != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
