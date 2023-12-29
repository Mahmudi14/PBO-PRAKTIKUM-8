package mhmd;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;

public class Handler implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {

    private JFrame frame;
    private Canvas canvas;

    private int lastOffSetX;
    private int lastOffSetY;

    private final double MIN_SCALE = 0.5;
    private final double MAX_SCALE = 20;

    private int stateClick = 0;

    public Handler(JFrame frame, Canvas canvas) {
        this.frame = frame;
        this.canvas = canvas;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        double x1 = e.getX() - canvas.getTranslateX();
        double y1 = e.getY() - canvas.getTranslateY();

        double scale = canvas.getScale();
        double cellSizeScale = canvas.getCellsize() * scale;
        double x = Math.floor(x1 / cellSizeScale);
        double y = Math.floor(y1 / cellSizeScale);

        int i = (int) y;
        int j = (int) x;

        if (stateClick == 0) {
            if ((new Titik(i, j)).compare(canvas.getStart())) {
                stateClick = 1;
            } else if ((new Titik(i, j)).compare(canvas.getFinish())) {
                stateClick = 2;
            } else {

                if (canvas.getLabyrint() != null && i >= 0 && i < canvas.getLabyrint().length && j >= 0 && j < canvas.getLabyrint()[0].length) {
                    if (canvas.getLabyrint()[i][j] == 0) {
                        canvas.getLabyrint()[i][j] = -1;
                    } else {
                        canvas.getLabyrint()[i][j] = 0;
                    }
                    canvas.solve();
                }
            }
        } else if (stateClick == 1) {
            canvas.setStart(i, j);
            stateClick = 0;
            canvas.solve();
        } else if (stateClick == 2) {
            canvas.setStart(i, j);
            stateClick = 0;
            canvas.solve();
        }
        //Gambar ulang
        canvas.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lastOffSetX = e.getX();
        lastOffSetY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //DRAG AND DROP
        //Definisikan posisi x dan y yang baru
        //Hitung translasi x dan y
        int newX = e.getX() - lastOffSetX;
        int newY = e.getY() - lastOffSetY;

        //Increment last offset oleh event drag mouse
        lastOffSetX += newX;
        lastOffSetY += newY;

        //Update posisi canvas
        canvas.setTranslateX(canvas.getTranslateX() + newX);
        canvas.setTranslateY(canvas.getTranslateY() + newY);

        //Gambar ulang
        canvas.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
            if (canvas.getScale() >= MIN_SCALE && canvas.getScale() <= MAX_SCALE) {
                double oldScale = canvas.getScale();

                double newScale = (0.1 * e.getWheelRotation());
                newScale = canvas.getScale() + newScale;
                newScale = Math.max(0.00001, newScale);

                if (newScale < MIN_SCALE) {
                    newScale = MIN_SCALE;
                } else if (newScale > MAX_SCALE) {
                    newScale = MAX_SCALE;
                }

                double x1 = e.getX() - canvas.getTranslateX();
                double y1 = e.getY() - canvas.getTranslateY();

                double x2 = (x1 * newScale) / oldScale;
                double y2 = (y1 * newScale) / oldScale;

                double newtranslateX = canvas.getTranslateX() + x1 - x2;
                double newtranslateY = canvas.getTranslateY() + y1 - y2;

                canvas.setTranslateX(newtranslateX);
                canvas.setTranslateY(newtranslateY);
                canvas.setScale(newScale);
                canvas.repaint();
            }
        }
    }

}
