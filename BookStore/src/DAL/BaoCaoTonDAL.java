/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.BaoCaoDoanhThuDTO;
import DTO.BaoCaoTonDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author HUY
 */
public class BaoCaoTonDAL extends ConnectDB {
    
    public ArrayList<BaoCaoTonDTO> getAll() {
        ArrayList<BaoCaoTonDTO> listBaoCao = new ArrayList<>();
        String sql = "SELECT * FROM BAOCAOTON ";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BaoCaoTonDTO BaoCaoTonDTO = new BaoCaoTonDTO();
                BaoCaoTonDTO.SetID(rs.getInt("ID"));
                BaoCaoTonDTO.SetMaSach(rs.getInt("MaSach"));
                BaoCaoTonDTO.SetTonDau(rs.getInt("TonDau"));
                BaoCaoTonDTO.SetTonPhatSinh(rs.getInt("TonPhatSinh"));
                BaoCaoTonDTO.SetTonCuoi(rs.getInt("TonCuoi"));
                BaoCaoTonDTO.SetThang(rs.getInt("Thang"));
                BaoCaoTonDTO.SetNam(rs.getInt("Nam"));
                listBaoCao.add(BaoCaoTonDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getClose();
        return listBaoCao;
    }
    
    public ArrayList<BaoCaoTonDTO> getBaoCao(BaoCaoTonDTO BC) {
        ArrayList<BaoCaoTonDTO> listBaoCao = new ArrayList<>();
        String sql = "SELECT MaSach,TonDau,TonPhatSinh,TonCuoi FROM BAOCAOTON WHERE Thang = ? AND Nam = ?";
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, BC.GetThang());
            ps.setInt(2, BC.GetNam());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BaoCaoTonDTO bct = new BaoCaoTonDTO();
                bct.SetMaSach(rs.getInt("MaSach"));
                bct.SetTonDau(rs.getInt("TonDau"));
                bct.SetTonPhatSinh(rs.getInt("TonPhatSinh"));
                bct.SetTonCuoi(rs.getInt("TonCuoi"));
                listBaoCao.add(bct);
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }  
          getClose();
          return listBaoCao;
    }
}
