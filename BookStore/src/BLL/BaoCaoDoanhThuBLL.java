/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.BaoCaoDoanhThuDAL;
import DTO.BaoCaoDoanhThuDTO;
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
    
    public Float tinhTongThu(String tuNgay, String denNgay) {
        return baoCaoDoanhThuDAL.tinhTongThu(tuNgay, denNgay);
    }
}
