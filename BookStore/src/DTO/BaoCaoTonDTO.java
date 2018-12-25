/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HUY
 */
public class BaoCaoTonDTO {
        private Integer Id;
        private Integer Thang;
        private Integer Nam;
        private Integer TonDau;
        private Integer TonPhatSinh;
        private Integer TonCuoi;
        private Integer MaSach;
        public Integer GetID()
        {
            return Id;
        }
        public void SetID(Integer ID)
        {
            this.Id =ID;
        }
        public Integer GetThang()
        {
            return Thang;
        }
        public void SetThang(Integer Thang)
        {
            this.Thang =Thang;
        }
        public Integer GetNam()
        {
            return Nam;
        }
        public void SetNam(Integer Nam)
        {
            this.Nam =Nam;
        }
        public Integer GetTonDau()
        {
            return TonDau;
        }
        public void SetTonDau(Integer TonDau)
        {
            this.TonDau =TonDau;
        }
        public Integer GetTonCuoi()
        {
            return TonCuoi;
        }
        public void SetTonCuoi(Integer TonCuoi)
        {
            this.TonCuoi =TonCuoi;
        }
        public Integer GetMaSach()
        {
            return MaSach;
        }
        public void SetMaSach(Integer MaSach)
        {
            this.MaSach =MaSach;
        }
        public Integer GetTonPhatSinh()
        {
            return TonPhatSinh;
        }
        public void SetTonPhatSinh(Integer TPS)
        {
            this.TonPhatSinh=TPS;
        }
        
}
