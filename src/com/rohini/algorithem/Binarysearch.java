package com.rohini.algorithem;

public class Binarysearch {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int n=9;
		int l=0;int r=n-1;
		int k=6;
		int k1=11;
		int ans=method1(arr,0,n-1,6);
		System.out.println(ans);
		int ans1=method2(arr,0,n-1,k1);
		System.out.print(ans1);
			
	}

	static int method1(int arr[],int l,int r,int k) {
		int mid=(l+r)/2;
		if(arr[mid]==k) {
			return mid;
		}
		if(k<arr[mid]) {
			return method1(arr,l,mid-1,k);
		}
		else {
			return method1(arr,mid+1,r,k);
			}
	}

	static int method2(int arr[],int l,int r,int k) {
		int mid=(l+r)/2;
		if(r>=l) {
			if(arr[mid]==k){
				return 1;
			}
			if(k<arr[mid]) {
				return method2(arr,l,mid-1,k);
			}
			else {
				return method2(arr,mid+1,r,k);
			}
		}
		return -1;
	}
 }


