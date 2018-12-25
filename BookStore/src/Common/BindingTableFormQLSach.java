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
public class BindingTableFormQLSach {
    
    BookBLL bookBLL = new BookBLL();
    LoaiSachBLL loaiSachBLL = new LoaiSachBLL();
    NXBBLL nxbbll = new NXBBLL();
    
    public void bindingtblSach(JTable tableSach, ArrayList<BookDTO> listBook) {
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
        
        Vector data = new Vector();
        for (BookDTO book : listBook) {
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
        
        DefaultTableModel dft = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        tableSach.setModel(dft);
    }
    
    public void bindingtblTheLoai(JTable table, ArrayList<LoaiSachDTO> listLoaiSach) {
        ArrayList<LoaiSachDTO> listTheLoai = new ArrayList<>();
        Vector header = new Vector();
        header.add("Mã loại");
        header.add("Thể loại");
        
        Vector data = new Vector();
        for (LoaiSachDTO loaiSach : listLoaiSach) {
            Vector row = new Vector();
            row.add(loaiSach.getMaLoaiSach());
            row.add(loaiSach.getTenLoaiSach());
            data.add(row);
        }
        
        DefaultTableModel dfModelTheLoai = new DefaultTableModel(data, header){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        table.setModel(dfModelTheLoai);
    }
    
        public void bindingtblNXB(JTable table, ArrayList<NXBDTO> listNXB) {
        Vector header = new Vector();
        header.add("Mã NXB");
        header.add("Tên");
        header.add("Địa chỉ");
        header.add("SĐT");
       
        Vector data = new Vector();
        for (NXBDTO nxb : listNXB) {
            Vector row = new Vector();
            row.add(nxb.getMaNXB());
            row.add(nxb.getTenNXB());
            row.add(nxb.getDiaChi());
            row.add(nxb.getSDT());
            data.add(row);
        }
        
        DefaultTableModel dfModelNXB = new DefaultTableModel(data, header){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        table.setModel(dfModelNXB);
    }
}
