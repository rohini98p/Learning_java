package com.rohini.algorithem;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr=new int[] {2,6,9,10,4,5,7};
		int n=arr.length-1;
		sort(arr,0,n);
		System.out.println("sort - ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int arr1[]=new int[] {1,143,4567,890,231,1112,3450,1,245,367,434};
		int N=arr1.length-1;
		sorting(arr1,0,N);
		System.out.println("sorting - ");
		for(int i=0;i<N;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	public static void sorting(int arr1[],int left,int right) {
		if(left<right){
			int mid=(left+right)/2;
			
			sorting(arr1,left,mid);
			sorting(arr1,mid+1,right);
			
			
			mergesort(arr1,left,mid,right);
		}
	}
	public static void mergesort(int arr1[],int left,int mid,int right) {
		int N1=mid-left+1;
		int N2=right-mid;
		int l[]=new int [N1];
		int r[]=new int[N2];
		
		for(int i=0;i<N1;i++) {
			l[i]=arr1[left+i];
		}
		for(int i=0;i<N2;i++) {
			r[i]=arr1[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=left;
		
		while(i<N1&&j<N2) {
			if(l[i]<=r[j]) {
				arr1[k]=l[i];
				i++;
			}
			else {
				arr1[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<N1) {
			arr1[k]=l[i];
			i++;
			k++;
		}
		while(j<N2) {
			arr1[k]=r[j];
			j++;
			k++;
		}
	}
	public static void sort(int arr[],int l,int r) {
		if(l<r) {
			int m=(l+r)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
	}
	public static void merge(int arr[],int l,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			R[i]=arr[m+1+i];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
				
			}
			k++;
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}	
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}

}
