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
public class calNumberJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form calNumberJFrame1
     */
    public calNumberJFrame1() {
        initComponents();
        jLabel31.setText(randomNumberStr1 + " + " + randomNumberStr2 + " * " + randomNumberStr3 + " - " + randomNumberStr4 + " = " + " ?");
    }
        Random rand = new Random();
        int randomNumber1 = rand.nextInt(10);
        int randomNumber2 = rand.nextInt(10);
        int randomNumber3 = rand.nextInt(10);
        int randomNumber4 = rand.nextInt(10);
        
        String randomNumberStr1 = String.valueOf(randomNumber1);
        String randomNumberStr2 = String.valueOf(randomNumber2);
        String randomNumberStr3 = String.valueOf(randomNumber3);
        String randomNumberStr4 = String.valueOf(randomNumber4);
        
    private boolean isNumeric(String str) 
    {
        try 
        {
            Integer.valueOf(str);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jinput = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 255));

        jinput.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jinput.setForeground(new java.awt.Color(88, 132, 132));
        jinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinputActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 124, 214));
        jLabel32.setText("Question 1");

        jButton3.setBackground(new java.awt.Color(117, 117, 202));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(0, 191, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jinput, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(236, 236, 236))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel32))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jinput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
calculateNumber c = new calculateNumber();
    private void jinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinputActionPerformed
        // TODO add your handling code here:
        c.number1 = randomNumber1;
        c.number2 = randomNumber2;
        c.number3 = randomNumber3;
        c.number4 = randomNumber4;
        c.result = c.number1 + c.number2 * c.number3 - c.number4;
        String strResult = String.valueOf(c.result);
        String input = jinput.getText();
        if(isNumeric(input))
        {
            if(input.equals(strResult))
            {
                JOptionPane.showMessageDialog(this,"Congrate you pass!!");
                setVisible(false);
                new calNumberJFrame2().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Nice try!!");
                JOptionPane.showMessageDialog(this,"The correct answer is " + strResult);
                JOptionPane.showMessageDialog(this,"Your score : 0");
                setVisible(false);
                new Homepage().setVisible(true);
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"Please Enter a number!!");
            jinput.setText("");
        }
        
    }//GEN-LAST:event_jinputActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Homepage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(calNumberJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calNumberJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calNumberJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calNumberJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calNumberJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JTextField jinput;
    // End of variables declaration//GEN-END:variables
}
