/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

public class Window extends javax.swing.JFrame {

    public Window() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        caisarPlainText = new javax.swing.JTextField();
        caisarCipherText = new javax.swing.JTextField();
        caisarEncryptButton = new javax.swing.JButton();
        caisarDecryptButton = new javax.swing.JButton();
        caisarClearButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        caisarKey = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        vigenerePlainText = new javax.swing.JTextField();
        vigenereKey = new javax.swing.JTextField();
        vigenereCipherText = new javax.swing.JTextField();
        vigenereEncryptButton = new javax.swing.JButton();
        vigenereDecryptButton = new javax.swing.JButton();
        vigenereClearButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CAISAR CIPHER");
        jPanel4.add(jLabel1);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 204), null, null));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Plain Text");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setText("Cipher Text");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel5.add(caisarPlainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 260, -1));
        jPanel5.add(caisarCipherText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, -1));

        caisarEncryptButton.setText("Encrypt");
        caisarEncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisarEncryptButtonActionPerformed(evt);
            }
        });
        jPanel5.add(caisarEncryptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 80, -1));

        caisarDecryptButton.setText("Decrypt");
        caisarDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisarDecryptButtonActionPerformed(evt);
            }
        });
        jPanel5.add(caisarDecryptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 80, -1));

        caisarClearButton.setText("Clear");
        caisarClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caisarClearButtonActionPerformed(evt);
            }
        });
        jPanel5.add(caisarClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 80, -1));

        jLabel4.setText("Key");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel5.add(caisarKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 260, -1));

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(500, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("VIGENERE CIPHER");
        jPanel6.add(jLabel5);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Plain Text");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel7.setText("Key");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel8.setText("Cipher Text");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel7.add(vigenerePlainText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 250, -1));
        jPanel7.add(vigenereKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 250, -1));
        jPanel7.add(vigenereCipherText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 250, -1));

        vigenereEncryptButton.setText("Encrypt");
        vigenereEncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereEncryptButtonActionPerformed(evt);
            }
        });
        jPanel7.add(vigenereEncryptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        vigenereDecryptButton.setText("Decrypt");
        vigenereDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenereDecryptButtonActionPerformed(evt);
            }
        });
        jPanel7.add(vigenereDecryptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        vigenereClearButton.setText("Clear");
        jPanel7.add(vigenereClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 80, -1));

        jPanel3.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caisarEncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisarEncryptButtonActionPerformed
        String plainText = caisarPlainText.getText().toLowerCase();
        int key = Integer.parseInt(caisarKey.getText());
        String ecnrypt = caisarEncrypt(plainText,key);
        caisarCipherText.setText(ecnrypt.toUpperCase());
    }//GEN-LAST:event_caisarEncryptButtonActionPerformed

    private void caisarDecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisarDecryptButtonActionPerformed
        String encrypt = caisarCipherText.getText().toLowerCase();
        int key = Integer.parseInt(caisarKey.getText());
        String plainText = caisarDecrypt(encrypt, key);
        caisarPlainText.setText(plainText.toUpperCase());
    }//GEN-LAST:event_caisarDecryptButtonActionPerformed

    private void caisarClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caisarClearButtonActionPerformed
        caisarPlainText.setText("");
        caisarCipherText.setText("");
        caisarKey.setText("");
    }//GEN-LAST:event_caisarClearButtonActionPerformed

    private void vigenereEncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereEncryptButtonActionPerformed
        String plainText = vigenerePlainText.getText().toLowerCase();
        String key = vigenereKey.getText().toLowerCase();
        String encrypt = vigenereEncrypt(plainText, key);
        vigenereCipherText.setText(encrypt.toUpperCase());
    }//GEN-LAST:event_vigenereEncryptButtonActionPerformed

    private void vigenereDecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenereDecryptButtonActionPerformed
        String encrypt = vigenereCipherText.getText().toLowerCase();
        String key = vigenereKey.getText().toLowerCase();
        String plainText = vigenereDecrypt(encrypt, key);
        vigenerePlainText.setText(plainText.toUpperCase());
    }//GEN-LAST:event_vigenereDecryptButtonActionPerformed
    
    private static String caisarEncrypt(String text,int shift){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            int p = text.charAt(i) - 97;
            int e = (p+shift) % 26;
            char huruf = (char) (e+97);
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    private static String caisarDecrypt(String text,int shift){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            int e = text.charAt(i) - 97;
            int p = (e-shift) % 26;
            if(p<0){
                p+=26;
            }
            char huruf = (char) (p + 97);
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    private static String vigenereEncrypt(String text,String shift){
        StringBuffer sb = new StringBuffer();
        int panjang = text.length();
        for (int i = 0; i < panjang; i++) {
            int j = i%shift.length();
            int k = (int) shift.charAt(j) - 97;
            int p = (int) text.charAt(i) - 97;
            int e = (p+k) % 26;
            char huruf = (char) (e + 97);
            sb.append(huruf);
        }
        return sb.toString();
    }
    
    private static String vigenereDecrypt(String text,String shift){
        StringBuffer sb = new StringBuffer();
        int panjang = text.length();
        for (int i = 0; i < panjang; i++) {
            int j = i%shift.length();
            int k = (int) shift.charAt(j) - 97;
            int p = (int) text.charAt(i) - 97;
            int e = (p-k) % 26;
            if(e<0){
                e+=26;
            }
            char huruf = (char) (e + 97);
            sb.append(huruf);
        }
        return sb.toString();
    }
    
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caisarCipherText;
    private javax.swing.JButton caisarClearButton;
    private javax.swing.JButton caisarDecryptButton;
    private javax.swing.JButton caisarEncryptButton;
    private javax.swing.JTextField caisarKey;
    private javax.swing.JTextField caisarPlainText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField vigenereCipherText;
    private javax.swing.JButton vigenereClearButton;
    private javax.swing.JButton vigenereDecryptButton;
    private javax.swing.JButton vigenereEncryptButton;
    private javax.swing.JTextField vigenereKey;
    private javax.swing.JTextField vigenerePlainText;
    // End of variables declaration//GEN-END:variables
}
