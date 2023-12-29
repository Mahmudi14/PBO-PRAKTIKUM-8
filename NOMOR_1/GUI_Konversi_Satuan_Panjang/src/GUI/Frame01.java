package GUI;

public class Frame01 extends javax.swing.JFrame {

    public Frame01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        inputan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        typeInputan = new javax.swing.JComboBox<>();
        konversiButton = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        typeOuput = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        inputan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputanActionPerformed(evt);
            }
        });

        jLabel2.setText("Panjang : ");

        typeInputan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KiloMeter", "HektoMeter", "DekaMeter", "Meter", "DesiMeter", "CentiMeter", "MiliMeter" }));

        konversiButton.setText("Konversi");
        konversiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiButtonActionPerformed(evt);
            }
        });

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        typeOuput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KiloMeter", "HektoMeter", "DekaMeter", "Meter", "DesiMeter", "CentiMeter", "MiliMeter" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(hasil, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(inputan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(konversiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeInputan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeOuput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(typeInputan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeOuput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(konversiButton)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputanActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void konversiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiButtonActionPerformed
        int pilihanInputan;
        int pilihanOutput;
        double panjang;
        double hasilx= 0;
        double output =0;

        panjang = Double.parseDouble(inputan.getText());
        pilihanInputan = typeInputan.getSelectedIndex();
        pilihanOutput = typeOuput.getSelectedIndex();

        switch (pilihanInputan) {
            case 0:
                hasilx = panjang / 1;
                break;
            case 1:
                hasilx = panjang / 10;
                break;
            case 2:
                hasilx = panjang / 100;
                break;
            case 3:
                hasilx = panjang / 1000;
                break;
            case 4:
                hasilx = panjang / 10000;
                break;
            case 5:
                hasilx = panjang / 100000;
                break;
            case 6:
                hasilx = panjang / 1000000;
                break;
        }

        switch (pilihanOutput) {
            case 0:
                output = hasilx * 1;
                break;
            case 1:
                output = hasilx * 10;
                break;
            case 2:
                output = hasilx * 100;
                break;
            case 3:
                output = hasilx * 1000;
                break;
            case 4:
                output = hasilx * 10000;
                break;
            case 5:
                output = hasilx * 100000;
                break;
            case 6:
                output = hasilx * 1000000;
                break;
        }

        hasil.setText(String.valueOf(output));
    }//GEN-LAST:event_konversiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Frame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frame01 frame = new Frame01();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hasil;
    private javax.swing.JTextField inputan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton konversiButton;
    private javax.swing.JComboBox<String> typeInputan;
    private javax.swing.JComboBox<String> typeOuput;
    // End of variables declaration//GEN-END:variables
}
