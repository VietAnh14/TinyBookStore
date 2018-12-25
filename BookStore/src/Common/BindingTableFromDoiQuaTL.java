/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;
import BLL.GiftBLL;
import DTO.GiftDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HUY
 */
public class BindingTableFromDoiQuaTL {
    GiftBLL GiftBLL = new GiftBLL();
    
    public void bindingtbQua(JTable jTableQua, ArrayList<GiftDTO> listGift) {
        Vector header = new Vector();
        header.add("Mã qùa");
        header.add("Mức điểm");
        header.add("Tên quà");
        
        Vector data = new Vector();
        for (GiftDTO Gift : listGift) {
            Vector row = new Vector();
            row.add(Gift.getMaQua());
            row.add(Gift.getMucDiem());
            row.add(Gift.GetTenQua());
            data.add(row);
        }
        
        DefaultTableModel dft = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        jTableQua.setModel(dft);
    }

}
