/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Viet Anh
 */
public class fMain extends javax.swing.JFrame {

    /**
     * Creates new form fMain
     */
    public fMain() {
        initComponents();
        centerForm();
        btnQLNhanVien.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        btnQLNhanVien = new javax.swing.JLabel();
        btnQuanLySach = new javax.swing.JLabel();
        btnQLPhieuNhap = new javax.swing.JLabel();
        btnTaoDonHang = new javax.swing.JLabel();
        btnQuanLyDonHang = new javax.swing.JLabel();
        btnQLKhachHang = new javax.swing.JLabel();
        layeredPanelContain = new javax.swing.JLayeredPane();
        fQuanLySach1 = new GUI.fQuanLySach();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containPanel.setBackground(new java.awt.Color(153, 153, 153));
        containPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(new java.awt.Color(51, 51, 51));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLNhanVien.setForeground(new java.awt.Color(204, 204, 204));
        btnQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/quill.png"))); // NOI18N
        btnQLNhanVien.setText("Quản lý Nhân Viên");
        btnQLNhanVien.setPreferredSize(new java.awt.Dimension(165, 32));
        btnQLNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLNhanVienMouseClicked(evt);
            }
        });
        sideBarPanel.add(btnQLNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 45));

        btnQuanLySach.setBackground(new java.awt.Color(204, 204, 204));
        btnQuanLySach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLySach.setForeground(new java.awt.Color(204, 204, 204));
        btnQuanLySach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/book.png"))); // NOI18N
        btnQuanLySach.setText(" Quản lý sách");
        btnQuanLySach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLySachMouseClicked(evt);
            }
        });
        sideBarPanel.add(btnQuanLySach, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 45));

        btnQLPhieuNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLPhieuNhap.setForeground(new java.awt.Color(204, 204, 204));
        btnQLPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/quill.png"))); // NOI18N
        btnQLPhieuNhap.setText("Quản lý phiếu nhập");
        btnQLPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLPhieuNhapMouseClicked(evt);
            }
        });
        sideBarPanel.add(btnQLPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 45));

        btnTaoDonHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaoDonHang.setForeground(new java.awt.Color(204, 204, 204));
        btnTaoDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shopping-cart.png"))); // NOI18N
        btnTaoDonHang.setText("Tạo Đơn hàng");
        btnTaoDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoDonHangMouseClicked(evt);
            }
        });
        sideBarPanel.add(btnTaoDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 40));

        btnQuanLyDonHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuanLyDonHang.setForeground(new java.awt.Color(204, 204, 204));
        btnQuanLyDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/checklist.png"))); // NOI18N
        btnQuanLyDonHang.setText("Quản Lý Đơn Hàng");
        btnQuanLyDonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyDonHangMouseClicked(evt);
            }
        });
        sideBarPanel.add(btnQuanLyDonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 40));

        btnQLKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLKhachHang.setForeground(new java.awt.Color(204, 204, 204));
        btnQLKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/quill.png"))); // NOI18N
        btnQLKhachHang.setText("Quản lý Khách Hàng");
        btnQLKhachHang.setPreferredSize(new java.awt.Dimension(165, 32));
        btnQLKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQLKhachHangMouseClicked(evt);
            }
        });
        sideBarPanel.add(btnQLKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 235, 180, 50));

        containPanel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 540));

        layeredPanelContain.setBackground(new java.awt.Color(102, 102, 102));
        layeredPanelContain.setLayout(new java.awt.CardLayout());
        layeredPanelContain.add(fQuanLySach1, "card2");

        containPanel.add(layeredPanelContain, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 870, 540));

        getContentPane().add(containPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLySachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySachMouseClicked
        fQuanLySach qlSach = new fQuanLySach();
        resetColor();
        btnQuanLySach.setForeground(Color.WHITE);
        swichPanel(qlSach);
    }//GEN-LAST:event_btnQuanLySachMouseClicked

    private void btnQLPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLPhieuNhapMouseClicked
        fQLPhieuNhap fQLPhieuNhap = new fQLPhieuNhap();
        resetColor();
        btnQLPhieuNhap.setForeground(Color.WHITE);
        swichPanel(fQLPhieuNhap);
    }//GEN-LAST:event_btnQLPhieuNhapMouseClicked

    private void btnTaoDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoDonHangMouseClicked
        fTaoDonHang donhang = null;
        try {
            donhang = new fTaoDonHang();
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(fMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        swichPanel(donhang);        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaoDonHangMouseClicked

    private void btnQLKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLKhachHangMouseClicked
        fQLKH qlKH = new fQLKH();
        resetColor();
        btnQLKhachHang.setForeground(Color.WHITE);
        swichPanel(qlKH);
    }//GEN-LAST:event_btnQLKhachHangMouseClicked

    private void btnQLNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQLNhanVienMouseClicked
        fQLNV qlNV = new fQLNV();
        resetColor();
        btnQLNhanVien.setForeground(Color.WHITE);
        swichPanel(qlNV);
    }//GEN-LAST:event_btnQLNhanVienMouseClicked
    private void btnQuanLyDonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyDonHangMouseClicked
    fQuanLyDonHang qldh = null;
    qldh = new fQuanLyDonHang();
        swichPanel(qldh);         // TODO add your handling code here:
    }//GEN-LAST:event_btnQuanLyDonHangMouseClicked

    // Change the panel in layered panel
     public void swichPanel(JPanel panel) {
       layeredPanelContain.removeAll();
       layeredPanelContain.add(panel);
       layeredPanelContain.repaint();
       layeredPanelContain.revalidate();
    } 
     
     // Reset text color of all btnLable
     public void resetColor() {
          btnQuanLySach.setForeground(new Color(204, 204, 204));
          btnQLPhieuNhap.setForeground(new Color(204, 204, 204));
          btnQLNhanVien.setForeground(new Color(204, 204, 204));
          btnQLKhachHang.setForeground(new Color(204, 204, 204));
     }
     
     private void centerForm(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnQLKhachHang;
    private javax.swing.JLabel btnQLNhanVien;
    private javax.swing.JLabel btnQLPhieuNhap;
    private javax.swing.JLabel btnQuanLyDonHang;
    private javax.swing.JLabel btnQuanLySach;
    private javax.swing.JLabel btnTaoDonHang;
    private javax.swing.JPanel containPanel;
    private GUI.fQuanLySach fQuanLySach1;
    private javax.swing.JLayeredPane layeredPanelContain;
    private javax.swing.JPanel sideBarPanel;
    // End of variables declaration//GEN-END:variables
}
