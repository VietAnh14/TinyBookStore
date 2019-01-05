/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import DTO.CTHDDTO;
import DTO.HoaDonDTO;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DaoLam
 */
public class BindingTableFormQLHD {
        
    public void bindingtblHoaDon(JTable tableSach, ArrayList<HoaDonDTO> listHD) {
        Vector header = new Vector();
        header.add("Mã Hóa Đơn");
        header.add("Mã Nhân Viên");
        header.add("Mã Khách Hàng");
        header.add("Ngày Lập Hóa Đơn");
        header.add("Trị Giá");
        header.add("Điểm Tích Lũy");
        
        Vector data = new Vector();
        for (HoaDonDTO hd : listHD) {
            Vector row = new Vector();
            row.add(hd.getMaHD());
            row.add(hd.getMaNv());
            row.add(hd.getMaKH());
            row.add(hd.getNgHD());
            row.add(hd.getTriGia());
            row.add(hd.getDiemTichLuy());
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
    
        public void bindingtblCTHD(JTable tableSach, ArrayList<CTHDDTO> CTHD) {
        Vector header = new Vector();
        header.add("Mã Hóa Đơn");
        header.add("Mã Sách");
        header.add("Số Lượng");
        header.add("Thành Tiền");


        Vector data = new Vector();
        for (CTHDDTO cthd : CTHD) {
            Vector row = new Vector();
            row.add(cthd.getMaHD());
            row.add(cthd.getMaSach());
            row.add(cthd.getSoLuong());
            row.add(cthd.getThanhTien());
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
