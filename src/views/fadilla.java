/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;
/**
 *
 * @author WINDOWS 10
 */
public class fadilla extends javax.swing.JFrame {

    /**
     * Creates new form fadilla
     */
    public fadilla() {
        initComponents();
        this.setExtendedState(WIDTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void chk_jpgActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void chk_koreaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txt_biayaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void op_siangActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        cmb_kelas.setSelectedIndex(1);
    }                                        

    private void op_pagiItemStateChanged(java.awt.event.ItemEvent evt) {                                         
        // TODO add your handling code here:
        cmb_kelas.setSelectedIndex(0);
    }                                        

    private void btnokItemStateChanged(java.awt.event.ItemEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton2ItemStateChanged(java.awt.event.ItemEvent evt) {                                          
        // TODO add your handling code here:
        dispose();
    }                                         

    private void cmb_koreaItemStateChanged(java.awt.event.ItemEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void cmb_BIGItemStateChanged(java.awt.event.ItemEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void op_pagiActionPerformed(java.awt.event.ActionEvent evt) {                                        
       cmb_kelas.setSelectedIndex(0); // TODO add your handling code here:
    }                                       

    private void op_malamActionPerformed(java.awt.event.ActionEvent evt) {                                         
       cmb_kelas.setSelectedIndex(2); // TODO add your handling code here:
    }                                        

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        double biaya = 0;
        if (chk_BIG.isSelected())
        {
                if (cmb_BIG.getSelectedItem().toString()=="Pemula")
                    biaya=biaya+250000;
                else
                    biaya=biaya+250000+50000;
        }
                if (chk_SBM.isSelected())
        {
                if (cmb_SBM.getSelectedItem().toString()=="Saintek+Soshum")
                    biaya=biaya+250000+50000;
                else
                    biaya=biaya+250000;
        }
                if (chk_UN.isSelected())
        {
                if (cmb_UN.getSelectedItem().toString()=="SD/MI")
                    biaya=biaya+200000;
                else
                    biaya=biaya+200000+50000;
        }
                if (chk_arab.isSelected())
        {
                if (cmb_arab.getSelectedItem().toString()=="Pemula")
                    biaya=biaya+300000;
                else
                    biaya=biaya+300000+50000;
        }
                if (chk_jerman.isSelected())
        {
                if (cmb_jerman.getSelectedItem().toString()=="Pemula")
                    biaya=biaya+1000000+500000;
                else
                    biaya=biaya+1000000+1000000;
        }
        if (chk_korea.isSelected())
        {
                if (cmb_korea.getSelectedItem().toString()=="Pemula")
                    biaya=biaya+300000;
                else
                    biaya=biaya+300000+50000;
        }
        if (chk_jpg.isSelected())
        {
                if (cmb_jpg.getSelectedItem().toString()=="Pemula")
                    biaya=biaya+300000;
                else
                    biaya=biaya+300000+50000;
        }
                if (chk_mndrin.isSelected())
        {
                if (cmb_mndrin.getSelectedItem().toString()=="Pemula")
                    biaya=biaya+300000;
                else
                    biaya=biaya+300000+50000;
        }
        if (op_pagi.isSelected()) {
           biaya = biaya + (biaya*0.1);
        }else if (op_siang.isSelected()) {
           biaya = biaya + (biaya*0.15); 
        }else if (op_malam.isSelected()) {
           biaya = biaya + (biaya*0.2);
        }
        txt_biaya.setText(String.valueOf(biaya));
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
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
            java.util.logging.Logger.getLogger(fadilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fadilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fadilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fadilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fadilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
private javax.swing.JButton btnok;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_BIG;
    private javax.swing.JCheckBox chk_SBM;
    private javax.swing.JCheckBox chk_UN;
    private javax.swing.JCheckBox chk_arab;
    private javax.swing.JCheckBox chk_jerman;
    private javax.swing.JCheckBox chk_jpg;
    private javax.swing.JCheckBox chk_korea;
    private javax.swing.JCheckBox chk_mndrin;
    private javax.swing.JComboBox<String> cmb_BIG;
    private javax.swing.JComboBox<String> cmb_SBM;
    private javax.swing.JComboBox<String> cmb_UN;
    private javax.swing.JComboBox<String> cmb_arab;
    private javax.swing.JComboBox<String> cmb_jerman;
    private javax.swing.JComboBox<String> cmb_jpg;
    private javax.swing.JComboBox<String> cmb_kelas;
    private javax.swing.JComboBox<String> cmb_korea;
    private javax.swing.JComboBox<String> cmb_mndrin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton op_malam;
    private javax.swing.JRadioButton op_pagi;
    private javax.swing.JRadioButton op_siang;
    private javax.swing.JTextField txt_biaya;
    // End of variables declaration                   
}

