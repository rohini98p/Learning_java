package com.rohini.algorithemDynamicprograme;

public class mincostpath {
	public static void main(String[] args) {
		int cost[][] = { {5,3,8,1},
                {6,3,2,1},
                {7,3,8,1},
                {5,3,2,1} };
                 
		System.out.print("MIN COST PATH IS - "+minCost(cost, 3, 3));
	}
	public static int minCost(int cost[][],int n,int m) {
		if(m<0||n<0) {
			return Integer.MAX_VALUE;
		}
		if(m==0&&n==0) {
			return cost[n][m];
		}
		return cost[n][m]+min(minCost(cost,n,m-1),minCost(cost,n-1,m),minCost(cost,n-1,m-1));
	}	
	public static int min(int x,int y,int z) {
		if(x<y) {
			return (x<z)? x:y;
		}
		return y<z? y:z ;
	}

}
