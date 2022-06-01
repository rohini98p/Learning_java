package com.rohini.algorithem;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]=new int[] {4,5,6,1,2,8,9,3};
		int n=arr.length;
		sort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int arr[],int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}

}
