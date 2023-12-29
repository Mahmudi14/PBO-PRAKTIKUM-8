package GUI;

public class GUIKoversiNilai extends javax.swing.JFrame {

    /**
     * Creates new form GUIKoversiWeb
     */
    public GUIKoversiNilai() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputanNilai = new javax.swing.JTextField();
        inputanHuruf = new javax.swing.JTextField();
        konversiHurufButton = new javax.swing.JButton();
        konversiAngkaButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(200, 200));

        jLabel3.setText("Nilai Angka");

        jLabel4.setText("Nilai Huruf");

        inputanNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputanNilaiActionPerformed(evt);
            }
        });

        konversiHurufButton.setText("Konversi Huruf");
        konversiHurufButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiHurufButtonActionPerformed(evt);
            }
        });

        konversiAngkaButton.setText("Konversi Angka");
        konversiAngkaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiAngkaButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inputanNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(konversiHurufButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inputanHuruf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(konversiAngkaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputanNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(konversiHurufButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputanHuruf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(konversiAngkaButton))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputanNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputanNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputanNilaiActionPerformed

    private void konversiHurufButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiHurufButtonActionPerformed
        int nilai = Integer.parseInt(inputanNilai.getText());
        inputanHuruf.setText(nilaiHuruf(nilai));
    }//GEN-LAST:event_konversiHurufButtonActionPerformed

    private void konversiAngkaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiAngkaButtonActionPerformed
        String nilai = inputanHuruf.getText();
        inputanNilai.setText(nilaiAngka(nilai));
    }//GEN-LAST:event_konversiAngkaButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputanHuruf.setText("");
        inputanNilai.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed
    
    private String nilaiHuruf(int nilai){
        String huruf;

        if (nilai <= 100 && nilai >= 85) {
            huruf = "A";
        } else if (nilai <= 100 && nilai >= 80) {
            huruf = "A-";
        } else if (nilai <= 100 && nilai >= 75) {
            huruf = "B+";
        } else if (nilai <= 100 && nilai >= 70) {
            huruf = "B";
        } else if (nilai <= 100 && nilai >= 65) {
            huruf = "B-";
        } else if (nilai <= 100 && nilai >= 50) {
            huruf = "C";
        } else if (nilai <= 100 && nilai >= 40) {
            huruf = "D";
        } else if (nilai <= 100 && nilai >= 0) {
            huruf = "E";
        } else {
            huruf = "Nilai Tidak Valid";
        }
        return huruf;
    }
    
    private String nilaiAngka(String nilai){
        String angka;
        
        if (nilai.equalsIgnoreCase("A")) {
            angka = "85-100";
        } else if (nilai.equalsIgnoreCase("A-")) {
            angka = "80-84";
        } else if (nilai.equalsIgnoreCase("B+")) {
            angka = "75-79";
        } else if (nilai.equalsIgnoreCase("B")) {
            angka = "70-74";
        } else if (nilai.equalsIgnoreCase("B-")) {
            angka = "65-69";
        } else if (nilai.equalsIgnoreCase("C")) {
            angka = "50-64";
        } else if (nilai.equalsIgnoreCase("D")) {
            angka = "40-49";
        } else if (nilai.equalsIgnoreCase("E")) {
            angka = "0-40";
        } else {
            angka = "Huruf Tidak Valid";
        }
        return angka;
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
            java.util.logging.Logger.getLogger(GUIKoversiNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIKoversiNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIKoversiNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIKoversiNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIKoversiNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField inputanHuruf;
    private javax.swing.JTextField inputanNilai;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton konversiAngkaButton;
    private javax.swing.JButton konversiHurufButton;
    // End of variables declaration//GEN-END:variables
}
