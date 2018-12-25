/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Viet Anh
 */
public class BaoCaoDoanhThuDTO {

    private Date TuNgay;
    private Date DenNgay;
    private Date NgayLap;
    private Float TongThu;

    public Date getTuNgay() {
        return TuNgay;
    }

    public void setTuNgay(Date TuNgay) {
        this.TuNgay = TuNgay;
    }

    public Date getDenNgay() {
        return DenNgay;
    }

    public void setDenNgay(Date DenNgay) {
        this.DenNgay = DenNgay;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public Float getTongThu() {
        return TongThu;
    }

    public void setTongThu(Float TongThu) {
        this.TongThu = TongThu;
    }
}
