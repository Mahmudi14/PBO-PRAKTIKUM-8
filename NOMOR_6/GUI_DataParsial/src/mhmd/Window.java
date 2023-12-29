package mhmd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;

public class Window extends JFrame {

    //variabel
    private JPanel jContentPane = null;
    private JPanel jPanelNorth = null;
    private JTabbedPane jTabbedPane = null;

    //komponen di panel north
    private JLabel jLabel1 = null;
    private JTextField jTextField1 = null;
    private JButton jButton1 = null;

    //komponen di tab pane
    private JPanel jPanel1 = null;
    private JPanel jPanel2 = null;
    private Canvas canvas = null;
    private JScrollPane jScrollPane1 = null;
    private JScrollPane jScrollPane2 = null;
    private JTextArea jTextArea1 = null;
    private JTextArea jTextArea2 = null;
    private Water water = null;


    public Window() {
        initUI();
    }

    private void initUI() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setTitle("Water Flow Direction");
        setContentPane(getJContentPane());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(false);
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //GETTER
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getJPanelNorth(), BorderLayout.NORTH);
            jContentPane.add(getJTabbedPane(), BorderLayout.CENTER);
        }
        return jContentPane;
    }

    private JPanel getJPanelNorth() {
        if (jPanelNorth == null) {
            jPanelNorth = new JPanel();
            jPanelNorth.add(getJLabel1());
            jPanelNorth.add(getJTextField1());
            jPanelNorth.add(getJButton1());
        }
        return jPanelNorth;
    }

    private JTabbedPane getJTabbedPane() {
        if (jTabbedPane == null) {
            jTabbedPane = new JTabbedPane();
            jTabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
            jTabbedPane.addTab("Data", getJPanel1());
            jTabbedPane.addTab("Visualization", getCanvas());
            jTabbedPane.setSelectedIndex(1);
        }
        return jTabbedPane;
    }

    //GETTER untuk komponen di panel north
    private JLabel getJLabel1() {
        if (jLabel1 == null) {
            jLabel1 = new JLabel("File Data");
        }
        return jLabel1;
    }

    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField();
            jTextField1.setPreferredSize(new Dimension(500, 30));
        }
        return jTextField1;
    }

    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton("Browse");
            jButton1.setPreferredSize(new Dimension(90, 30));
            jButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                    if (jfc.showOpenDialog(jContentPane) == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = jfc.getSelectedFile();
                        //System.out.println(selectedFile.getAbsolutePath());
                        jTextField1.setText(selectedFile.getAbsolutePath());
                        setData(selectedFile);
                        canvas.setWater(water);
                        jTextArea1.setText(getStringData());
                        canvas.repaint();
                    }

                }
            });
        }
        return jButton1;
    }


    //GETTER komponen di tab pane
    private JPanel getJPanel1() {
        if (jPanel1 == null) {
            jPanel1 = new JPanel();
            jPanel1.setLayout(new BorderLayout());
            jPanel1.add(getJScrollPane1(), BorderLayout.CENTER);
        }
        return jPanel1;
    }

    private JPanel getJPanel2() {
        if (jPanel2 == null) {
            jPanel2 = new JPanel();
            jPanel2.setLayout(new BorderLayout());
            jPanel2.add(getJScrollPane2(), BorderLayout.CENTER);
        }
        return jPanel2;
    }

    private JTextArea getJTextArea1() {
        if (jTextArea1 == null) {
            jTextArea1 = new JTextArea();
        }
        return jTextArea1;
    }

    private JTextArea getJTextArea2() {
        if (jTextArea2 == null) {
            jTextArea2 = new JTextArea();
        }
        return jTextArea2;
    }

    private JScrollPane getJScrollPane1() {
        if (jScrollPane1 == null) {
            jScrollPane1 = new JScrollPane();
            jScrollPane1.setViewportView(getJTextArea1());
        }
        return jScrollPane1;
    }

    private JScrollPane getJScrollPane2() {
        if (jScrollPane2 == null) {
            jScrollPane2 = new JScrollPane();
            jScrollPane2.setViewportView(getJTextArea2());
        }
        return jScrollPane2;
    }

    private Canvas getCanvas() {
        if (canvas == null) {
            canvas = new Canvas();
            Handler handler = new Handler(this, canvas);
        }
        return canvas;
    }
    
    public void setData(File filedata) {
        double[][] data = null;
        try {
            FileInputStream fis = new FileInputStream(filedata);
            Scanner sc = new Scanner(fis, "UTF-8");

            // baca nCols
            int nCols = 0;
            if (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] splitLine = line.split("\\s+");//menghapus spasi
                String value = splitLine[1];//membaca data pada kolom-1 di array splitLine
                nCols = Integer.parseInt(value);
            }

            //baca nRows
            int nRows = 0;
            if (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] splitLine = line.split("\\s+");//menghapus spasi
                String value = splitLine[1];//membaca data pada kolom-1 di array splitLine
                nRows = Integer.parseInt(value);
            }

            //baca data
            if (nRows > 0 && nCols > 0) {
                double[][] newData = new double[nRows][];
                sc.nextLine();
                sc.nextLine();
                sc.nextLine();
                sc.nextLine();

                //membaca data baris demi baris
                for (int i = 0; i < nRows; i++) {
                    if (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        String[] splitLine = line.split("\\s+");
                        newData[i] = new double[splitLine.length];
                        for (int j = 0; j < newData[i].length; j++) {
                            String value = splitLine[j];
                            double dValue = 0;
                            try {
                                dValue = Double.parseDouble(value);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                            newData[i][j] = dValue;
                        }
                    }
                }
                data = newData;
            }
            if (data != null) {
                water = new Water(data);
            }
            sc.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getStringData() {
        String sData = "NULL";
        if (this.water != null && this.water.getData() != null) {
            double[][] data = this.water.getData();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    sb.append(data[i][j] + "\t");
                }
                sb.append("\n");
            }
            sData = sb.toString();
        }
        return sData;
    }

    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window ui = new Window();
            }
        });
    }//end of main
}//end of class UISFD
