package mhmd;

public class Window extends javax.swing.JFrame {
    
    
    public Window() {
        initComponents();
        Handler handler = new Handler(this, canvas1);
        canvas1.addMouseListener(handler);
        canvas1.addMouseMotionListener(handler);
        canvas1.addMouseWheelListener(handler);
        canvas1.addKeyListener(handler);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rowTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ColumsTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        dfsButton = new javax.swing.JButton();
        bfsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        canvas1 = new mhmd.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(540, 500));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 50));

        jLabel1.setText("Rows");
        jPanel1.add(jLabel1);

        rowTextField.setMinimumSize(new java.awt.Dimension(30, 30));
        rowTextField.setPreferredSize(new java.awt.Dimension(50, 30));
        rowTextField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                rowTextFieldCaretUpdate(evt);
            }
        });
        jPanel1.add(rowTextField);

        jLabel2.setText("Colums");
        jPanel1.add(jLabel2);

        ColumsTextField.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(ColumsTextField);

        resetButton.setText("Reset");
        resetButton.setPreferredSize(new java.awt.Dimension(70, 30));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);

        dfsButton.setText("DFS");
        dfsButton.setPreferredSize(new java.awt.Dimension(62, 30));
        jPanel1.add(dfsButton);

        bfsButton.setText("BFS");
        bfsButton.setPreferredSize(new java.awt.Dimension(62, 30));
        bfsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(bfsButton);

        exitButton.setText("Exit");
        exitButton.setPreferredSize(new java.awt.Dimension(62, 30));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        canvas1.setPreferredSize(new java.awt.Dimension(540, 347));

        javax.swing.GroupLayout canvas1Layout = new javax.swing.GroupLayout(canvas1);
        canvas1.setLayout(canvas1Layout);
        canvas1Layout.setHorizontalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        canvas1Layout.setVerticalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        getContentPane().add(canvas1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bfsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bfsButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        int row = Integer.parseInt(rowTextField.getText());
        int column = Integer.parseInt(ColumsTextField.getText());
        canvas1.resetArray(row, column);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void rowTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_rowTextFieldCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_rowTextFieldCaretUpdate

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ColumsTextField;
    private javax.swing.JButton bfsButton;
    private mhmd.Canvas canvas1;
    private javax.swing.JButton dfsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField rowTextField;
    // End of variables declaration//GEN-END:variables
}
