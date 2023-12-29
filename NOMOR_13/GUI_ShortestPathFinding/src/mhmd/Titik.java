package mhmd;

public class Titik {
    int x,y;
    
    public Titik(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "("+x+" ,"+y+")";
    }
    
    public boolean compare(Titik t){
        if(t.x==this.x && t.y==this.y){
            return true;
        }
        return false;
    }
}