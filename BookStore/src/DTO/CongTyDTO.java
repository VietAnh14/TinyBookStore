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
public class CongTyDTO {
    private Integer MaCty;
    private  String TenCty;
    private String DiaChi;
    private String SDT;

    public Integer getMaCty() {
        return MaCty;
    }

    public void setMaCty(Integer MaCty) {
        this.MaCty = MaCty;
    }

    public String getTenCty() {
        return TenCty;
    }

    public void setTenCty(String TenCty) {
        this.TenCty = TenCty;
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
    
}
