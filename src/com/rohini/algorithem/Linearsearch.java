package com.rohini.algorithem;

public class Linearsearch {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int n=10;
		int x=7;
		int result=search(arr,n,x);
		System.out.println("search ans is-"+result);
	}
	public static int search(int arr[],int n,int x) {
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}

}
