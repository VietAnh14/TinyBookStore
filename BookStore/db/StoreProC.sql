USE QLNS
go



CREATE PROC Info_KhachHang @makh INT
AS
BEGIN
    SELECT KH.HoTen,KH.SDT,KH.DiemTichLuy FROM dbo.KHACHHANG AS KH WHERE @makh =KH.MaKH
END


SELECT * FROM dbo.KHACHHANG

EXEC dbo.Info_KhachHang @makh = 0 -- int
