/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.KhachHangDTO;
import DAL.KhachHangDAL;
/**
 *
 * @author QuyNam
 */
public class KhachHangBLL {
    KhachHangDAL kh = new KhachHangDAL();
    public boolean getInfoKhachHang(KhachHangDTO a){
        return kh.GetInfoKH(a);
    }
}
