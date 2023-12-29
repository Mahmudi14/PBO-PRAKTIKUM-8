package parsingweb;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import parsingWeb.DataFrekuensi;

public class FrameUtama extends javax.swing.JFrame {

    public FrameUtama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        urlLabel = new javax.swing.JLabel();
        inputanField = new javax.swing.JTextField();
        parseButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        urlLabel.setText("URL");

        inputanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputanFieldActionPerformed(evt);
            }
        });

        parseButton.setBackground(new java.awt.Color(0, 0, 0));
        parseButton.setForeground(new java.awt.Color(255, 255, 255));
        parseButton.setText("PARSE");
        parseButton.setActionCommand("parseButton");
        parseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parseButton(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(urlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputanField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(urlLabel)
                        .addComponent(inputanField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        parseButton.getAccessibleContext().setAccessibleName("parseButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputanFieldActionPerformed

    }//GEN-LAST:event_inputanFieldActionPerformed

    private void parseButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parseButton
        if (!inputanField.getText().isEmpty()) {
            String alamat = inputanField.getText();
            Document doc;
            try {
                doc = Jsoup.connect(alamat).get();
                String title = doc.title();
                String textt = doc.text();
                String text01 = textt.replaceAll("\u00A9|,|&|\\(|\\)|\\.|/|[0-9]|\\?|@|!|;", " ");
                String text = text01.replaceAll("\\s+", " ");
                String[] kata = text.split(" ");
                ArrayList<DataFrekuensi> data = new ArrayList<>();

                for (int i = 0; i < kata.length; i++) {
                    String kt = kata[i].toLowerCase();
                    if (kt.equals("\u002d") || kt.equals("\u2013")) {
                        continue;
                    }
                    boolean add = true;
                    for (DataFrekuensi isi : data) {
                        if (isi.nama.equalsIgnoreCase(kt)) {
                            isi.incrementFrekuensi();
                            add = false;
                            break;
                        }
                    }

                    if (add) {
                        data.add(new DataFrekuensi(kt));
                    }
                }
                textArea.setText("Daftar Kata dan Frekuensi\n");
                for (DataFrekuensi x : data) {
                    textArea.append(x.nama + '(' + x.frekuensi + ')' + "\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
                textArea.setText("Link tidak Terbaca");
            }
        } else {
            textArea.setText("URL Masih Kosong");
        }

    }//GEN-LAST:event_parseButton

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameUtama fu = new FrameUtama();
                fu.setLocationRelativeTo(null);
                fu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputanField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton parseButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel urlLabel;
    // End of variables declaration//GEN-END:variables
}
