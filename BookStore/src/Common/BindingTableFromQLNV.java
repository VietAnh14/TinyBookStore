/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;
import BLL.NhanVienBLL;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HUY
 */
public class BindingTableFromQLNV {
    NhanVienBLL NhanVienBLL = new NhanVienBLL();
    
    public void bindingtbQLNV(JTable jTableNV, ArrayList<NhanVienDTO> listNhanVien) {
        Vector header = new Vector();
        header.add("Mã nhân viên");
        header.add("Tên nhân viên");
        header.add("Số điện thoại");
        header.add("CMND");
        header.add("Địa Chỉ");
        header.add("Ngày sinh");
        header.add("Tình trạng");
        
        Vector data = new Vector();
        for (NhanVienDTO NhanVien : listNhanVien) {
            Vector row = new Vector();
            row.add(NhanVien.GetMaNV());
            row.add(NhanVien.GetHoten());
            row.add(NhanVien.GetSDT());
            row.add(NhanVien.GetCMND());
            row.add(NhanVien.GetDiaChi());
            row.add(NhanVien.GetNgaySinh());
            if(NhanVien.Getdeleted())
            {
                row.add("Nghỉ việc");
            }
            else
            {
                row.add("Bình thường");
            }
            data.add(row);
        }
        
        DefaultTableModel dft = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jTableNV.setModel(dft);
    }
}
