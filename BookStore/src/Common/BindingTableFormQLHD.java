/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

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
            row.add(hd.getTienDiemTichLuy());
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
