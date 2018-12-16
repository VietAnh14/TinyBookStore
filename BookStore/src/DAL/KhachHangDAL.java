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
/**
 *
 * @author QuyNam
 */
public class KhachHangDAL extends ConnectDB{
    // Hàm getInfoKH trong form tạo đơn hàng
    public boolean GetInfoKH(KhachHangDTO a){
        boolean check = false;
        try{
            getConnection();
            String strCall = "{call Info_KhachHang(?)}"; 
            CallableStatement caSt = cn.prepareCall(strCall); 
            caSt.setString(1, Integer.toString(a.getMaKH())); 
            ResultSet rs = caSt.executeQuery();

            while (rs.next()){

                a.setHoTen(rs.getString("HoTen"));
                a.setSDT(rs.getInt("SDT"));
                a.setDiemTichLuy(rs.getInt("DiemTichLuy"));
                
                check = true;
            }
            getClose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return check;
    }
    
}
