DROP DATABASE IF EXISTS QLNS
GO

CREATE DATABASE QLNS
GO

USE QLNS

CREATE TABLE NXB(
	MaNXB INT  PRIMARY KEY,
	TenNXB NVARCHAR(70) NOT NULL,
	DiaChi NVARCHAR(100) NOT NULL,
	SDT CHAR(15) NOT NULL,
	Deleted BIT default 0
)
GO
CREATE TABLE LOAISACH
(
	MaLoaiSach INT PRIMARY KEY IDENTITY,
	TenLoaiSach NVARCHAR(70) NOT NULL
)
GO

CREATE TABLE SACH
(
	MaSach INT  PRIMARY KEY,
	MaNXB int NOT NULL,
	TenSach NVARCHAR(70) NOT NULL,
	TacGia NVARCHAR(70) NOT NULL,
	MaLoaiSach INT NOT NULL,
	GiaBan MONEY NOT NULL,
	SoLuong INT NOT NULL,
	Deleted bit default 0,
	FOREIGN KEY (MaNXB) REFERENCES NXB(MaNXB),
	FOREIGN KEY (MaLoaiSach) REFERENCES LOAISACH(MaLoaiSach),
)





CREATE TABLE NHANVIEN
(
	MaNV INT  PRIMARY KEY IDENTITY,
	HoTen NVARCHAR(50) NOT NULL,
	SDT CHAR(15) NOT NULL,
	CMND CHAR(20) NOT NULL,
	DiaChi NVARCHAR(100) NOT NULL,
	NgaySinh DATE NOT NULL,
	Deleted bit default 0,
)
GO

CREATE TABLE ACCOUNT
(
	TenTaiKhoan VARCHAR(50) PRIMARY KEY,
	MatKhau VARCHAR(50) NOT NULL,
	ChucVu VARCHAR(50) NOT NULL,
	MaNV INT NOT NULL,
	FOREIGN KEY (MaNV) REFERENCES NHANVIEN(MaNV) 
)
GO

CREATE TABLE CONGTY
(
	MaCty INT PRIMARY KEY,
	TenCty NVARCHAR(70),
	DiaChi NVARCHAR(70),
	SDT VARCHAR(20)
)

GO

CREATE TABLE PHIEUNHAP
(
	MaPN INT  PRIMARY KEY,
	MaNV INT NOT NULL,
	MaCty INT NOT NULL,
	NgayNhap DATE DEFAULT GETDATE(),
	TongChi MONEY NOT NULL,
	FOREIGN KEY (MaCty) REFERENCES dbo.CONGTY(MaCty),
	FOREIGN KEY (MaNV) REFERENCES NHANVIEN(MaNV)
)
GO

CREATE TABLE CTPHIEUNHAP
(
	MaPN INT NOT NULL,
	MaSach INT NOT NULL,
	SoLuongNhap INT NOT NULL,
	GiaNhap MONEY NOT NULL,
	ThanhTien MONEY NOT NULL,
	PRIMARY KEY (MaPN,MaSach),
	FOREIGN KEY (MaPN) REFERENCES PHIEUNHAP(MaPN),
	FOREIGN KEY (MaSach) REFERENCES SACH(MaSach)
)
GO

CREATE TABLE KHACHHANG(
	MaKH INT  PRIMARY KEY IDENTITY,
	HoTen NVARCHAR(50) NOT NULL,
	SDT CHAR(12) NOT NULL,
	Email NVARCHAR(50) NOT NULL,
	CMND CHAR(15) NOT NULL,
	NgaySinh DATE NOT NULL,
	DiemTichLuy INT DEFAULT 0,
	Deleted BIT DEFAULT 0, 
)
GO



CREATE TABLE HOADON(
	MaHD INT  PRIMARY KEY,
	MaNV int NOT NULL,
	MaKH INT NOT NULL,
	NgHD DATE DEFAULT GETDATE() NOT NULL,
	TriGia MONEY NOT NULL,
	TienDiemTichLuy MONEY NOT NULL,

	FOREIGN KEY (MaNV) REFERENCES NHANVIEN(MaNV),
	FOREIGN KEY (MaKH) REFERENCES KHACHHANG(MaKH)

)
GO

CREATE TABLE CTHD
(
	MaHD INT  NOT NULL,
	MaSach INT  NOT NULL,
	SoLuong INT DEFAULT 0,
	ThanhTien MONEY NOT NULL,
	PRIMARY KEY(MaHD,MaSach),

	FOREIGN KEY (MaHD) REFERENCES HOADON(MaHD) ON DELETE CASCADE,
	FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
	
)
GO

CREATE TABLE BAOCAOTON
(
	ID INT IDENTITY(1,1)  PRIMARY KEY,
	Thang INT NOT NULL,
	Nam INT NOT NULL,
	TonDau INT NOT NULL,
	TonPhatSinh INT NOT NULL,
	TonCuoi INT NOT NULL,
	MaSach INT NOT NULL,

	FOREIGN KEY (MaSach) REFERENCES SACH(MaSach)
)
GO

GO
CREATE TABLE BAOCAODOANHTHU
(
	TuNgay SMALLDATETIME NOT NULL,
	DenNgay SMALLDATETIME NOT NULL,
	NgayLap SMALLDATETIME,
	TongThu MONEY NOT NULL,
	PRIMARY KEY(TUNGAY, DENNGAY)
)

CREATE TABLE QUYDINH
(
	ID INT IDENTITY(1,1) PRIMARY KEY,
	GiaTriDiemTichLuy MONEY NOT NULL,
	TienToDiemTichLuy MONEY NOT NULL
)
GO

SET DATEFORMAT DMY;
GO  



INSERT INTO NXB
                         (MaNXB,TenNXB, DiaChi, SDT)
VALUES        (1,N'Nhà Xuất Bản Trẻ',N'ABC','012346789')

INSERT INTO dbo.LOAISACH
(
    TenLoaiSach
)
VALUES
(N'TIỂU THUYẾT' -- TenLoaiSach - nvarchar(70)
    )

INSERT INTO dbo.LOAISACH
(
    TenLoaiSach
)
VALUES
(N'TRINH THÁM' -- TenLoaiSach - nvarchar(70)
    )

INSERT INTO SACH
                         (MaSach,MaNXB, TenSach, TacGia, MaLoaiSach, GiaBan,SoLuong)
VALUES        (1,'1',N'Forever 20','VA','1','100','100')

INSERT INTO SACH
                         (MaSach,MaNXB, TenSach, TacGia, MaLoaiSach, GiaBan,SoLuong)
VALUES        (2,'1',N'City of stars','VB','2','200','50')

INSERT INTO SACH
                         (MaSach,MaNXB, TenSach, TacGia, MaLoaiSach, GiaBan,SoLuong)
VALUES        (3,'1',N'Paper Cities','VC','1','150','150')

INSERT INTO SACH
                         (MaSach,MaNXB, TenSach, TacGia, MaLoaiSach, GiaBan,SoLuong)
VALUES        (4,'1',N'SGK Toán','VC','2','10','150')

INSERT INTO SACH
                         (MaSach,MaNXB, TenSach, TacGia, MaLoaiSach, GiaBan,SoLuong)
VALUES        (5,'1',N'SGK Lý 10','VC','1','15','150')

INSERT INTO NHANVIEN
                         (HoTen, SDT, CMND,NgaySinh, DiaChi)
VALUES        (N'Ngyễn Văn A','012345678','123546465','15/6/1999','TP HCM')

INSERT INTO KHACHHANG
                         (HoTen, SDT, Email, NgaySinh,CMND)
VALUES        (N'KH mua lẻ','123546','Tkobietboi@something.com','11/2/1998','131213')

INSERT INTO QUYDINH
                         (GiaTriDiemTichLuy, TienToDiemTichLuy)
VALUES        (1, 50)


INSERT INTO ACCOUNT
                         (TenTaiKhoan, MatKhau, ChucVu, MaNV)
VALUES        ('admin','admin','admin',1)

GO

DROP TRIGGER IF EXISTS UPDATE_SL_SACH_FOR_CTPN

GO
CREATE TRIGGER UPDATE_SL_SACH_FOR_CTPN
ON CTPHIEUNHAP AFTER UPDATE, INSERT, DELETE
AS
DECLARE @MaSach int , @SoLuong int, @SoLuongTon int, @SoLuongTruocUpdate int, @Activity varchar(20), @SoLuongNhap int,
		@ThanhTienCu float, @ThanhTienMoi float, @TongTien float, @MaPN int
IF EXISTS(SELECT * FROM deleted) AND EXISTS(SELECT * FROM inserted)
BEGIN
SET @Activity = 'UPDATE'
	SELECT @MaPN = MaPN FROM inserted
	SELECT @MaSach = MaSach FROM inserted
	SELECT @SoLuongNhap = SoLuongNhap FROM inserted
	SELECT @SoLuongTon = SoLuong FROM SACH WHERE MaSach = @MaSach
	SELECT @SoLuongTruocUpdate = SoLuongNhap FROM deleted
	SET @SoLuong = @SoLuongTon - @SoLuongTruocUpdate + @SoLuongNhap
	UPDATE SACH SET SoLuong = @SoLuong WHERE MaSach = @MaSach

	SELECT @ThanhTienCu = ThanhTien FROM deleted
	SELECT @ThanhTienMoi = ThanhTien FROM inserted
	SELECT @TongTien = TongChi FROM PHIEUNHAP WHERE MaPN = @MaPN
	SET @TongTien = @TongTien + @ThanhTienMoi - @ThanhTienCu
	UPDATE PHIEUNHAP SET TongChi = @TongTien WHERE MaPN = @MaPN
END

If EXISTS (SELECT * FROM inserted) AND NOT EXISTS(SELECT * FROM deleted)
BEGIN
	SET @Activity = 'INSERT';
	SELECT @MaPN = MaPN FROM inserted
	SELECT @MaSach = MaSach FROM inserted
	SELECT @SoLuongNhap = SoLuongNhap FROM inserted
	SELECT @SoLuongTon = SoLuong FROM SACH WHERE MaSach = @MaSach
	SET @SoLuong = @SoLuongTon + @SoLuongNhap
	UPDATE SACH SET SoLuong = @SoLuong WHERE MaSach = @MaSach

	SELECT @ThanhTienMoi = ThanhTien FROM inserted
	SELECT @TongTien = TongChi FROM PHIEUNHAP WHERE MaPN = @MaPN
	SET @TongTien = @TongTien + @ThanhTienMoi
	UPDATE PHIEUNHAP SET TongChi = @TongTien WHERE MaPN = @MaPN
END

IF NOT EXISTS(SELECT * FROM inserted) AND EXISTS(SELECT * FROM deleted)
BEGIN
	SET @Activity = 'DELETE'
	SELECT @MaPN = MaPN FROM deleted
	SELECT @MaSach = MaSach FROM deleted
	SELECT @SoLuongNhap = SoLuongNhap FROM deleted
	SELECT @SoLuongTon = SoLuong FROM SACH WHERE MaSach = @MaSach
	SET @SoLuong = @SoLuongTon - @SoLuongNhap
	UPDATE SACH SET SoLuong = @SoLuong WHERE MaSach = @MaSach

	SELECT @ThanhTienMoi = ThanhTien FROM deleted
	SELECT @TongTien = TongChi FROM PHIEUNHAP WHERE MaPN = @MaPN
	SET @TongTien = @TongTien - @ThanhTienMoi
	UPDATE PHIEUNHAP SET TongChi = @TongTien WHERE MaPN = @MaPN
END
GO

/*
INSERT INTO PHIEUNHAP
                         (MaPN, MaNV, MaCty, TongChi)
VALUES        (1, 1, 1, 0)

INSERT INTO CTPHIEUNHAP
                         (MaPN, MaSach, SoLuongNhap, ThanhTien, GiaNhap)
VALUES        (1, 8, 250, 100, 1) */

UPDATE CTPHIEUNHAP SET SoLuongNhap = 200, ThanhTien = 200 WHERE MaPN = 1 AND MaSach = 8

DELETE CTPHIEUNHAP WHERE MaPN = 1 AND MaSach = 8

