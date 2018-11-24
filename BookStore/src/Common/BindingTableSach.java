/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import BLL.BookBLL;
import BLL.LoaiSachBLL;
import BLL.NXBBLL;
import DTO.BookDTO;
import DTO.LoaiSachDTO;
import DTO.NXBDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Viet Anh
 */
public class BindingTableSach {
    BookBLL bookBLL = new BookBLL();
    LoaiSachBLL loaiSachBLL = new LoaiSachBLL();
    NXBBLL nxbbll = new NXBBLL();
    
    public void binding(JTable tableSach) {
        ArrayList<BookDTO> listBook = bookBLL.getAll();
        ArrayList<LoaiSachDTO> listLoaiSach = new ArrayList<>();
        ArrayList<NXBDTO> listNXB = new ArrayList<>();
        Vector header = new Vector();
        header.add("Mã sách");
        header.add("Tên sách");
        header.add("Thể loại");
        header.add("Tác giả");
        header.add("Gía");
        header.add("Số lượng");
        header.add("Nhà xuất bản");
        
        Vector data =new Vector();
        for(BookDTO book : listBook) {
            Vector row = new Vector();
            row.add(book.getMaSach());
            row.add(book.getTenSach());
            listLoaiSach = loaiSachBLL.getById(book.getMaLoaiSach());
            row.add(listLoaiSach.get(0).getTenLoaiSach());
            row.add(book.getTacGia());
            row.add(book.getGiaBan());
            row.add(book.getSoLuong());
            listNXB = nxbbll.getById(book.getMaNXB());
            row.add(listNXB.get(0).getTenNXB());
            data.add(row);
        }
        
        DefaultTableModel dft = new DefaultTableModel(data, header){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        tableSach.setModel(dft);
    }
    
    
}
