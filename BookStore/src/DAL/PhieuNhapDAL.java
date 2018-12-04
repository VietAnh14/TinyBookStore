/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Viet Anh
 */
public class PhieuNhapDAL extends ConnectDB {

    public Integer getIdMax() {
        String sql = " SELECT MAX(MaCty) FROM CONGTY";
        Integer id = 0;

        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            getClose();
            id = -2; //FAIL
        }
        
        return id;
    }
}
