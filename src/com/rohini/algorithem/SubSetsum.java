package com.rohini.algorithem;

public class SubSetsum {
	public static void main(String[] args) {
		int arr[]=new int[] {5,7,8,3,4,2,1};
		int n=arr.length;
		int sum=15;
		boolean b=subSet(arr,n,sum);
		if(b==true) {
			System.out.println("subset is present");
		}
		else {
			System.out.print("subset is absent");
		}
	}
	public static boolean subSet(int arr[],int n,int sum) {
		if(sum==0) {
			return true;
		}
		else if(n==0) {
			return false;
		}
		else if(arr[n-1]>sum) {
			return subSet(arr,n-1,sum);
		}
		return subSet(arr,n-1,sum)||subSet(arr,n-1,sum-arr[n-1]);
	}

}
