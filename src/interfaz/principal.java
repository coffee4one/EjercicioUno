/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtinversionuno = new javax.swing.JTextField();
        txtinversiondos = new javax.swing.JTextField();
        txtporcentajeuno = new javax.swing.JTextField();
        txtporcentajedos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel1.setText("Calcular el porcentaje invertido por dos personas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 360, 30));

        jLabel2.setText("inversion de la persona uno:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 30));

        jLabel3.setText("inversion de la persona dos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 30));

        cmdcalcular.setText("calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        cmdborrar.setText("borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel4.setText("Porcetaje de la perosona uno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setText("Porcentaje de la persona dos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        txtinversionuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinversionunoActionPerformed(evt);
            }
        });
        txtinversionuno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinversionunoKeyTyped(evt);
            }
        });
        jPanel1.add(txtinversionuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        txtinversiondos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinversiondosKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtinversiondosKeyPressed(evt);
            }
        });
        jPanel1.add(txtinversiondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, -1));

        txtporcentajeuno.setEditable(false);
        jPanel1.add(txtporcentajeuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 90, -1));

        txtporcentajedos.setEditable(false);
        jPanel1.add(txtporcentajedos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        String num1, num2, res1, res2;
        double n1,n2,result1,result2,suma;
        if (txtinversionuno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el primer valor", "Error", JOptionPane.ERROR_MESSAGE);
            txtinversionuno.requestFocusInWindow();
        }else if (txtinversiondos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el segundo valor", "Error", JOptionPane.ERROR_MESSAGE);
            txtinversiondos.requestFocusInWindow();
        }else{
            n1=Double.parseDouble(txtinversionuno.getText());
            n2=Double.parseDouble(txtinversiondos.getText());
            suma=n1+n2;
            result1=(n1*100)/suma;
            result2=(n2*100)/suma;
            
            res1=String.valueOf(result1);
            res2=String.valueOf(result2);
            
            txtporcentajeuno.setText(res1);
            txtporcentajedos.setText(res2);
        }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
            txtinversionuno.setText("");
            txtinversiondos.setText("");
            txtporcentajeuno.setText("");
            txtporcentajedos.setText("");
           
            txtinversionuno.requestFocusInWindow();
    }//GEN-LAST:event_cmdborrarActionPerformed

    private void txtinversionunoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinversionunoKeyTyped
            char c=evt.getKeyChar();
            
            if (!Character.isDigit(c) && c != '.') {
                getToolkit().beep();
                evt.consume();
        }
    }//GEN-LAST:event_txtinversionunoKeyTyped

    private void txtinversiondosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinversiondosKeyPressed

    }//GEN-LAST:event_txtinversiondosKeyPressed

    private void txtinversionunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinversionunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinversionunoActionPerformed

    private void txtinversiondosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinversiondosKeyTyped
            char c=evt.getKeyChar();
            
            if (!Character.isDigit(c) && c != '.') {
                getToolkit().beep();
                evt.consume();
        }
    }//GEN-LAST:event_txtinversiondosKeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtinversiondos;
    private javax.swing.JTextField txtinversionuno;
    private javax.swing.JTextField txtporcentajedos;
    private javax.swing.JTextField txtporcentajeuno;
    // End of variables declaration//GEN-END:variables
}
