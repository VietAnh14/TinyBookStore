/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;
import BLL.KhachHangBLL;
import DTO.KhachHangDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HUY
 */
public class BindingTableFromQLKH {
    KhachHangBLL KhachHangBLL = new KhachHangBLL();
    
    public void bindingtbQLKH(JTable jTableKH, ArrayList<KhachHangDTO> listKhachHang) {
        Vector header = new Vector();
        header.add("Mã khách hàng");
        header.add("Tên khách hàng");
        header.add("Số điện thoại");
        header.add("Email");
        header.add("CMND");
        header.add("Ngày sinh");
        header.add("Điểm tích lũy");
        
        Vector data = new Vector();
        for (KhachHangDTO KhachHang : listKhachHang) {
            Vector row = new Vector();
            row.add(KhachHang.GetMaKH());
            row.add(KhachHang.GetHoten());
            row.add(KhachHang.GetSDT());
            row.add(KhachHang.GetEmail());
            row.add(KhachHang.GetCMND());
            row.add(KhachHang.GetNgaySinh());
            row.add(KhachHang.GetDiemTichLuy());
            data.add(row);
        }
        
        DefaultTableModel dft = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jTableKH.setModel(dft);
    }
}
