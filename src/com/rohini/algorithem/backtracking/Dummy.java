package com.rohini.algorithem.backtracking;

public class Dummy {

    static int N;
 
 
    public static void main(String args[])
    {
        int maze[][] = { { 1, 1, 0 },
                { 0, 1, 1 },
                { 0, 0, 1 } };

 
        N = maze.length;
        solveMaze(maze);
    }
    public static boolean solveMaze(int[][]maze) {
    	int[][]sol=new int[N][N];
    	if(solveMazeUtile(maze,0,0,sol)==false) {
    		System.out.print("code does not excit");
    		return false;
    	}
    		print(sol);
    	return true;
    }
    public static boolean solveMazeUtile(int maze[][],int x,int y,int[][]sol) {
    	if(x==N-1&&y==N-1&&maze[x][y]==1) {
    		sol[x][y]=1;
    		return true;
    	}
    	if(isSafe(maze,x,y)==true) {
    		if(sol[x][y]==1) {
    			return false;
    		}
    		sol[x][y]=1;
    		if(solveMazeUtile(maze,x+1,y,sol)) {
    			return true;
    		}
    		if(solveMazeUtile(maze,x,y+1,sol)) {
    			return true;
    		}
    		if(solveMazeUtile(maze,x-1,y,sol)) {
    			return true;
    		}
    		if(solveMazeUtile(maze,x,y-1,sol)) {
    			return true;
    		}
    		sol[x][y]=0;
    		return false;
    	}
    	return false;
    }
    public static boolean isSafe(int maze[][],int x,int y) {
    	if(x>=0&&x<N&&y>=0&&y<N&&maze[x][y]==1) {
    		return true;
    	}
    	return false;
    }
    public static void print(int sol[][]) {
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++) {
    			System.out.print(" "+sol[i][j]+" ");
    		}
    		System.out.println();    	}
    }
}
