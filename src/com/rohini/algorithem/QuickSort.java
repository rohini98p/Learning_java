package com.rohini.algorithem;

public class QuickSort {
	public static void main(String[] args) {
		int arr[]=new int[] {2,4,6,7,5,8,9,3,10,1};
		int n=10;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
				
			}
			swap(arr,i,min);
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		quickSorting();
	}
	public static void swap(int arr[],int i,int min) {
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	public static void quickSorting() {
		int a[]=new int[] {2,4,8,6,1,9,5,0};
		int n=8;
		quickSort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	
	}
	public static void quickSort(int a[],int low,int high) {
		if(low<=high) {
			
		
		int pi=printer(a,low,high);
		
		quickSort(a,low,pi-1);
		quickSort(a,pi+1,high);
		}
	}
	public static int printer(int a[],int low,int high) {
		
		
			int cons=a[high];
			int i=low-1;
			for(int j=low;j<=high;j++) {
				if(a[j]<a[high]) {
					i++;
					swaping(a,i,j);
				}
				
			}
			swaping(a,i+1,high);
			return i+1;
		
	}	
	public static void swaping(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
}

				