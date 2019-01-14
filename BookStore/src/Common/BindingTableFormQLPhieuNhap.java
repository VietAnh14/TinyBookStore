/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import BLL.CTPNBLL;
import BLL.PhieuNhapBLL;
import DTO.CTPNDTO;
import DTO.PhieuNhapDTO;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Viet Anh
 */
public class BindingTableFormQLPhieuNhap {

    private final PhieuNhapBLL phieuNhapBLL = new PhieuNhapBLL();
    private final CTPNBLL ctpnbll = new CTPNBLL();

    public void bindingTblPhieuNhap(JTable tblPhieuNhap, ArrayList<PhieuNhapDTO> listPhieuNhap, HashMap<String, Integer> mapCty) {
        boolean status = false;
        Vector header = new Vector();
        header.add("Mã PN");
        header.add("Mã NV");
        header.add("Công ty");
        header.add("Trị giá");
        header.add("Ngày nhập");
        Vector data = new Vector();
        for (PhieuNhapDTO phieuNhap : listPhieuNhap) {
            Vector row = new Vector();
            row.add(phieuNhap.getMaPN().toString());
            row.add(phieuNhap.getMaNV().toString());
            row.add(getKeyByValue(mapCty, phieuNhap.getMaCty()));
            row.add(phieuNhap.getTongChi().toString());
            row.add(phieuNhap.getNgayNhap().toString());
            data.add(row);
        }
        DefaultTableModel dtm = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tblPhieuNhap.setModel(dtm);
        status = true;
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public boolean bindingTbleCTPN(JTable tableCTPN, HashMap mapSach, String idPN) {
        Vector header = new Vector();
        header.add("Mã PN");
        header.add("Mã sách");
        header.add("Tên sách");
        header.add("Số lượng");
        header.add("Gía nhập");
        header.add("Thành tiền");
        ArrayList<CTPNDTO> listCtpn = new ArrayList<>();
        if (!ctpnbll.getByIdPN(listCtpn, idPN)) {
            return false;
        }

        Vector data = new Vector();
        for (CTPNDTO ctpn : listCtpn) {
            Vector row = new Vector();
            row.add(ctpn.getMaPN());
            row.add(ctpn.getMaSach());
            row.add(mapSach.get(ctpn.getMaSach()));
            row.add(ctpn.getSoLuongNhap());
            row.add(ctpn.getGiaNhap());
            row.add(ctpn.getThanhTien());
            data.add(row);
        }

        DefaultTableModel dtm = new DefaultTableModel(data, header) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableCTPN.setModel(dtm);
        return true;
    }
}
