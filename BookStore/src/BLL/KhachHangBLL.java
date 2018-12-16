/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.KhachHangDTO;
import DAL.KhachHangDAL;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class KhachHangBLL {
    private KhachHangDAL KhachHangDAL = new KhachHangDAL();
    public ArrayList<KhachHangDTO> getAll(){
        return KhachHangDAL.getAll();
    }
    
    public boolean insertKH(KhachHangDTO KhachHang) {
        return KhachHangDAL.insertKH(KhachHang);
    }
    
    public Integer generateId() {
        return KhachHangDAL.generateId();
    }
    
    public boolean checkValid(KhachHangDTO KhachHang) {
        if (KhachHang.GetHoten().trim().isEmpty() || KhachHang.GetSDT().trim().isEmpty() || KhachHang.GetMaKH() < 0 ||
                KhachHang.GetEmail().trim().isEmpty() || KhachHang.GetCMND().trim().isEmpty() || KhachHang.GetDiemTichLuy()< 0) {
            // need to check with QuyDinh
            return false;
        }
        return true;
    }
    
    public boolean updateKH(KhachHangDTO KhachHang) {
        return KhachHangDAL.updatetKH(KhachHang);
    }
    
    public ArrayList<KhachHangDTO> searchByName (String name) {
        return KhachHangDAL.searchByName(name);
    }
    
    public boolean getById(KhachHangDTO KH, int Id) {
        return KhachHangDAL.getById(KH, Id);
    }
}
