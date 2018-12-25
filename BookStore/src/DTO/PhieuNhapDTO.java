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
public class PhieuNhapDTO {
    private Integer MaPN;
    private Integer MaNV;
    private Integer MaCty;
    private Date NgayNhap;
    private Float TongChi;

    public Integer getMaPN() {
        return MaPN;
    }

    public void setMaPN(Integer MaPN) {
        this.MaPN = MaPN;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public Integer getMaCty() {
        return MaCty;
    }

    public void setMaCty(Integer MaCty) {
        this.MaCty = MaCty;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public Float getTongChi() {
        return TongChi;
    }

    public void setTongChi(Float TongChi) {
        this.TongChi = TongChi;
    }
}
