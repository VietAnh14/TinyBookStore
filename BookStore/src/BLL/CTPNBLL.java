/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.CTPNDAL;
import DTO.CTPNDTO;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class CTPNBLL {
    private final CTPNDAL ctpndal = new CTPNDAL();
   public boolean insertListCTPN(ArrayList<CTPNDTO> listCtpn) {
       return ctpndal.insertListCTPN(listCtpn);
   }
   
   public boolean getByIdPN(ArrayList<CTPNDTO> listCtpn, String idPN) {
       return ctpndal.getByIdPN(listCtpn, idPN);
   }
   
   public boolean insertCTPN(CTPNDTO ctpn) {
       return ctpndal.insertCTPN(ctpn);
   }
   
      public boolean deleteCTPN(String maPN, String maSach) {
       return ctpndal.deleteCTPN(maPN, maSach);
   }
      
      public boolean updateCTPN(CTPNDTO ctpn) {
          return ctpndal.updateCTPN(ctpn);
      }
}
