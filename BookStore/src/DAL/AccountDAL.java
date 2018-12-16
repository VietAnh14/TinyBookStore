/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.AccountDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Viet Anh
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
}
