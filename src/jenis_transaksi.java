/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class jenis_transaksi extends javax.swing.JFrame {

    /**
     * Creates new form jenis_transaksi
     */
    public jenis_transaksi() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saldo = new javax.swing.JButton();
        penyetoran = new javax.swing.JButton();
        penarikan = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tarik = new javax.swing.JTextField();
        Setor = new javax.swing.JTextField();
        ket = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PILIH JENIS TRANSAKSI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 40, 240, 40);

        jLabel4.setFont(new java.awt.Font("FFF", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ATM BNI SYARIAH BOJONEGORO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 10, 320, 40);

        saldo.setText("INFORMASI SALDO");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        getContentPane().add(saldo);
        saldo.setBounds(40, 90, 140, 30);

        penyetoran.setText("PENYETORAN");
        penyetoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penyetoranActionPerformed(evt);
            }
        });
        getContentPane().add(penyetoran);
        penyetoran.setBounds(40, 140, 140, 30);

        penarikan.setText("PENARIKAN");
        penarikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikanActionPerformed(evt);
            }
        });
        getContentPane().add(penarikan);
        penarikan.setBounds(220, 140, 140, 30);

        jButton4.setText("PETUNJUK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(220, 90, 140, 30);

        jButton5.setText("KELUAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(130, 280, 140, 30);
        getContentPane().add(tarik);
        tarik.setBounds(220, 180, 140, 30);
        getContentPane().add(Setor);
        Setor.setBounds(40, 180, 140, 30);

        ket.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ket.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(ket);
        ket.setBounds(40, 230, 220, 30);

        hasil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        hasil.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hasil);
        hasil.setBounds(240, 230, 140, 30);

        jPanel1.setBackground(new java.awt.Color(255, 163, 49));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 330);

        setSize(new java.awt.Dimension(416, 368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
        int saldo = 150000;
        ket.setText("SALDO YANG ANDA MILIKI");
        hasil.setText(""+saldo);
    }//GEN-LAST:event_saldoActionPerformed

    private void penarikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikanActionPerformed
        // TODO add your handling code here:
        String tarikan = tarik.getText();
            int saldo = 150000;
            int jmltarik = Integer.parseInt(tarikan);
            int total = saldo-jmltarik;
        hasil.setText(""+total);
    }//GEN-LAST:event_penarikanActionPerformed

    private void penyetoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penyetoranActionPerformed
        // TODO add your handling code here:
        String setor = Setor.getText();
        String saldolast = hasil.getText();
        hasil.setText(""+saldolast);
        int jmlsetor = Integer.parseInt(setor);
        int lastsaldo = Integer.parseInt(saldolast);
        int total = lastsaldo+jmlsetor;
        hasil.setText(""+total);
    }//GEN-LAST:event_penyetoranActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new petunjuk().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(jenis_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jenis_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jenis_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jenis_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* saldond display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jenis_transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Setor;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ket;
    private javax.swing.JButton penarikan;
    private javax.swing.JButton penyetoran;
    private javax.swing.JButton saldo;
    private javax.swing.JTextField tarik;
    // End of variables declaration//GEN-END:variables
}
