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
public class LoaiSachDTO {

    public Integer getMaLoaiSach() {
        return MaLoaiSach;
    }

    public void setMaLoaiSach(Integer MaLoaiSach) {
        this.MaLoaiSach = MaLoaiSach;
    }

    public String getTenLoaiSach() {
        return TenLoaiSach;
    }

    public void setTenLoaiSach(String TenLoaiSach) {
        this.TenLoaiSach = TenLoaiSach;
    }
    private Integer MaLoaiSach;
    private String TenLoaiSach;
}
