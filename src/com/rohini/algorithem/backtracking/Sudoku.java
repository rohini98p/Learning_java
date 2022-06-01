package com.rohini.algorithem.backtracking;

public class Sudoku {
	static int n=9;
	public static void main(String[] args) {
		int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		if(solveSudoku(grid,0,0)) {
			print(grid);
		}
		else {
			System.out.print("not found");
		}
	}
	public static void print(int grid[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean solveSudoku(int grid[][],int row,int col) {
		if(row==n-1&&col==n) {
			return true;
		}
		if(col==n) {
			row++;
			col=0;
		}
		if(grid[row][col]!=0) {
			return(solveSudoku(grid,row,col+1));
		}
		for(int num=1;num<=9;num++) {
			if(isSafe(grid,row,col,num)) {
				grid[row][col]=num;
				
				if(solveSudoku(grid,row,col+1)) {
					return true;
				}
			}
			grid[row][col]=0;
		}
		
		
		return false;
	}
	public static boolean isSafe(int grid[][],int row,int col,int num) {
		for(int x=0;x<9;x++) {
			if(grid[row][x]==num) {
				return false;
			}
			else if(grid[x][col]==num) {
				return false;
			}
			
		}
		int strow=row-row%3;
		int stcol=col-col%3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(grid[i+strow][j+stcol]==num) {
					return false;
				}
			}
		}
		return true;
	}
	
}
