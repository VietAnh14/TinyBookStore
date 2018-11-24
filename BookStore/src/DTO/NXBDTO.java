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
public class NXBDTO {

    public Integer getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(Integer MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getTenNXB() {
        return TenNXB;
    }

    public void setTenNXB(String TenNXB) {
        this.TenNXB = TenNXB;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Boolean getDeleted() {
        return Deleted;
    }

    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }
    private Integer MaNXB;
    private String TenNXB;
    private String DiaChi;
    private String SDT;
    private Boolean Deleted;
}
