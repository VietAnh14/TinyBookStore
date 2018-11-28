/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.BookCartDTO;
import DAL.BookCartDAL;
import java.util.ArrayList;

/**
 *
 * @author DaoLam
 */
public class BookCartBLL {
        BookCartDAL bookcartDAL = new BookCartDAL();
        public ArrayList<BookCartDTO> addbook(String masach,int sl){
        return bookcartDAL.addbook(masach,sl);
    }
    
}
