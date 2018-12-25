/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author HUY
 */
public class NhanVienDTO {
    private Integer MaNV;
    private String Hoten;
    private String SDT;
    private String CMND;
    private String DiaChi;
    private Date NgaySinh;
    private Boolean Deleted;
    public Integer GetMaNV()
    {
        return MaNV;
    }
    public void SetMaNV(Integer Ma)
    {
        this.MaNV =Ma;
    }
    public String GetHoten()
    {
        return Hoten;
    }
    public void SetHoten(String Hoten)
    {
        this.Hoten= Hoten;
    }
    public String GetSDT()
    {
        return SDT;
    }
    public void SetSDT(String sdt)
    {
        this.SDT = sdt;
    }
    public String GetDiaChi()
    {
        return DiaChi;
    }
    public void SetDiaChi(String DiaChi)
    {
        this.DiaChi = DiaChi;
    }
    public Date GetNgaySinh()
    {
        return NgaySinh;
    }
    public void SetNgaySinh(Date NgaySinh)
    {
        this.NgaySinh =NgaySinh;
    }
    public String GetCMND()
    {
        return CMND;
    }
    public void SetCMND(String CMND)
    {
        this.CMND = CMND;
    }
    public Boolean Getdeleted()
    {
        return Deleted;
    }
    public void Setdeleted(Boolean Deleted)
    {
        this.Deleted= Deleted;
    }
}
