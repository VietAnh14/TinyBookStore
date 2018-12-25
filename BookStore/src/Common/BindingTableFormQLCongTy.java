/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import DTO.CongTyDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sun.management.ManagementFactoryHelper;

/**
 *
 * @author Viet Anh
 */
public class BindingTableFormQLCongTy {
    public void bindingTbleCty(JTable tableCty, ArrayList<CongTyDTO> listCty) {
        Vector header = new Vector();
        header.add("Mã công ty");
        header.add("Tên công ty");
        header.add("Địa chỉ");
        header.add("SDT");
        Vector data = new Vector();
        for (CongTyDTO cty : listCty) {
            Vector row = new Vector();
            row.add(cty.getMaCty());
            row.add(cty.getTenCty());
            row.add(cty.getDiaChi());
            row.add(cty.getSDT());
            data.add(row);
        }
        
        DefaultTableModel defaultTableModel = new DefaultTableModel(data, header) {
           @Override
           public boolean isCellEditable(int row, int column) {
               return false;
           }
        };
        defaultTableModel.isCellEditable(0, 0);
        tableCty.setModel(defaultTableModel);
    }
}
