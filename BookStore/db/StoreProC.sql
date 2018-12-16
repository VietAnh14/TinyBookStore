USE QLNS
go

-- ProC tìm thông tin KH trong fTaoDonHang

CREATE PROC Info_KhachHang @makh INT
AS
BEGIN
    SELECT KH.HoTen,KH.SDT,KH.DiemTichLuy FROM dbo.KHACHHANG AS KH WHERE @makh =KH.MaKH
END

GO
-- ProC tìm thông tin sách trong fTaoDonHang
CREATE PROC INFO_SACH @MASACH INT 
AS
BEGIN
    SELECT SA.* FROM dbo.SACH AS SA WHERE @MASACH = SA.MaSach
END


GO




