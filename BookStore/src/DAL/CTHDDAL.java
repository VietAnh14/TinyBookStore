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
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DTO.CTHDDTO;


public class CTHDDAL extends ConnectDB{
    public boolean TaoCTHD(CTHDDTO cthd){
        try{
            getConnection();
            String strCall = "{call TAOCTHD(?,?,?,?)}";
            CallableStatement caSt = cn.prepareCall(strCall);
            caSt.setString(1,Integer.toString(cthd.getMaHD()));
            caSt.setString(2,Integer.toString(cthd.getMaSach()));
            caSt.setString(3,Integer.toString(cthd.getSoLuong()));
            caSt.setString(4,Integer.toString(cthd.getThanhTien()));
            caSt.execute();
            return true;
        }
         catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
    
}
