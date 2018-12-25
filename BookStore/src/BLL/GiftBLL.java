/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.GiftDTO;
import DAL.GiftDAL;
import java.util.ArrayList;
/**
 *
 * @author HUY
 */
public class GiftBLL {
    private GiftDAL GiftDAL = new GiftDAL();
    public ArrayList<GiftDTO> getAll(){
        return GiftDAL.getAll();
    }
    
    public boolean insertGift(GiftDTO Gift) {
        return GiftDAL.insertGift(Gift);
    }
    
    public Integer generateId() {
        return GiftDAL.generateId();
    }
    
    /*public boolean checkValid(GiftDTO Gift) {
        if (Gift.GetHoten().trim().isEmpty() || Gift.GetSDT().trim().isEmpty() || Gift.Gift() < 0 ||
                Gift.GetEmail().trim().isEmpty() || Gift.GetCMND().trim().isEmpty() || Gift.GetDiemTichLuy()< 0) {
            // need to check with QuyDinh
            return false;
        }
        return true;
    }*/
    
    public boolean updateGift(GiftDTO Gift) {
        return GiftDAL.updatetGift(Gift);
    }
    
    public ArrayList<GiftDTO> searchByName (String name) {
        return GiftDAL.searchByName(name);
    }
    
    public boolean getById(GiftDTO Gift, int Id) {
        return GiftDAL.getById(Gift, Id);
    }
    /*public boolean getInfoGift(GiftDTO Gift)
    {
        return GiftDAL.GetInfoGift(Gift);
    }*/ 
}
