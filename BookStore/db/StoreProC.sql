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


-- ProC tìm mã sách thích hợp.
CREATE PROC TIM_MAHD
AS
BEGIN
    DECLARE @ID_HD INT,@ID_MAX INT,@I INT
	SET @I = 0
	SET @ID_MAX = (SELECT MAX(MaHD) FROM dbo.HOADON)
	IF (@ID_MAX IS NULL)
		SET @ID_HD =@I
	ELSE
		BEGIN
		    WHILE(@I <= @ID_MAX+1)
			BEGIN
			    IF (SELECT COUNT(*) FROM dbo.HOADON WHERE MaHD = @I) = 0
					BEGIN
					    SET @ID_HD = @I
						BREAK
					END
					SET @I = @I +1
			END
		END
		SELECT @ID_HD
END

GO

-- PROC TAO HOA DON
CREATE PROC TAO_HOADON @MAHD INT, @MANV INT, @MAKH INT, @TRIGIA MONEY, @DIEMTICHLUY INT
AS
BEGIN
    INSERT dbo.HOADON
    (
        MaHD,
        MaNV,
        MaKH,
        NgHD,
        TriGia,
        TienDiemTichLuy
    )
    VALUES
    (   @MAHD,         -- MaHD - int
        @MANV,         -- MaNV - int
        @MAKH,         -- MaKH - int
        GETDATE(), -- NgHD - date
        @TRIGIA,      -- TriGia - money
        @DIEMTICHLUY       -- TienDiemTichLuy - money
        )
END

GO
-- XÓA HÓA ĐƠN VÀ CÁC CTHD CÓ LIÊN QUAN
CREATE PROC XOAHD @MAHD INT
AS
BEGIN
    DELETE dbo.HOADON WHERE MaHD=@MAHD;
END
GO

CREATE PROC TAOCTHD @MAHD INT, @MASACH INT, @SL INT, @THANHTIEN INT
AS
BEGIN
    INSERT dbo.CTHD
    (
        MaHD,
        MaSach,
        SoLuong,
        ThanhTien
    )
    VALUES
    (   @MAHD,   -- MaHD - int
        @MASACH,   -- MaSach - int
        @SL,   -- SoLuong - int
        @THANHTIEN -- ThanhTien - money
        )
END


