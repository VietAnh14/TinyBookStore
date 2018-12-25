/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.BaoCaoTonDTO;
import DAL.BaoCaoTonDAL;
import java.util.ArrayList;

/**
 *
 * @author HUY
 */
public class BaoCaoTonBLL {
    BaoCaoTonDAL BaoCaoTonDAL = new BaoCaoTonDAL();

    public ArrayList<BaoCaoTonDTO> getAll() {
        return BaoCaoTonDAL.getAll();
    }
    
    public ArrayList<BaoCaoTonDTO> getBaoCao(BaoCaoTonDTO BC) {
        return BaoCaoTonDAL.getBaoCao( BC);
    }
    public boolean checkTT(String a, String b)
        {
            if (a == "" || b == "")
                return true;
            try
            {
                Integer.parseInt(a);
                Integer.parseInt(b);
            }
            catch(NumberFormatException e)
            {
                return true;
            }
            if (Integer.parseInt(a) > 12 || Integer.parseInt(b) < 0)
                return true;
            return false;
        }
}
