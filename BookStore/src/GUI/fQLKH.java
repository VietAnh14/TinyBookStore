/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import BLL.KhachHangBLL;
import Common.BindingTableFromQLKH;
import DTO.KhachHangDTO;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.Date;
import java.text.SimpleDateFormat;  
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParseException;
import java.util.Calendar;

/**
 *
 * @author HUY
 */
public class fQLKH extends javax.swing.JPanel {

    /**
     * Creates new form fQLKH
     */
    public fQLKH() {
        initComponents();
        bindingTableFormQLKH.bindingtbQLKH(jTableKH, KhachHangBLL.getAll());
        jTextDTL.setEditable(false);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "Loi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMaKH = new javax.swing.JLabel();
        jTextMaKH = new javax.swing.JTextField();
        jTenKH = new javax.swing.JLabel();
        jTextCMND = new javax.swing.JTextField();
        jSDT = new javax.swing.JLabel();
        jTextSDT = new javax.swing.JTextField();
        jNgaysinh = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jEmail = new javax.swing.JLabel();
        jTextTenKH = new javax.swing.JTextField();
        jCMND = new javax.swing.JLabel();
        jDiemTichLuy = new javax.swing.JLabel();
        jTextDTL = new javax.swing.JTextField();
        jNgaySinhpick = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonThem = new javax.swing.JButton();
        jButtonSua = new javax.swing.JButton();
        jButtonLuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKH = new javax.swing.JTable();
        jButtonHuy = new javax.swing.JButton();
        jMKHTK = new javax.swing.JLabel();
        jTextTimKiem = new javax.swing.JTextField();
        jButtonTimKiem = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(875, 626));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMaKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMaKH.setForeground(new java.awt.Color(102, 102, 102));
        jMaKH.setText("Mã khách hàng");

        jTextMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMaKHActionPerformed(evt);
            }
        });

        jTenKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTenKH.setForeground(new java.awt.Color(102, 102, 102));
        jTenKH.setText("Tên khách hàng");

        jTextCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCMNDActionPerformed(evt);
            }
        });

        jSDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSDT.setForeground(new java.awt.Color(102, 102, 102));
        jSDT.setText("SĐT");

        jNgaysinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jNgaysinh.setForeground(new java.awt.Color(102, 102, 102));
        jNgaysinh.setText("Ngày sinh");

        jEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jEmail.setForeground(new java.awt.Color(102, 102, 102));
        jEmail.setText("Email");

        jTextTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTenKHActionPerformed(evt);
            }
        });

        jCMND.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCMND.setForeground(new java.awt.Color(102, 102, 102));
        jCMND.setText("CMND");

        jDiemTichLuy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jDiemTichLuy.setForeground(new java.awt.Color(102, 102, 102));
        jDiemTichLuy.setText("Điểm tích lũy");

        jNgaySinhpick.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jMaKH)
                        .addGap(21, 21, 21)
                        .addComponent(jTextMaKH))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTenKH)
                        .addGap(18, 18, 18)
                        .addComponent(jTextTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNgaysinh)
                    .addComponent(jCMND))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jNgaySinhpick, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEmail)
                        .addGap(18, 18, 18)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jSDT))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jDiemTichLuy)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDTL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jMaKH)
                        .addComponent(jTextMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNgaysinh)
                        .addComponent(jEmail))
                    .addComponent(jNgaySinhpick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTenKH)
                    .addComponent(jTextCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCMND)
                    .addComponent(jTextTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDTL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDiemTichLuy))
                .addGap(25, 25, 25))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/head (2).png"))); // NOI18N
        jLabel1.setText("Quản Lý Khách Hàng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Thông tin khách hàng");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));

        jButtonThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_sign-add_299068 (1).png"))); // NOI18N
        jButtonThem.setText("Thêm");
        jButtonThem.setToolTipText("");
        jButtonThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonThem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonThem.setPreferredSize(new java.awt.Dimension(87, 41));
        jButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemActionPerformed(evt);
            }
        });

        jButtonSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_pencil_1055013 (1).png"))); // NOI18N
        jButtonSua.setText("Sửa");
        jButtonSua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonSua.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonSua.setMaximumSize(new java.awt.Dimension(95, 41));
        jButtonSua.setMinimumSize(new java.awt.Dimension(95, 41));
        jButtonSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaActionPerformed(evt);
            }
        });

        jButtonLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_floppy_285657 (1).png"))); // NOI18N
        jButtonLuu.setText("Lưu");
        jButtonLuu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonLuu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLuuActionPerformed(evt);
            }
        });

        jTableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKH);

        jButtonHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_Delete_1493279.png"))); // NOI18N
        jButtonHuy.setText("Hủy");
        jButtonHuy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonHuy.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });

        jMKHTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMKHTK.setForeground(new java.awt.Color(102, 102, 102));
        jMKHTK.setText("Khách hàng");

        jButtonTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/iconfinder_Citycons_magnify_1342938.png"))); // NOI18N
        jButtonTimKiem.setText("Tìm kiếm");
        jButtonTimKiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonTimKiem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTimKiem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jMKHTK)
                        .addGap(18, 18, 18)
                        .addComponent(jTextTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLuu)
                    .addComponent(jButtonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMKHTK)
                    .addComponent(jTextTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTimKiem)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCMNDActionPerformed

    private void jTextMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMaKHActionPerformed

    private void jButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemActionPerformed
        controlTxb(true);
        clearTxb();
        jTextMaKH.setText(KhachHangBLL.generateId().toString());
        flag = 1;
    }//GEN-LAST:event_jButtonThemActionPerformed

    private void jButtonSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaActionPerformed
         controlTxb(true);
         flag = 2;
    }//GEN-LAST:event_jButtonSuaActionPerformed

    private void jButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLuuActionPerformed
        KhachHangDTO KH = new KhachHangDTO();
        bindingKH(KH);
        /*if (KhachHangBLL.checkValid(KH)) {
            JOptionPane.showMessageDialog(this, "Thông tin không hợp lệ");
        }*/

        switch (flag) {
            case 1: {
                if (KhachHangBLL.insertKH(KH)) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }

                break;
            }

            case 2: {
                if (KhachHangBLL.updateKH(KH)) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
                }

                break;
            }

            default:
                break;
        }

        bindingTableFormQLKH.bindingtbQLKH(jTableKH, KhachHangBLL.getAll());
        controlTxb(false);
    }//GEN-LAST:event_jButtonLuuActionPerformed

    private void jTextTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTenKHActionPerformed

    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        clearTxb();
        controlTxb(false);
    }//GEN-LAST:event_jButtonHuyActionPerformed
    //Load vao Textbox
    private void jTableKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKHMouseClicked
        {
            try {
                int row = jTableKH.getSelectedRow();
                jTextMaKH.setText(jTableKH.getValueAt(row, 0).toString());
                jTextTenKH.setText(jTableKH.getValueAt(row, 1).toString());
                jTextSDT.setText(jTableKH.getValueAt(row, 2).toString());
                jTextCMND.setText(jTableKH.getValueAt(row, 4).toString());
                jTextEmail.setText(jTableKH.getValueAt(row, 3).toString());
                String dateStr = jTableKH.getValueAt(row,5).toString();
                SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format1.parse(dateStr);
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                jNgaySinhpick.setSelectedDate(cal);
                controlTxb(false);
            } catch (ParseException ex) {
                Logger.getLogger(fQLKH.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_jTableKHMouseClicked

    private void jButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimKiemActionPerformed
        bindingTableFormQLKH.bindingtbQLKH(jTableKH, KhachHangBLL.searchByName(jTextTimKiem.getText()));
    }//GEN-LAST:event_jButtonTimKiemActionPerformed
    private void controlTxb(boolean control) {
        jButtonLuu.setEnabled(control);
        jButtonSua.setEnabled(!control);
        jButtonThem.setEnabled(!control);
        jTextMaKH.setEnabled(control);
        jTextTenKH.setEnabled(control);
        jTextSDT.setEnabled(control);
        jTextEmail.setEnabled(control);
        jTextCMND.setEnabled(control);
        jNgaySinhpick.setEnabled(control);
    }

    public void clearTxb() {
        jTextMaKH.setText("");
        jTextTenKH.setText("");
        jTextSDT.setText("");
        jTextEmail.setText("");
        jTextCMND.setText("");
        jTextDTL.setText("");
    }

    public boolean bindingKH(KhachHangDTO KH) {
        try{
            KH.SetMaKH(Integer.parseInt(jTextMaKH.getText()));
            KH.SetHoten(jTextTenKH.getText());
            KH.SetSDT(jTextSDT.getText());
            KH.SetEmail(jTextEmail.getText());
            KH.SetCMND(jTextCMND.getText());
            Calendar cal ;
            cal = jNgaySinhpick.getSelectedDate();
            Date datefm = cal.getTime();
            KH.SetNgaySinh(datefm);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    private int flag = 0;
    private KhachHangBLL KhachHangBLL = new KhachHangBLL();
    private Common.BindingTableFromQLKH bindingTableFormQLKH = new BindingTableFromQLKH();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JButton jButtonLuu;
    private javax.swing.JButton jButtonSua;
    private javax.swing.JButton jButtonThem;
    private javax.swing.JButton jButtonTimKiem;
    private javax.swing.JLabel jCMND;
    private javax.swing.JLabel jDiemTichLuy;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMKHTK;
    private javax.swing.JLabel jMaKH;
    private datechooser.beans.DateChooserCombo jNgaySinhpick;
    private javax.swing.JLabel jNgaysinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jSDT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKH;
    private javax.swing.JLabel jTenKH;
    private javax.swing.JTextField jTextCMND;
    private javax.swing.JTextField jTextDTL;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextMaKH;
    private javax.swing.JTextField jTextSDT;
    private javax.swing.JTextField jTextTenKH;
    private javax.swing.JTextField jTextTimKiem;
    // End of variables declaration//GEN-END:variables
}
