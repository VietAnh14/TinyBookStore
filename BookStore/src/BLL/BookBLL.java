/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import DTO.BookDTO;
import DAL.BookDAL;
import java.util.ArrayList;
/**
 *
 * @author Viet Anh
 */
public class BookBLL {
    private BookDAL bookDAL = new BookDAL();
    public ArrayList<BookDTO> getAll(){
        return bookDAL.getAll();
    }
}
