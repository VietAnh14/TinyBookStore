/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.PhieuNhapDAL;

/**
 *
 * @author Viet Anh
 */
public class PhieuNhapBLL {
    private final PhieuNhapDAL phieuNhapDAL = new PhieuNhapDAL();
    
    public Integer generateId() {
        return phieuNhapDAL.getIdMax() + 1;
    }
}
