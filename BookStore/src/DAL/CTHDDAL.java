/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author DaoLam
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DTO.CTHDDTO;


public class CTHDDAL extends ConnectDB{
    public boolean insertListCTHD(ArrayList<CTHDDTO> listCTHD) {
        boolean status = false;
        try {
            getConnection();
            Statement stm = cn.createStatement();
            cn.setAutoCommit(false);
            for(CTHDDTO cthd : listCTHD) {
                stm.executeUpdate(cthd.toInsertString());
            }
            cn.commit();
            status = true;
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        getClose();
        return status;
    }
    
}
