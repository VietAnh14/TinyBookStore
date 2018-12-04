/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CtyDAL;
import DTO.CongTyDTO;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class CongTyBLL {
    private final CtyDAL ctyDAL = new CtyDAL();
    public boolean getAll(ArrayList<CongTyDTO> listCongTy) {
        return ctyDAL.getAll(listCongTy);
    }
    
    public boolean  getById(CongTyDTO congTyDTO, Integer id) {
        return ctyDAL.getById(congTyDTO, id);
    }
}
