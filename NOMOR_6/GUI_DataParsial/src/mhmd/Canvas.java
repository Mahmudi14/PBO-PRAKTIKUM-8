package mhmd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import javax.swing.JPanel;

public class Canvas extends JPanel {

    private int cellSize = 40;
    private double translateX;
    private double translateY;
    private double scale;

    //Water
    private Water water = null;

    public Canvas() {
        translateX = 0;
        translateY = 0;
        scale = 1;
        setOpaque(false);
        setDoubleBuffered(true);
    }

    public int getCellSize() {
        return cellSize;
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }

    public double getTranslateX() {
        return translateX;
    }

    public void setTranslateX(double translateX) {
        this.translateX = translateX;
    }

    public double getTranslateY() {
        return translateY;
    }

    public void setTranslateY(double translateY) {
        this.translateY = translateY;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public void setWater(Water water) {
        this.water = water;
        this.repaint();
    }

    public Water getWater() {
        return this.water;
    }


    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        //----------------------------------------------------------------------
        AffineTransform tx = new AffineTransform();
        tx.translate(translateX, translateY);
        tx.scale(scale, scale);
        g2d.setTransform(tx);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        //----------------------------------------------------------------------
        //draw water
        if (water != null) {
            //draw data---------------------------------------------------------
            double[][] data = water.getData();
            Color[] colors = water.getWarna();
            double[] nilaiBatas = water.getBatasWarna();
            if (data != null && colors != null && nilaiBatas != null && colors.length == nilaiBatas.length) {
                int rows = data.length;
                int cols = data[0].length;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        double value = data[i][j];
                        //pilih warna base on value
                        Color c = Color.WHITE;
                        for (int k = 0; k < nilaiBatas.length; k++) {
                            c = colors[k];
                            if (value <= nilaiBatas[k]) {
                                break;
                            }
                        }
                        g2d.setColor(c);
                        g2d.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                    }
                }
            }

        }//end of draw water        
        //----------------------------------------------------------------------
        g2d.dispose();
    }
}
