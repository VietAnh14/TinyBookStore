/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.PhieuNhapDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Viet Anh
 */
public class PhieuNhapDAL extends ConnectDB {

    public Integer getIdMax() {
        String sql = " SELECT MAX(MaPN) FROM PHIEUNHAP";
        Integer id = 0;

        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            getClose();
            id = -2; //FAIL
        }

        return id;
    }

    public boolean insertPN(PhieuNhapDTO phieuNhap) {
        String sql = "INSERT INTO PHIEUNHAP (MaPN, MaNV, MaCty, TongChi) "
                + "VALUES (" + phieuNhap.getMaPN() + "," + phieuNhap.getMaNV() + "," + phieuNhap.getMaCty() + ",0)";
        boolean status = false;
        try {
            getConnection();
            cn.setAutoCommit(false);
            Statement statement = cn.createStatement();
            int rs = statement.executeUpdate(sql);
            cn.commit();
            if (rs > 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
            cn.rollback();
        } finally {
            getClose();
            return status;
        }
    }

    public boolean getAll(ArrayList<PhieuNhapDTO> listPhieuNhap) {
        String sql = "SELECT * FROM  PHIEUNHAP";
        boolean status = false;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhapDTO phieuNhap = new PhieuNhapDTO();
                phieuNhap.setMaCty(rs.getInt("MaCty"));
                phieuNhap.setMaNV(rs.getInt("MaNV"));
                phieuNhap.setMaPN(rs.getInt("MaPN"));
                phieuNhap.setNgayNhap(rs.getDate("NgayNhap"));
                phieuNhap.setTongChi(rs.getFloat("TongChi"));
                listPhieuNhap.add(phieuNhap);
            }
            status = true;
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        } finally {
            getClose();
            return status;
        }
    }
    
    public boolean searchByDate(String dateFrom, String dateTo,ArrayList<PhieuNhapDTO> listPhieuNhap) {
        String sql = "set dateformat DMY " +
                            "select * from PHIEUNHAP WHERE PHIEUNHAP.NgayNhap between ? and ?";
        boolean status = false;
        try {
            getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dateFrom);
            ps.setString(2, dateTo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuNhapDTO phieuNhap = new PhieuNhapDTO();
                phieuNhap.setMaCty(rs.getInt("MaCty"));
                phieuNhap.setMaNV(rs.getInt("MaNV"));
                phieuNhap.setMaPN(rs.getInt("MaPN"));
                phieuNhap.setNgayNhap(rs.getDate("NgayNhap"));
                phieuNhap.setTongChi(rs.getFloat("TongChi"));
                listPhieuNhap.add(phieuNhap);
            }
            status = true;
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        } finally {
            getClose();
            return status;
        }
    }
}
