package mhmd;

import java.awt.Color;

public class Water {

    //INPUT---------------------------------------------------------------------
    private double[][] data = null;
    private int rows = 0;
    private int cols = 0;
    
    //coloring map
    private double MIN = 0;
    private double MAX = 0;
    private Color c1 = Color.decode("#c0392b");
    private Color c2 = Color.decode("#e74c3c");
    private Color c3 = Color.decode("#d35400");
    private Color c4 = Color.decode("#e67e22");
    private Color c5= Color.decode("#f39c12");
    private Color c6 = Color.decode("#f1c40f");
    private Color c7 = Color.decode("#27ae60");
    private Color c8= Color.decode("#2ecc71");
    private Color c9 = Color.decode("#ecf0f1");
    
    private Color[] warna = {c9,c8,c7,c6,c5,c4,c3,c2,c1};
    private double[] batasWarna = new double[warna.length];


    public Water(double[][] data) {
        this.setData(data);
    }

    public double[][] getData() {
        return data;
    }

    public void setData(double[][] data) {
        if (data != null) {
            this.data = data;
            this.rows = data.length;
            this.cols = data[0].length;
            ///hitung MIN MAX
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;
            for(int i=0;i<data.length;i++){
                for(int j=0;j<data[i].length;j++){
                    double value = data[i][j];
                    if(value>max){
                        max = value;
                    }
                    if(value<min){
                        min=value;
                    }
                }
            }
            this.MAX = max;
            this.MIN = min;
            double satuan = (MAX-MIN)/batasWarna.length;
            for(int i=0;i<batasWarna.length;i++){
                batasWarna[i]=MIN+(i+1)*satuan;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public Color[] getWarna() {
        return warna;
    }

    public double[] getBatasWarna() {
        return batasWarna;
    }
    

}
