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
    
    public boolean insertBook(BookDTO book) {
        return bookDAL.insertBook(book);
    }
    
    public Integer generateId() {
        return bookDAL.generateId();
    }
    
    public boolean checkValid(BookDTO book) {
        if (book.getTacGia().trim().isEmpty() || book.getTenSach().trim().isEmpty() || book.getGiaBan() < 0 ||
                book.getMaLoaiSach() < 0 || book.getSoLuong() < 0 || book.getMaNXB() < 0) {
            // need to check with QuyDinh
            return false;
        }
        return true;
    }
    
    public boolean updateBook(BookDTO book) {
        return bookDAL.updateBook(book);
    }
    
    public ArrayList<BookDTO> searchByName (String name) {
        return bookDAL.searchByName(name);
    }
    

}
