/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NXBDAL;
import DTO.NXBDTO;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class NXBBLL {
    private NXBDAL nxbdal = new NXBDAL();
    
        public ArrayList<NXBDTO> getAll() {
            return nxbdal.getAll();
        }
        
        public ArrayList<NXBDTO> getById(Integer id) {
            return nxbdal.getById(id);
        }
        
        public Integer generateId() {
            return nxbdal.generateId();
        }
        
        public int getIdByName(String name) {
            return nxbdal.getIdByName(name);
        }
        
        public boolean updateNXB(NXBDTO nxb) {
            return nxbdal.updateNXB(nxb);
        }
                
        public boolean insertNXB(NXBDTO nxb) {
            return nxbdal.insertNXB(nxb);
        }
}
