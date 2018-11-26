/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author QuyNam
 */
public class HoaDonDTO {
    private Integer MaHD;
    private Integer MaNv;
    private Integer MaKH;
    private Date NgHD;
    private Integer TriGia;
    private Integer TienDiemTichLuy;

    public Integer getMaHD() {
        return MaHD;
    }

    public void setMaHD(Integer MaHD) {
        this.MaHD = MaHD;
    }

    public Integer getMaNv() {
        return MaNv;
    }

    public void setMaNv(Integer MaNv) {
        this.MaNv = MaNv;
    }

    public Integer getMaKH() {
        return MaKH;
    }

    public void setMaKH(Integer MaKH) {
        this.MaKH = MaKH;
    }

    public Date getNgHD() {
        return NgHD;
    }

    public void setNgHD(Date NgHD) {
        this.NgHD = NgHD;
    }

    public Integer getTriGia() {
        return TriGia;
    }

    public void setTriGia(Integer TriGia) {
        this.TriGia = TriGia;
    }

    public Integer getTienDiemTichLuy() {
        return TienDiemTichLuy;
    }

    public void setTienDiemTichLuy(Integer TienDiemTichLuy) {
        this.TienDiemTichLuy = TienDiemTichLuy;
    }

    
   
}
