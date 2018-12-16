/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DTO.BookCartDTO;


/**
 *
 * @author DaoLam
 */
public class BindingTableFormTaoDonHang {
    
    
        public void bindingtblSach(JTable tableSach, ArrayList<BookCartDTO> listBook) {
        Vector header = new Vector();
        header.add("Mã sách");
        header.add("Tên sách");
        header.add("Tác giả");
        header.add("Đơn Giá");
        header.add("Số lượng");
        header.add("Thành Tiền");
        
        Vector data = new Vector();
        for (BookCartDTO book : listBook) {
            Vector row = new Vector();
            row.add(book.getMaSach());
            row.add(book.getTenSach());
            row.add(book.getTacGia());
            row.add(book.getGiaBan());
            row.add(book.getSoLuong());
            row.add(book.getThanhTien());
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
}
