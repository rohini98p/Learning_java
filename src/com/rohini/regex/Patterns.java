package com.rohini.regex;

public class Patterns {
	public static void main(String[] args) {
		int arr[]=new int[] {1,101,2,3,100};
		int n=arr.length;
		int a=maxSumIS(arr,n);
		System.out.println(" ans is - "+a);
		int ans=0;
		int brr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					max=Math.max(max,brr[j]);
				}
			}
			brr[i]=max+arr[i];
			ans=Math.max(ans,brr[i]);
		}
		System.out.print("max value - "+ans);
	}
	public static int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int ans=0;
	    int []brr=new int[n];
	    for(int i=0;i<n;i++){
	        int max=0;
	        for(int j=0;j<i;j++){
	            if(arr[i]>arr[j]){
	            max=Math.max(max,brr[j]);
	            }
	        }
	        brr[i]=max+arr[i];
	            ans=Math.max(ans,brr[i]);
	    }
	    return ans;
	}
}
