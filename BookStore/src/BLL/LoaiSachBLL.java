/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiSachDAL;
import DTO.LoaiSachDTO;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class LoaiSachBLL {
    LoaiSachDAL loaiSachDAL  = new LoaiSachDAL();
        public ArrayList<LoaiSachDTO> getById (int id) {
            return loaiSachDAL.getById(id);
        }
        
       public ArrayList<LoaiSachDTO> getAll () {
           return loaiSachDAL.getAll();
       }
       
       public int getIdByName(String name) {
           return loaiSachDAL.getIdByName(name);
       }
       
       public int generateId(){
           return loaiSachDAL.generateId();
       }
}
