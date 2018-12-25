/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.BaoCaoDoanhThuDAL;
import DTO.BaoCaoDoanhThuDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class BaoCaoDoanhThuBLL {

    BaoCaoDoanhThuDAL baoCaoDoanhThuDAL = new BaoCaoDoanhThuDAL();

    public ArrayList<BaoCaoDoanhThuDTO> getAll() {
        return baoCaoDoanhThuDAL.getAll();
    }
    
    public ArrayList<BaoCaoDoanhThuDTO> tinhTongThu(String tuNgay, String denNgay) throws SQLException {
        return baoCaoDoanhThuDAL.tinhTongThu(tuNgay, denNgay);
    }
    
    public Float TongThu(String tuNgay, String denNgay)
    {
        return baoCaoDoanhThuDAL.TongThu(tuNgay, denNgay);
    }
    public boolean insertBC(BaoCaoDoanhThuDTO BC,float tt) {
        return baoCaoDoanhThuDAL.insertBC(BC, tt);
    }
}


