/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class calFloatnumber extends javax.swing.JFrame {

    /**
     * Creates new form calFloatnumber
     */
    public calFloatnumber() {
        initComponents();
        generateRandomNumber();
    }
    
private int count = 0;
private int score = 0;
private int sumScore = 0;
    private void generateRandomNumber() 
    {
        count++;
        switch (count) {
            case 1:
                {
                    Random rand = new Random();
                    double randomNumber1 = Math.round(rand.nextDouble() * 10) / 10.0;
                    double randomNumber2 = Math.round(rand.nextDouble() * 10) / 10.0;
                    String Number1 = String.format("%.2f", randomNumber1);
                    String Number2 = String.format("%.2f", randomNumber2);
                    double result1 = Double.parseDouble(Number1) + Double.parseDouble(Number2);
                    double result2 = Double.parseDouble(Number1) - Double.parseDouble(Number2) + 15;
                    double result3 = Double.parseDouble(Number1) * Double.parseDouble(Number2) -18;
                    double result4 = Double.parseDouble(Number1) * Double.parseDouble(Number2) * 23;
                    String strResult1 = String.format("%.2f", result1);
                    String strResult2 = String.format("%.2f", result2);
                    String strResult3 = String.format("%.2f", result3);
                    String strResult4 = String.format("%.2f", result4);
                    jLabel7.setText(Number1 + " + " + Number2);
                    jLabelAnswer1.setText("    " + strResult1);
                    jLabelAnswer2.setText("   " + strResult2);
                    jLabelAnswer3.setText("  " + strResult3);
                    jLabelAnswer4.setText("   " + strResult4);
                    break;
                }
            case 2:
                {
                    Random rand = new Random();
                    double randomNumber1 = Math.round(rand.nextDouble() * 1000) / 100.0;
                    double randomNumber2 = Math.round(rand.nextDouble() * 1000) / 100.0;
                    String Number1 = String.format("%.3f", randomNumber1);
                    String Number2 = String.format("%.3f", randomNumber2);
                    double result1 = Double.parseDouble(Number1) * Double.parseDouble(Number2) - 15;
                    double result2 = Double.parseDouble(Number1) - Double.parseDouble(Number2) + 18;
                    double result3 = Double.parseDouble(Number1) + Double.parseDouble(Number2);
                    double result4 = Double.parseDouble(Number1) * Double.parseDouble(Number2) * 23;
                    String strResult1 = String.format("%.3f", result1);
                    String strResult2 = String.format("%.3f", result2);
                    String strResult3 = String.format("%.3f", result3);
                    String strResult4 = String.format("%.3f", result4);
                    jLabel7.setText(Number1 + " + " + Number2);
                    jLabelAnswer1.setText("  " + strResult1);
                    jLabelAnswer2.setText("  " + strResult2);
                    jLabelAnswer3.setText("  " + strResult3);
                    jLabelAnswer4.setText(" " + strResult4);
                    break;
                }
            case 3:
                {
                    Random rand = new Random();
                    double randomNumber1 = Math.round(rand.nextDouble() * 10) / 10.0;
                    double randomNumber2 = Math.round(rand.nextDouble() * 10) / 10.0;
                    String Number1 = String.format("%.2f", randomNumber1);
                    String Number2 = String.format("%.2f", randomNumber2);
                    double result1 = Double.parseDouble(Number1) + Double.parseDouble(Number2) + 18;
                    double result2 = Double.parseDouble(Number1) * Double.parseDouble(Number2) * 23;
                    double result3 = Double.parseDouble(Number1) * Double.parseDouble(Number2) - 15;
                    double result4 = Double.parseDouble(Number1) - Double.parseDouble(Number2);
                    String strResult1 = String.format("%.2f", result1);
                    String strResult2 = String.format("%.2f", result2);
                    String strResult3 = String.format("%.2f", result3);
                    String strResult4 = String.format("%.2f", result4);
                    jLabel7.setText(Number1 + " - " + Number2);
                    jLabelAnswer1.setText("   " + strResult1);
                    jLabelAnswer2.setText("    " + strResult2);
                    jLabelAnswer3.setText("  " + strResult3);
                    jLabelAnswer4.setText("   " + strResult4);
                    break;
                }
            case 4:
                {
                    Random rand = new Random();
                    double randomNumber1 = Math.round(rand.nextDouble() * 1000) / 100.0;
                    double randomNumber2 = Math.round(rand.nextDouble() * 1000) / 100.0;
                    String Number1 = String.format("%.3f", randomNumber1);
                    String Number2 = String.format("%.3f", randomNumber2);
                    double result1 = Double.parseDouble(Number1) + Double.parseDouble(Number2) + 19;
                    double result2 = Double.parseDouble(Number1) - Double.parseDouble(Number2);
                    double result3 = Double.parseDouble(Number1) * Double.parseDouble(Number2) - 15;
                    double result4 = Double.parseDouble(Number1) * Double.parseDouble(Number2) * 23;
                    String strResult1 = String.format("%.3f", result1);
                    String strResult2 = String.format("%.3f", result2);
                    String strResult3 = String.format("%.3f", result3);
                    String strResult4 = String.format("%.3f", result4);
                    jLabel7.setText(Number1 + " - " + Number2);
                    jLabelAnswer1.setText("  " + strResult1);
                    jLabelAnswer2.setText("  " + strResult2);
                    jLabelAnswer3.setText(" " + strResult3);
                    jLabelAnswer4.setText("  " + strResult4);
                    break;
                }
            case 5:
                {
                    Random rand = new Random();
                    double randomNumber1 = Math.round(rand.nextDouble() * 10) / 10.0;
                    double randomNumber2 = Math.round(rand.nextDouble() * 10) / 10.0;
                    String Number1 = String.format("%.2f", randomNumber1);
                    String Number2 = String.format("%.2f", randomNumber2);
                    double result1 = Double.parseDouble(Number1) * Double.parseDouble(Number2) * 23;
                    double result2 = Double.parseDouble(Number1) - Double.parseDouble(Number2) + 96;
                    double result3 = Double.parseDouble(Number1) + Double.parseDouble(Number2) - 54;
                    double result4 = Double.parseDouble(Number1) * Double.parseDouble(Number2);
                    String strResult1 = String.format("%.2f", result1);
                    String strResult2 = String.format("%.2f", result2);
                    String strResult3 = String.format("%.2f", result3);
                    String strResult4 = String.format("%.2f", result4);
                    jLabel7.setText(Number1 + " x " + Number2);
                    jLabelAnswer1.setText("   " + strResult1);
                    jLabelAnswer2.setText("   " + strResult2);
                    jLabelAnswer3.setText("  " + strResult3);
                    jLabelAnswer4.setText("    " + strResult4);
                    break;
                }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelAnswer2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelAnswer4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabelAnswer1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelAnswer3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(153, 136, 112));

        jLabelAnswer2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelAnswer2.setForeground(new java.awt.Color(255, 102, 102));
        jLabelAnswer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAnswer2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jLabelAnswer4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelAnswer4.setForeground(new java.awt.Color(56, 90, 112));
        jLabelAnswer4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAnswer4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jLabelAnswer1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelAnswer1.setForeground(new java.awt.Color(71, 124, 97));
        jLabelAnswer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAnswer1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jLabelAnswer3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelAnswer3.setForeground(new java.awt.Color(204, 102, 0));
        jLabelAnswer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAnswer3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Game Calculate Float Number");

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelAnswer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAnswer2MouseClicked
        // TODO add your handling code here:
        switch (count) {
            case 1 :          
            sumScore = score;
            generateRandomNumber();
            break;
            case 2:
            sumScore = score;
            generateRandomNumber();
            break;
            case 3 :  
            sumScore = score;
            generateRandomNumber();
            break;
            case 4 :
            score++; 
            sumScore = score;
            generateRandomNumber();
            break;
            case 5:
            JOptionPane.showMessageDialog(this,"Yor Score : " + sumScore);
            this.setVisible(false);
            new Homepage().setVisible(true);
            break;
        }
    }//GEN-LAST:event_jLabelAnswer2MouseClicked

    private void jLabelAnswer4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAnswer4MouseClicked
        // TODO add your handling code here:
        switch (count) {
            case 1 :
            sumScore = score;
            generateRandomNumber();
            break;
            case 2 :
            sumScore = score;
            generateRandomNumber();
            break;
            case 3:
            score++;    
            sumScore = score;
            generateRandomNumber();
            break;
            case 4 : 
            sumScore = score;
            generateRandomNumber();
            break;
            case 5:
            score++;
            sumScore = score;
            JOptionPane.showMessageDialog(this,"Yor Score : " + sumScore);
            this.setVisible(false);
            new Homepage().setVisible(true);
            break;
        }
    }//GEN-LAST:event_jLabelAnswer4MouseClicked

    private void jLabelAnswer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAnswer1MouseClicked
        // TODO add your handling code here:
        switch (count)
        {
            case 1 :
            score++;
            sumScore = score;
            generateRandomNumber();
            break;
            case 2 :
            sumScore = score;
            generateRandomNumber();
            break;
            case 3:
            sumScore = score;
            generateRandomNumber();
            break;
            case 4:          
            sumScore = score;
            generateRandomNumber();
            break;
            case 5:
            JOptionPane.showMessageDialog(this,"Yor Score : " + sumScore);
            this.setVisible(false);
            new Homepage().setVisible(true);
            break;
        }
    }//GEN-LAST:event_jLabelAnswer1MouseClicked

    private void jLabelAnswer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAnswer3MouseClicked
        // TODO add your handling code here:
        switch (count) {
            case 1:     
            sumScore = score;
            generateRandomNumber();
            break;
            case 2 :
            score++;    
            sumScore = score;
            generateRandomNumber();
            break;
            case 3:
            sumScore = score;
            generateRandomNumber();
            break;
            case 4:
            sumScore = score;
            generateRandomNumber();
            break;
            case 5:
            JOptionPane.showMessageDialog(this,"Yor Score : " + sumScore);
            this.setVisible(false);
            new Homepage().setVisible(true);
            break;
        }

    }//GEN-LAST:event_jLabelAnswer3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Homepage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(calFloatnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calFloatnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calFloatnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calFloatnumber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calFloatnumber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAnswer1;
    private javax.swing.JLabel jLabelAnswer2;
    private javax.swing.JLabel jLabelAnswer3;
    private javax.swing.JLabel jLabelAnswer4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
