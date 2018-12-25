/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.CTHDDTO;
import DAL.CTHDDAL;

/**
 *
 * @author DaoLam
 */
public class CTHDBLL {
    CTHDDAL cthdDAL = new CTHDDAL();
    
    public boolean TaoCTHD(CTHDDTO ct){
    return cthdDAL.TaoCTHD(ct);
    }
}
