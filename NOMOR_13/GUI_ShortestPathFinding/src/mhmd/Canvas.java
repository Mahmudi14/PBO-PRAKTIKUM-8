package mhmd;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Canvas extends JPanel {

    private int[][] labyrint = {{-1, -1, 0, 0, 0, 0, 0, 0, -1, -1, -1},
    {-1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0},
    {0, 0, -1, -1, -1, -1, 0, 0, 0, -1, 0},
    {0, 0, 0, 0, 0, 0, 0, -1, -1, -1, 0},
    {0, -1, -1, 0, 0, -1, 0, 0, 0, 0, 0},
    {0, 0, -1, 0, 0, -1, -1, -1, -1, -1, -1}};

    private int cellsize = 40;

    private double translateX;
    private double translateY;
    
    private double scale;

    private Titik start = new Titik(0, 0);
    private Titik finish = new Titik(0, 0);
    private ArrayList<Titik[]> shortestPathSolution = null;
    private String stateSolusi = "DFS";

    public void setStart(int i,int j) {
        this.start = new Titik(i, j);
    }

    public void setFinish(int i,int j) {
        this.finish = new Titik(i, j);
    }

    public void setShortestPathSolution(ArrayList<Titik[]> shortestPathSolution) {
        this.shortestPathSolution = shortestPathSolution;
    }

    public void setStateSolusi(String stateSolusi) {
        this.stateSolusi = stateSolusi;
    }

    public Titik getStart() {
        return start;
    }

    public Titik getFinish() {
        return finish;
    }

    public ArrayList<Titik[]> getShortestPathSolution() {
        return shortestPathSolution;
    }

    public String getStateSolusi() {
        return stateSolusi;
    }
    

    public Canvas() {
        translateX = 0;
        translateY = 0;
        scale = 1;
        setOpaque(false);
        setDoubleBuffered(true);
    }

    public double getTranslateX() {
        return translateX;
    }

    public double getTranslateY() {
        return translateY;
    }

    public void setCellsize(int cellsize) {
        this.cellsize = cellsize;
    }

    public double getScale() {
        return scale;
    }

    public void setTranslateX(double translateX) {
        this.translateX = translateX;
    }

    public void setTranslateY(double translateY) {
        this.translateY = translateY;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public int[][] getLabyrint() {
        return labyrint;
    }

    public int getCellsize() {
        return cellsize;
    }

    public void resetArray(int rows, int cols) {
        this.labyrint = new int[rows][cols];
        setStart(0,0);
        setFinish(0, 0);
        repaint();
    }

    public void shortestPathDepthFisrtSearch() {
        if(labyrint!=null && start!=null && finish!= null){
            shortestPathSolution = PathFinder.depthFirstSearch(labyrint, start, finish);
            stateSolusi = "DFS";
            repaint();
        }
    }
    
    public void shortestPathBeredthFisrtSearch() {
        if(labyrint!=null && start!=null && finish!= null){
            shortestPathSolution = PathFinder.breadthFirstSearch(labyrint, start, finish);
            stateSolusi = "BFS";
            repaint();
        }
    }
    
    public void solve (){
        if(stateSolusi.equals("DFS")){
            shortestPathDepthFisrtSearch();
        }else if(stateSolusi.equals("DFS")){
            shortestPathDepthFisrtSearch();
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform tx = new AffineTransform();
        tx.translate(translateX, translateY);
        tx.scale(scale, scale);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());

        g2d.setTransform(tx);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        if (labyrint != null) {
            int rows = labyrint.length;
            int cols = labyrint[0].length;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int value = labyrint[i][j];

                    if (value == -1) {
                        g2d.setColor(Color.decode("#34495e"));
                    } else if (value == 0) {
                        g2d.setColor(Color.decode("#ecf0f1"));
                    }
                    g2d.fillRect(j * cellsize, i * cellsize, cellsize, cellsize);
                    g2d.setColor(Color.decode("#95a5a6"));
                    g2d.setStroke(new BasicStroke(1));
                    g2d.drawRect(j * cellsize, i * cellsize, cellsize, cellsize);
                }
            }
        }
        if (shortestPathSolution != null) {
            for (Titik[] edge : shortestPathSolution) {
                Titik origin = edge[0];
                Titik destination = edge[1];

                g2d.setColor(Color.decode("#3498db"));
                g2d.fillRect(destination.y * cellsize, destination.x * cellsize, cellsize, cellsize);

                int cx1 = origin.x * cellsize + (int) (0.5 * cellsize);
                int cy1 = origin.y * cellsize + (int) (0.5 * cellsize);
                int cx2 = destination.x * cellsize + (int) (0.5 * cellsize);
                int cy2 = destination.y * cellsize + (int) (0.5 * cellsize);
                g2d.setColor(Color.decode("#e67e22"));
                g2d.setStroke(new BasicStroke(2));
                g2d.drawLine(cy1, cx1, cy2, cx2);
            }
        }
        
        //gambar titik start dan finish
        if (finish != null && finish.x >= 0 && finish.x < labyrint.length && finish.y >= 0 && finish.y < labyrint[0].length) {
            g2d.setColor(Color.decode("#1abc9c"));
            g2d.fillRect(finish.y * cellsize, finish.x * cellsize, cellsize, cellsize);
            g2d.setColor(Color.decode("#95a5a6"));
            g2d.setStroke(new BasicStroke(1));
            g2d.drawRect(finish.y * cellsize, finish.x * cellsize, cellsize, cellsize);
        }
        if (start != null && start.x >= 0 && start.x < labyrint.length && start.y >= 0 && start.y < labyrint[0].length) {
            g2d.setColor(Color.decode("#e74c3c"));
            g2d.fillRect(start.y * cellsize, start.x * cellsize, cellsize, cellsize);
            g2d.setColor(Color.decode("#95a5a6"));
            g2d.setStroke(new BasicStroke(1));
            g2d.drawRect(start.y * cellsize, start.x * cellsize, cellsize, cellsize);
        }
        
        //---------------------------------------------------------------------------------------------------
        g2d.dispose();
    }
}
