/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author DaoLam
 */
public class BookCartDTO {
    private Integer MaSach;
    private String TenSach;
    private String TacGia;
    private Integer GiaBan;
    private Integer SoLuong;
    private Integer ThanhTien;

    public Integer getMaSach() {
        return MaSach;
    }

    public void setMaSach(Integer MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public Integer getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Integer GiaBan) {
        this.GiaBan = GiaBan;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Integer getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien() {
        this.ThanhTien = this.GiaBan*this.SoLuong;
    }
    
}
