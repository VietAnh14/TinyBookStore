/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BookBLL;
import BLL.CTPNBLL;
import BLL.CongTyBLL;
import BLL.PhieuNhapBLL;
import DTO.BookDTO;
import DTO.CTPNDTO;
import DTO.CongTyDTO;
import DTO.PhieuNhapDTO;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Viet Anh
 */
public class fQLPhieuNhap extends javax.swing.JPanel {

    /**
     * Creates new form fQLPhieuNhap
     */
    public fQLPhieuNhap() {
        initComponents();
        InitForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txbMaPN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txbMaNV = new javax.swing.JTextField();
        cbCongTy = new javax.swing.JComboBox<>();
        txbNgayNhap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleCTPN = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnThem1 = new javax.swing.JButton();
        txbMaSach = new javax.swing.JTextField();
        txbSoLuong = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txbTenSach = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txbGiaNhap = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txbSoLgNhap = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txbTongTien = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shopping-bag (2).png"))); // NOI18N
        jLabel1.setText("Lập phiếu nhập");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Mã phiếu nhập:");

        txbMaPN.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Mã nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Ngày nhập:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Công ty:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/restaurant-membership-card-tool.png"))); // NOI18N
        jLabel11.setText("Phiếu nhập");

        txbMaNV.setEditable(false);

        cbCongTy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txbNgayNhap.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txbMaPN))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(txbMaNV))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbNgayNhap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbCongTy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txbMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCongTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txbNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(62, 62, 62))
        );

        tbleCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Gía nhập", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbleCTPN);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Mã Sách");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Số Lượng Tồn");

        btnThem1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem1.setForeground(new java.awt.Color(51, 51, 51));
        btnThem1.setText("Thêm");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        txbMaSach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txbMaSachFocusLost(evt);
            }
        });
        txbMaSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txbMaSachMouseExited(evt);
            }
        });

        txbSoLuong.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Tên Sách:");

        txbTenSach.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Gía nhập");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Số lượng nhập");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/book(3).png"))); // NOI18N
        jLabel13.setText("Thêm CTPN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txbMaSach)
                            .addComponent(txbTenSach)
                            .addComponent(txbSoLuong)
                            .addComponent(txbGiaNhap)
                            .addComponent(txbSoLgNhap)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnThem1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel13)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txbMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbSoLgNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThem1)
                .addGap(24, 24, 24))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Tổng tiền:");

        txbTongTien.setEditable(false);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(224, 14, 3));
        jButton5.setText("Xóa dòng");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(txbTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Lưu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(224, 14, 3));
        jButton3.setText("HỦY BỎ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lập phiếu nhập", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý phiếu nhập", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        try {
            Integer.parseInt(txbMaSach.getText());
            Float gia = Float.parseFloat(txbGiaNhap.getText());
            Integer soLuong = Integer.parseInt(txbSoLgNhap.getText());
            if (gia < 0 || soLuong < 0) {
                throw new Exception("Invalid argument");
            }

            if (isDuplicateBook(txbMaSach.getText())) {
                JOptionPane.showMessageDialog(this, "Sách đã tồn tại trong CTPN");
                return;
            }

            Vector row = new Vector();
            row.add(txbMaSach.getText());
            row.add(txbTenSach.getText());
            row.add(txbGiaNhap.getText());
            row.add(txbSoLgNhap.getText());
            Float thanhTien = gia * soLuong;
            row.add(thanhTien.toString());
            DefaultTableModel defaultTableModel = (DefaultTableModel) tbleCTPN.getModel();
            defaultTableModel.addRow(row);
            Float tongTien = Float.parseFloat(txbTongTien.getText()) + thanhTien;
            txbTongTien.setText(tongTien.toString());
            clearTxbCTPN();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sai thông tin chi tiết phiếu nhập !!");
        }
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(insertPN()) {
            JOptionPane.showMessageDialog(this, "Lưu phiếu nhập thành công!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txbMaSachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txbMaSachMouseExited
//        try {
//            BookDTO book = new BookDTO();
//            if (txbMaSach.getText().trim().isEmpty()) {
//                return;
//            }
//            Integer id = Integer.parseInt(txbMaSach.getText());
//
//            if (bookBLL.getById(book, id)) {
//                txbTenSach.setText(book.getTenSach());
//                txbSoLuong.setText(book.getSoLuong().toString());
//            } else {
//                JOptionPane.showMessageDialog(this, "Ma sach khong ton tai");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Wrong format Id");
//        }
    }//GEN-LAST:event_txbMaSachMouseExited

    private void txbMaSachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txbMaSachFocusLost
        try {
            BookDTO book = new BookDTO();
            if (txbMaSach.getText().trim().isEmpty()) {
                return;
            }
            Integer id = Integer.parseInt(txbMaSach.getText());

            if (bookBLL.getById(book, id)) {
                txbTenSach.setText(book.getTenSach());
                txbSoLuong.setText(book.getSoLuong().toString());
            } else {
                JOptionPane.showMessageDialog(this, "Ma sach khong ton tai");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Wrong format Id");
        }
    }//GEN-LAST:event_txbMaSachFocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int row = tbleCTPN.getSelectedRow();
        if (row >= 0) {
            try {
                DefaultTableModel defaultTableModel = (DefaultTableModel) tbleCTPN.getModel();
                Float tongTien = Float.parseFloat(txbTongTien.getText()) - Float.parseFloat(tbleCTPN.getValueAt(row, 4).toString());
                txbTongTien.setText(tongTien.toString());
                defaultTableModel.removeRow(row);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearTxbCTPN();
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbleCTPN.getModel();
        for (int i = defaultTableModel.getRowCount() - 1; i >= 0; i--) {
            defaultTableModel.removeRow(i);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    final void loadCbCTy() {
        mapCty.clear();
        cbCongTy.removeAllItems();
        ArrayList<CongTyDTO> listCongTy = new ArrayList<>();
        if (!congTyBLL.getAll(listCongTy)) {
            JOptionPane.showMessageDialog(this, "Can't load list cong ty");
        }

        for (CongTyDTO congTyDTO : listCongTy) {
            cbCongTy.addItem(congTyDTO.getTenCty());
            mapCty.put(congTyDTO.getTenCty(), congTyDTO.getMaCty());
        }
    }

    final void InitForm() {
        Date date = new Date();
        txbNgayNhap.setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
        txbMaNV.setText(fLogin.MaNV.toString());
        txbTongTien.setText("0");
        loadCbCTy();
        Integer Id = phieuNhapBLL.generateId();
        if (Id < 0) {
            JOptionPane.showMessageDialog(this, "Can't generate Id");
        } else {
            txbMaPN.setText(Id.toString());
        }
    }

    boolean isDuplicateBook(String maSach) {
        int rowCount = tbleCTPN.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            if (tbleCTPN.getValueAt(i, 0).equals(maSach)) {
                return true;
            }
        }
        return false;
    }

    void clearTxbCTPN() {
        txbMaSach.setText("");
        txbSoLgNhap.setText("0");
        txbGiaNhap.setText("0");
        txbTenSach.setText("");
        txbSoLuong.setText("");
    }

    private ArrayList<CTPNDTO> CreateListPN() {
        ArrayList<CTPNDTO> listCTPN = new ArrayList<>();
        for (int i = 0; i <= tbleCTPN.getRowCount() - 1; i++) {
            CTPNDTO ctpn = new CTPNDTO();
            ctpn.setMaPN(Integer.parseInt(txbMaPN.getText()));
            ctpn.setMaSach(Integer.parseInt(tbleCTPN.getValueAt(i, 0).toString()));
            ctpn.setGiaNhap(Float.parseFloat(tbleCTPN.getValueAt(i, 2).toString()));
            ctpn.setSoLuongNhap(Integer.parseInt(tbleCTPN.getValueAt(i, 3).toString()));
            ctpn.setThanhTien(Float.parseFloat(tbleCTPN.getValueAt(i, 4).toString()));
            listCTPN.add(ctpn);
        }
        
        return listCTPN;
    }
    
    
    private boolean insertPN() {
        if (tbleCTPN.getRowCount() < 0) {
            JOptionPane.showMessageDialog(this, "Lỗi, phiếu nhập cần có ctpn");
        }
        
        PhieuNhapDTO pn = new PhieuNhapDTO();
        pn.setMaPN(Integer.parseInt(txbMaPN.getText()));
        pn.setMaNV(fLogin.MaNV);
        pn.setMaCty(mapCty.get(cbCongTy.getSelectedItem().toString()));
        if (!phieuNhapBLL.insertPN(pn)) {
            JOptionPane.showMessageDialog(this, "Them phieu nhap that bai");
            return false;
        }
        
        if (!ctpnbll.insertListCTPN(CreateListPN())) {
            JOptionPane.showMessageDialog(this, "Loi khi luu ctpn");
            return false;
        }
        
        return true;
    }

    private final CongTyBLL congTyBLL = new CongTyBLL();
    private final PhieuNhapBLL phieuNhapBLL = new PhieuNhapBLL();
    private final HashMap<String, Integer> mapCty = new HashMap();
    private final BookBLL bookBLL = new BookBLL();
    private final CTPNBLL ctpnbll = new CTPNBLL();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem1;
    private javax.swing.JComboBox<String> cbCongTy;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbleCTPN;
    private javax.swing.JTextField txbGiaNhap;
    private javax.swing.JTextField txbMaNV;
    private javax.swing.JTextField txbMaPN;
    private javax.swing.JTextField txbMaSach;
    private javax.swing.JTextField txbNgayNhap;
    private javax.swing.JTextField txbSoLgNhap;
    private javax.swing.JTextField txbSoLuong;
    private javax.swing.JTextField txbTenSach;
    private javax.swing.JTextField txbTongTien;
    // End of variables declaration//GEN-END:variables
}
