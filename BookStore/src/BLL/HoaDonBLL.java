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
    
    public Integer generateId() {
        return hoadonDAL.generateId();
    }

    public boolean insertHD(HoaDonDTO hd) {
        return hoadonDAL.insertHD(hd);
    }

    public boolean updateDTL(Integer dtl, Integer maKH) {
        return hoadonDAL.updateDTL(dtl, maKH);
    }
    
        public Float getQD() {
            return hoadonDAL.getQD();
        }
}
