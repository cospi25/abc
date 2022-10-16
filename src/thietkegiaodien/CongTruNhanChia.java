/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thietkegiaodien;

/**
 *
 * @author ADMIN
 */
public class CongTruNhanChia extends javax.swing.JFrame {
    int sum = 0;
    /**
     * Creates new form CongTruNhanChia
     */
    public CongTruNhanChia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RB_Cong = new javax.swing.JRadioButton();
        RB_Tru = new javax.swing.JRadioButton();
        RB_Nhan = new javax.swing.JRadioButton();
        RB_Chia = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        B_Tinh = new javax.swing.JButton();
        text_NhapB = new javax.swing.JTextField();
        text_KetQua = new javax.swing.JTextField();
        text_NhapA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chuong Trinh Tinh + - * / by devHoang");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chon Phep Tinh"));

        buttonGroup1.add(RB_Cong);
        RB_Cong.setText("Cong");
        RB_Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_CongActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB_Tru);
        RB_Tru.setText("Tru");
        RB_Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_TruActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB_Nhan);
        RB_Nhan.setText("Nhan");
        RB_Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_NhanActionPerformed(evt);
            }
        });

        buttonGroup1.add(RB_Chia);
        RB_Chia.setText("Chia");
        RB_Chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_ChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_Tru)
                    .addComponent(RB_Cong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RB_Chia)
                    .addComponent(RB_Nhan))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_Cong)
                    .addComponent(RB_Nhan))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB_Tru)
                    .addComponent(RB_Chia))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel1.setText("Nhap A:");

        jLabel2.setText("Nhap B:");

        jLabel3.setText("Ket Qua");

        B_Tinh.setText("Tinh");
        B_Tinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TinhActionPerformed(evt);
            }
        });

        text_KetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_KetQuaActionPerformed(evt);
            }
        });

        text_NhapA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_NhapAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_NhapB, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(text_NhapA, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_KetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(B_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(text_NhapB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_KetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text_NhapA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(B_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_KetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_KetQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_KetQuaActionPerformed

    private void text_NhapAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_NhapAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_NhapAActionPerformed

    private void B_TinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TinhActionPerformed
        // TODO add your handling code here:
        RB_Cong.setActionCommand("Cong");
        RB_Tru.setActionCommand("Tru");
        RB_Nhan.setActionCommand("Nhan");
        RB_Chia.setActionCommand("Chia");
        if(buttonGroup1.getSelection().getActionCommand()== "Cong"){
            RB_CongActionPerformed(evt);
            text_KetQua.setText(sum+ "");        
        }
        
        if(buttonGroup1.getSelection().getActionCommand()== "Tru"){
            RB_TruActionPerformed(evt);
            text_KetQua.setText(sum+ "");        
        }
        
        if(buttonGroup1.getSelection().getActionCommand()== "Nhan"){
            RB_NhanActionPerformed(evt);
            text_KetQua.setText(sum+ "");        
        }        
        
        if(buttonGroup1.getSelection().getActionCommand()== "Chia"){
            this.RB_ChiaActionPerformed(evt);
            this.text_KetQua.setText(sum+ "");        
        }
    }//GEN-LAST:event_B_TinhActionPerformed

    private void RB_CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_CongActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(text_NhapA.getText());
        int b = Integer.parseInt(text_NhapB.getText());
        sum  = a + b;  
    }//GEN-LAST:event_RB_CongActionPerformed

    private void RB_TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_TruActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(text_NhapA.getText());
        int b = Integer.parseInt(text_NhapB.getText());
        sum  = a - b;  
    }//GEN-LAST:event_RB_TruActionPerformed

    private void RB_NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_NhanActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(text_NhapA.getText());
        int b = Integer.parseInt(text_NhapB.getText());
        sum  = a * b;     
//        text_KetQua.setText(sum+ "");        
    }//GEN-LAST:event_RB_NhanActionPerformed

    private void RB_ChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_ChiaActionPerformed
        // TODO add your handling code here:
        int a = Integer.parseInt(text_NhapA.getText());
        int b = Integer.parseInt(text_NhapB.getText());
        sum  = a / b;  
//        text_KetQua.setText(sum+ "");
    }//GEN-LAST:event_RB_ChiaActionPerformed

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
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CongTruNhanChia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Tinh;
    private javax.swing.JRadioButton RB_Chia;
    private javax.swing.JRadioButton RB_Cong;
    private javax.swing.JRadioButton RB_Nhan;
    private javax.swing.JRadioButton RB_Tru;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text_KetQua;
    private javax.swing.JTextField text_NhapA;
    private javax.swing.JTextField text_NhapB;
    // End of variables declaration//GEN-END:variables
}
