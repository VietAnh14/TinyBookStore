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
import DTO.HoaDonDTO;


public class HoaDonDAL extends ConnectDB {
    // hàm tìm mã hóa đơn thích hợp
    public int GetMaHD (){
        int makh = -1;
        try{
            getConnection();
            String sql = "EXEC dbo.TIM_MAHD"; 
            Statement stat = cn.createStatement();  
            ResultSet rs = stat.executeQuery(sql);     

            while (rs.next()){
                makh = rs.getInt(1);
            }
            getClose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return makh;
    }
   
    public boolean TaoHD(HoaDonDTO hd){
        try{
            getConnection();
            String strCall = "{call TAO_HOADON(?,?,?,?,?)}";
            CallableStatement caSt = cn.prepareCall(strCall);
            caSt.setString(1,Integer.toString(hd.getMaHD()));
            caSt.setString(2,Integer.toString(hd.getMaNv()));
            caSt.setString(3,Integer.toString(hd.getMaKH()));
            caSt.setString(4,Integer.toString(hd.getTriGia()));
            caSt.setString(5,Integer.toString(hd.getTienDiemTichLuy()));
            caSt.execute();
            return true;
        }
         catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
    
    public boolean XoaHD(HoaDonDTO hd){
        try{
            getConnection();
            String strCall = "{call XOAHD(?)}";
            CallableStatement caSt = cn.prepareCall(strCall);
            caSt.setString(1,Integer.toString(hd.getMaHD()));
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
    }
    
    
}
