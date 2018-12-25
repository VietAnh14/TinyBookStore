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
public class GiftDTO {

    public String GetTenQua() {
        return TenQua;
    }

    public void SetTenQua(String TenQua) {
        this.TenQua = TenQua;
    }

    public Integer getMaQua() {
        return MaQua;
    }

    public void setMaQua(Integer MaQua) {
        this.MaQua = MaQua;
    }

    public Integer getMucDiem() {
        return MucDiem;
    }

    public void setMucDiem(Integer MucDiem) {
        this.MucDiem = MucDiem;
    }
    private String TenQua;
    private Integer MaQua;
    private Integer MucDiem;
    
}
