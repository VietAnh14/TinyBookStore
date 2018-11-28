USE QLNS
go

-- ProC t�m th�ng tin KH trong fTaoDonHang

CREATE PROC Info_KhachHang @makh INT
AS
BEGIN
    SELECT KH.HoTen,KH.SDT,KH.DiemTichLuy FROM dbo.KHACHHANG AS KH WHERE @makh =KH.MaKH
END

GO
-- ProC t�m th�ng tin s�ch trong fTaoDonHang
CREATE PROC INFO_SACH @MASACH INT 
AS
BEGIN
    SELECT SA.* FROM dbo.SACH AS SA WHERE @MASACH = SA.MaSach
END


GO




