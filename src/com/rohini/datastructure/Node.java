package com.rohini.datastructure;

public class Node {
	public int data;
	public Node left;
	public Node right;
	public static void main(String[] args) {
	
				int M[][] = {{0, 1, 0},
				         {0, 0, 0}, 
				         {0, 1, 0}};
				int n=3;
				int ans=celebrity(M,n);
				System.out.println(ans);
		
	}
	public static int celebrity(int M[][], int n)
    {
    	// code here 
    	int i=0;
    	int j=n-1;
    	while(i<j){
    	    if(M[j][i]==1){
    	        j--;
    	    }
    	    else{
    	        i++;
    	    }
    	}
    	int candi=i;
    	for(i=0;i<n;i++){
    	    if(i!=candi){
    	        if(M[i][candi]==0||M[candi][i]==1){
    	            return -1;
    	        }
    	    }
    	}
    	return candi;
    }
}
