/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.HoaDonDTO;
import DAL.HoaDonDAL;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author DaoLam
 */
public class HoaDonBLL {
    private HoaDonDAL hoadonDAL = new HoaDonDAL();
    
    
    
    
    public int GetMaHD(){
    return hoadonDAL.GetMaHD();
    }
    public boolean TaoHD(HoaDonDTO hd){
    return hoadonDAL.TaoHD(hd);
    }
    public boolean XoaHD(HoaDonDTO hd){
    return hoadonDAL.XoaHD(hd);
    }
    public ArrayList<HoaDonDTO> getHoaDon_MaHD(int mahd){
        return hoadonDAL.getHoaDon_MaHD(mahd);
    }
    public ArrayList<HoaDonDTO> getHoaDon_MaNV(int manv){
        return hoadonDAL.getHoaDon_MaNV(manv);
    }
    public ArrayList<HoaDonDTO> getHoaDon_MaKH(int makh){
        return hoadonDAL.getHoaDon_MaKH(makh);
    }
        public ArrayList<HoaDonDTO> getHoaDon_NgHD(String nghd){
        return hoadonDAL.getHoaDon_NgHD(nghd);
    }
    public ArrayList<HoaDonDTO> getHoaDon_LonHon(int trigia){
        return hoadonDAL.getHoaDon_LonHon(trigia);
    }
    public ArrayList<HoaDonDTO> getHoaDon_NhoHon(int trigia){
        return hoadonDAL.getHoaDon_NhoHon(trigia);
    }
    public ArrayList<HoaDonDTO> getHoaDon_Bang(int trigia){
        return hoadonDAL.getHoaDon_Bang(trigia);
    }
}
