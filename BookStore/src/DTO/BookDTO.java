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
public class BookDTO {

    public Integer getMaSach() {
        return MaSach;
    }

    public void setMaSach(Integer MaSach) {
        this.MaSach = MaSach;
    }

    public Integer getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(Integer MaNXB) {
        this.MaNXB = MaNXB;
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

    public Integer getMaLoaiSach() {
        return MaLoaiSach;
    }

    public void setMaLoaiSach(Integer MaLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
    }

    public Float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Float GiaBan) {
        this.GiaBan = GiaBan;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    private Integer MaSach;
    private Integer MaNXB;
    private String TenSach;
    private String TacGia;
    private Integer MaLoaiSach;
    private Float GiaBan;
    private Integer SoLuong;
    private Boolean deleted;
}
