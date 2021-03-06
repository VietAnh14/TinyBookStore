/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;
import BLL.BaoCaoTonBLL;
import DTO.BaoCaoTonDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import BLL.BaoCaoDoanhThuBLL; 
import DTO.BaoCaoDoanhThuDTO;

/**
 *
 * @author HUY
 */
public class BindingTableFormBaoCao {
    BaoCaoTonBLL BaoCaoTonBLL = new BaoCaoTonBLL();
    BaoCaoDoanhThuBLL BaoCaoDoanhThuBLL = new BaoCaoDoanhThuBLL();
    public void bindingtbBCton(JTable jTableBCTon, ArrayList<BaoCaoTonDTO> listBC) {
        Vector header = new Vector();
        header.add("Mã sách");
        header.add("Tồn đầu");
        header.add("Phát sinh");
        header.add("Tồn cuối");
        
        Vector data = new Vector();
        for (BaoCaoTonDTO BC : listBC) {
            Vector row = new Vector();
            row.add(BC.GetMaSach());
            row.add(BC.GetTonDau());
            row.add(BC.GetTonPhatSinh());
            row.add(BC.GetTonCuoi());
            data.add(row);
        }
        
        DefaultTableModel dft = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jTableBCTon.setModel(dft);
    }
    public void bindingtbBCDT(JTable jTableBCDT, ArrayList<BaoCaoDoanhThuDTO> listBC) {
        Vector header = new Vector();
        header.add("Từ ngày");
        header.add("Đến ngày");
        header.add("Ngày lập");
        header.add("Tổng thu");
        
        Vector data = new Vector();
        for (BaoCaoDoanhThuDTO BC : listBC) {
            Vector row = new Vector();
            row.add(BC.getTuNgay());
            row.add(BC.getDenNgay());
            row.add(BC.getNgayLap());
            row.add(BC.getTongThu());
            data.add(row);
        }
        
        DefaultTableModel dft = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jTableBCDT.setModel(dft);
    }
}
