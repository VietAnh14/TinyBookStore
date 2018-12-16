/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Viet Anh
 */
public class CTPNDTO {

    private Integer MaPN;
    private Integer MaSach;
    private Integer SoLuongNhap;
    private Float ThanhTien;
    private Float GiaNhap;

    public Integer getMaPN() {
        return MaPN;
    }

    public void setMaPN(Integer MaPN) {
        this.MaPN = MaPN;
    }

    public Integer getMaSach() {
        return MaSach;
    }

    public void setMaSach(Integer MaSach) {
        this.MaSach = MaSach;
    }

    public Integer getSoLuongNhap() {
        return SoLuongNhap;
    }

    public void setSoLuongNhap(Integer SoLuongNhap) {
        this.SoLuongNhap = SoLuongNhap;
    }

    public Float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public Float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Float GiaNhap) {
        this.GiaNhap = GiaNhap;
    }
    
    public String toInsertString() {
        if (this.MaPN == null || this.MaSach == null || this.GiaNhap == null || this.SoLuongNhap == null || this.ThanhTien == null) {
            return null;
        }
        
        String sql = "INSERT INTO CTPHIEUNHAP (MaPN, MaSach, SoLuongNhap, ThanhTien, GiaNhap) "
                + "VALUES  ("+this.getMaPN()+", "+this.getMaSach()+", "+this.getSoLuongNhap()+"," +this.getThanhTien() +", "+this.getGiaNhap()+")";
        return sql;
    }

}
