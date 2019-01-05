/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author QuyNam
 */
public class CTHDDTO {

    private Integer MaHD;
    private Integer MaSach;
    private Integer SoLuong;
    private Float ThanhTien;

    public Integer getMaHD() {
        return MaHD;
    }

    public void setMaHD(Integer MaHD) {
        this.MaHD = MaHD;
    }

    public Integer getMaSach() {
        return MaSach;
    }

    public void setMaSach(Integer MaSach) {
        this.MaSach = MaSach;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String  toInsertString() {
        return "INSERT INTO CTHD"
                + "                         (MaHD, MaSach, SoLuong, ThanhTien)"
                + " VALUES        ("+MaHD+","+MaSach+","+SoLuong+","+ThanhTien+") ";
    }
}
