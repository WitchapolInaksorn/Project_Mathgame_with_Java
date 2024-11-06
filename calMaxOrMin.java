
package project;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class calMaxOrMin extends javax.swing.JFrame {

    /**
     * Creates new form calMaxOrMin
     */
    public calMaxOrMin() {
        initComponents();
        generateRandomNumber();
    }
    private int count = 0;
    private int score = 0;
    
    private double max;
    private double min;
    
    private double findMax(double a, double b, double c) 
    {
        return Math.max(Math.max(a, b), c);
    }

    private double findMin(double a, double b, double c) 
    {
        return Math.min(Math.min(a, b), c);
    }

    private void generateRandomNumber() 
    {
        count++;
        if (count <= 5) 
        {
            Random rand = new Random();
            double randomNumber1 = Math.round(rand.nextDouble() * 1000) / 10.0;
            double randomNumber2 = Math.round(rand.nextDouble() * 1000) / 10.0;
            double randomNumber3 = Math.round(rand.nextDouble() * 1000) / 10.0;

            min = findMin(randomNumber1, randomNumber2, randomNumber3);

            String number1 = String.format("%.3f", randomNumber1);
            String number2 = String.format("%.3f", randomNumber2);
            String number3 = String.format("%.3f", randomNumber3);

            jLabelQ1.setText(" " + number1);
            jLabelQ2.setText(" " + number2);
            jLabelQ3.setText(" " + number3);
        }
        else if (count <= 10) 
        {
            Random rand = new Random();
            jLabel6.setForeground(Color.magenta);
            jLabel6.setText("Max ?");
            double randomNumber1 = Math.round(rand.nextDouble() * 1000) / 10.0;
            double randomNumber2 = Math.round(rand.nextDouble() * 1000) / 10.0;
            double randomNumber3 = Math.round(rand.nextDouble() * 1000) / 10.0;

            min = findMax(randomNumber1, randomNumber2, randomNumber3);

            String number1 = String.format("%.3f", randomNumber1);
            String number2 = String.format("%.3f", randomNumber2);
            String number3 = String.format("%.3f", randomNumber3);

            jLabelQ1.setText(" " + number1);
            jLabelQ2.setText(" " + number2);
            jLabelQ3.setText(" " + number3);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Your Score : " + score);
            this.setVisible(false);
            new Homepage().setVisible(true);
        }
    }
    private void updateScore(boolean isCorrect) 
    {
        if (isCorrect) 
        {
            score++;
        }
    }
    
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelQ1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelQ2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabelQ3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(186, 186, 221));

        jLabelQ1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelQ1.setForeground(new java.awt.Color(102, 0, 102));
        jLabelQ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelQ1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQ1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQ1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("  Which value is the ");

        jPanel4.setBackground(new java.awt.Color(210, 210, 106));

        jLabelQ2.setBackground(new java.awt.Color(51, 51, 51));
        jLabelQ2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelQ2.setForeground(new java.awt.Color(111, 144, 111));
        jLabelQ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelQ2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQ2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQ2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(227, 154, 107));

        jLabelQ3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabelQ3.setForeground(new java.awt.Color(255, 102, 102));
        jLabelQ3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelQ3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQ3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQ3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(117, 117, 202));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Min ?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(66, 66, 66)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelQ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQ1MouseClicked
        // TODO add your handling code here:    
        double clickedValue = Double.parseDouble(jLabelQ1.getText().trim());
        boolean isCorrectMin = (clickedValue == min);
        updateScore(isCorrectMin);
        boolean isCorrectMax = (clickedValue == max);
        updateScore(isCorrectMax);
        generateRandomNumber();
    }//GEN-LAST:event_jLabelQ1MouseClicked

    private void jLabelQ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQ2MouseClicked
        // TODO add your handling code here:
        double clickedValue = Double.parseDouble(jLabelQ2.getText().trim());
        boolean isCorrectMin = (clickedValue == min);
        updateScore(isCorrectMin);
        boolean isCorrectMax = (clickedValue == max);
        updateScore(isCorrectMax);
        generateRandomNumber();
    }//GEN-LAST:event_jLabelQ2MouseClicked

    private void jLabelQ3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQ3MouseClicked
        // TODO add your handling code here:
        double clickedValue = Double.parseDouble(jLabelQ3.getText().trim());
        boolean isCorrectMin = (clickedValue == min);
        updateScore(isCorrectMin);
        boolean isCorrectMax = (clickedValue == max);
        updateScore(isCorrectMax);
        generateRandomNumber();
    }//GEN-LAST:event_jLabelQ3MouseClicked

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
            java.util.logging.Logger.getLogger(calMaxOrMin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calMaxOrMin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calMaxOrMin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calMaxOrMin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calMaxOrMin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelQ1;
    private javax.swing.JLabel jLabelQ2;
    private javax.swing.JLabel jLabelQ3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables

}
