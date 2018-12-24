/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.HoaDonDTO;
import DAL.HoaDonDAL;
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
}
