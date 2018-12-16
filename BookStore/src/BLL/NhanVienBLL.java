/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.NhanVienDTO;
import DAL.NhanVienDAL;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class NhanVienBLL {
    private NhanVienDAL NhanVienDAL = new NhanVienDAL();
    public ArrayList<NhanVienDTO> getAll(){
        return NhanVienDAL.getAll();
    }
    
    public boolean insertNV(NhanVienDTO NhanVien) {
        return NhanVienDAL.insertNV(NhanVien);
    }
    
    public Integer generateId() {
        return NhanVienDAL.generateId();
    }
    
    public boolean checkValid(NhanVienDTO NhanVien) {
        if (NhanVien.GetHoten().trim().isEmpty() || NhanVien.GetSDT().trim().isEmpty() || NhanVien.GetMaNV() < 0 ||
                NhanVien.GetDiaChi().trim().isEmpty() || NhanVien.GetCMND().trim().isEmpty()) {
            // need to check with QuyDinh
            return false;
        }
        return true;
    }
    
    public boolean updateNV(NhanVienDTO NhanVien) {
        return NhanVienDAL.updateNV(NhanVien);
    }
    public boolean sathaiNV(NhanVienDTO NhanVien) {
        return NhanVienDAL.sathaiNV(NhanVien);
    }
    public ArrayList<NhanVienDTO> searchByName (String name) {
        return NhanVienDAL.searchByName(name);
    }
    
    public boolean getById(NhanVienDTO NV, int Id) {
        return NhanVienDAL.getById(NV, Id);
    }
}
