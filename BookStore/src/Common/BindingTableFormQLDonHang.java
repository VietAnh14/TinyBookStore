/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import BLL.BookBLL;
import BLL.LoaiSachBLL;
import BLL.NXBBLL;
import DTO.HoaDonDTO;
import DTO.LoaiSachDTO;
import DTO.NXBDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DaoLam
 */
public class BindingTableFormQLDonHang {

    

    
    BookBLL bookBLL = new BookBLL();
    LoaiSachBLL loaiSachBLL = new LoaiSachBLL();
    NXBBLL nxbbll = new NXBBLL();
    
    public void bindingtblSach(JTable tableSach, ArrayList<HoaDonDTO> listHD) {

        Vector header = new Vector();
        header.add("Mã Hóa Đơn");
        header.add("Mã Khách Hàng");
        header.add("Mã Nhân Viên");
        header.add("Ngày Lập Hóa Đơn");
        header.add("Trị Giá");
        
        Vector data = new Vector();
        for (HoaDonDTO hd : listHD) {
            Vector row = new Vector();
            row.add(hd.getMaHD());
            row.add(hd.getMaKH());
            row.add(hd.getMaNv());
            row.add(hd.getNgHD());
            row.add(hd.getTriGia());
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

