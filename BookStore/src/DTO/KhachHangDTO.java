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
public class KhachHangDTO {
    private Integer MaKH;
    private String HoTen;
    private Integer SDT;
    private String Email;
    private Integer CMND;
    private Date NgaySinh;
    private Integer DiemTichLuy;

    public Integer getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(Integer DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }
    private Boolean Deleted;

    public Integer getMaKH() {
        return MaKH;
    }

    public void setMaKH(Integer MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Integer getSDT() {
        return SDT;
    }

    public void setSDT(Integer SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Integer getCMND() {
        return CMND;
    }

    public void setCMND(Integer CMND) {
        this.CMND = CMND;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public Boolean getDeleted() {
        return Deleted;
    }

    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }
}
