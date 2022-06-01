package com.rohini.algorithempatternsearching;

public class Naive {
	public static void main(String[] args) {
		
		 String str="AABBCCDDAABBCCDD"; 
		 String s="AABBCC"; 
		 int n1=str.length(); 
		 int m1=s.length(); 
		 for(int i=0;i<=n1-m1;i++){
			 int j;
			 for(j=0;j<m1;j++) {
				 if(str.charAt(i+j)!=s.charAt(j)) { 
					 break; 
				} 
			} 
			 if(j==m1) {
				 System.out.print(" "+i); 
			} 
		}
		 
		 
		 
		 
		 int arr1[]=new int[] {2,4,6,8};
		 int arr2[]=new int[] {0,1,3,5,7};
		 int n=arr1.length;
		 int m=arr2.length;
		 ar(arr1,arr2,n,m);
		
	}
	public static void ar(int arr1[],int arr2[],int n,int m) {
		 int []arr=new int[n+m];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<n&&j<m){
	            if(arr1[i]<=arr2[j]){
	                arr[k]=arr1[i];
	                i++;
	            }
	            else{
	                arr[k]=arr2[j];
	                j++;
	            }
	            k++;
	        }
	        while(i<n){
	            arr[k]=arr1[i];
	            i++;
	            k++;
	        }
	        while(j<m){
	            arr[k]=arr2[j];
	            j++;
	            k++;
	        }
	        for(int a=0;a<arr.length;a++) {
	        	if(a<n) {
	        		arr1[a]=arr[a];
	        	System.out.print(arr1[a]);
	        	}
	        	//System.out.print();
	        	else {
	        		arr2[a]=arr[a];
	        		System.out.print(arr2[a]);
	        	}
	        }
	}
	

}
