/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author HUY
 */
public class KhachHangDTO {
    private Integer MaKH;
    private String Hoten;
    private String SDT;
    private String Email;
    private String CMND;
    private Date NgaySinh;
    private Integer DiemTichLuy;
    private Boolean Deleted;
    public Integer GetMaKH()
    {
        return MaKH;
    }
    public void SetMaKH(Integer Ma)
    {
        this.MaKH =Ma;
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
    public String GetEmail()
    {
        return Email;
    }
    public void SetEmail(String Email)
    {
        this.Email = Email;
    }
    public Date GetNgaySinh()
    {
        return NgaySinh;
    }
    public void SetNgaySinh(Date NgaySinh)
    {
        this.NgaySinh =NgaySinh;
    }
    public Integer GetDiemTichLuy()
    {
        return DiemTichLuy;
    }
    public void SetDiemTichLuy(int DTL)
    {
        this.DiemTichLuy = DTL;
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
    public void Setdeleted(Boolean Deleted) throws ParseException
    {
        this.Deleted= Deleted;
        
    }
    public void setMaKH(Integer MaKH) {
        this.MaKH = MaKH;
    }


 }
