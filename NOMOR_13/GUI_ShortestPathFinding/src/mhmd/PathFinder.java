package mhmd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PathFinder {
    private static int [][] clone (int [][] arrSatu){
        int[][] arrDua = null;
        if(arrSatu != null){
            arrDua = new int[arrSatu.length][];
            for (int i = 0; i < arrSatu.length; i++) {
                arrDua[i] = new int[arrSatu[i].length];
                for (int j = 0; j < arrSatu[i].length; j++) {
                    arrDua[i][j] = arrSatu[i][j];
                }
            }
        }
        return arrDua;
    }
    
    public static ArrayList<Titik[]> depthFirstSearch(int [][] labyrinth,Titik start,Titik finish){
        ArrayList<Titik[]> graph = new ArrayList<>();
        int [][] solution = clone(labyrinth);
        int numRows = solution.length;
        int numCols = solution[0].length;
        
        Stack<Titik> jejak = new Stack<>();
        
        solution[finish.x][finish.y] =0;
        int step = 1;
        solution[start.x][start.y] = step;
        jejak.add(start);
        
        int arah = 0;
        
        //Memulai Pencarian
        while(!jejak.isEmpty()){
            Titik center = jejak.peek();
            int x = center.x;
            int y = center.y;
            
            if(finish.compare(center)){
                for (int i = 1; i < jejak.size(); i++) {
                    Titik origin = jejak.get(i-1);
                    Titik destination = jejak.get(i);
                    Titik[] edge = {origin,destination};
                    graph.add(edge);
                    
                }
                break;
            }else {
                Titik depan = null;
                Titik kanan = null;
                Titik kiri = null;
                
                if(arah==0){
                    depan = new Titik(x-1, y);
                    kanan = new Titik(x, y+1);
                    kiri = new Titik(x, y-1);
                }else if(arah==1){
                    depan = new Titik(x, y+1);
                    kanan = new Titik(x+1, y);
                    kiri = new Titik(x-1, y);
                }else if(arah==2){
                    depan = new Titik(x+1, y);
                    kanan = new Titik(x, y-1);
                    kiri = new Titik(x, y+1);
                }else if (arah==3){
                    depan = new Titik(x, y-1);
                    kanan = new Titik(x-1, y);
                    kiri = new Titik(x+1, y);
                }
                
                if(finish.compare(depan)){
                    step++;
                    solution[depan.x][depan.y] = step;
                    jejak.add(depan);
                }else if (finish.compare(kanan)){
                    step++;
                    solution[kanan.x][kanan.y] = step;
                    jejak.add(kanan);
                }else if (finish.compare(kiri)){
                    step++;
                    solution[kiri.x][kiri.y] = step;
                    jejak.add(kiri);
                }else {
                    if(depan != null && depan.x >=0 && depan.x<numRows && depan.y>=0 && depan.y < numCols && solution[depan.x][depan.y] == 0){
                        step++;
                        solution[depan.x][depan.y] = step;
                        jejak.add(depan);
                    }else if(kanan != null && kanan.x >=0 && kanan.x<numRows && kanan.y>=0 && kanan.y < numCols && solution[kanan.x][kanan.y] == 0){
                        step++;
                        solution[kanan.x][kanan.y] = step;
                        jejak.add(kanan);
                        arah = (arah+1) % 4;
                    }else if (kiri != null && kiri.x >=0 && kiri.x<numRows && kiri.y>=0 && kiri.y < numCols && solution[kiri.x][kiri.y] == 0){
                        step++;
                        solution[kiri.x][kiri.y] = step;
                        jejak.add(kiri);
                        arah = (arah+3) % 4;
                    }else {
                        step--;
                        solution[x][y] = -2;
                        jejak.pop();
                    }
                }
            }
        }
        
        
        
        return graph;
    }
    
    public static ArrayList<Titik[]> breadthFirstSearch(int [][] labyrinth,Titik start,Titik finish){
        ArrayList<Titik[]> graph = new ArrayList<>();
        int [][] solution = clone(labyrinth);
        int numRows = solution.length;
        int numCols = solution[0].length;
        
        Queue<Titik> jejak = new LinkedList<>();
        jejak.offer(start);
        
        solution[finish.x][finish.y] = 0;
        int step = 1;
        solution[start.x][start.y] = step;
        
        while(!jejak.isEmpty()){
            Titik center = jejak.poll();
            int x = center.x;
            int y = center.y;
            
            step = solution[x][y];
            step++;
            
            //NORTH
            int i = x-1;
            int j = y;
            if(i>=0 && i<numRows && j>=0 && j<numCols && solution[i][j] == 0){
                solution[i][j] = step;
                Titik titikBaru = new Titik(i, j);
                jejak.offer(titikBaru);
                Titik[] edge = {center,titikBaru};
                graph.add(edge);
                if(finish.compare(titikBaru)){
                    break;
                }
            }
            
            //EAST
            i = x;
            j = y+1;
            if(i>=0 && i<numRows && j>=0 && j<numCols && solution[i][j] == 0){
                solution[i][j] = step;
                Titik titikBaru = new Titik(i, j);
                jejak.offer(titikBaru);
                Titik[] edge = {center,titikBaru};
                graph.add(edge);
                if(finish.compare(titikBaru)){
                    break;
                }
            }
            
            //SOUTH
            i = x+1;
            j = y;
            if(i>=0 && i<numRows && j>=0 && j<numCols && solution[i][j] == 0){
                solution[i][j] = step;
                Titik titikBaru = new Titik(i, j);
                jejak.offer(titikBaru);
                Titik[] edge = {center,titikBaru};
                graph.add(edge);
                if(finish.compare(titikBaru)){
                    break;
                }
            }
            
            //WEST
            i = x;
            j = y-1;
            if(i>=0 && i<numRows && j>=0 && j<numCols && solution[i][j] == 0){
                solution[i][j] = step;
                Titik titikBaru = new Titik(i, j);
                jejak.offer(titikBaru);
                Titik[] edge = {center,titikBaru};
                graph.add(edge);
                if(finish.compare(titikBaru)){
                    break;
                }
            }
            
            
        }
        
        
        return graph;
    }
}
