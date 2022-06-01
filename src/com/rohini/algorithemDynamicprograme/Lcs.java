package com.rohini.algorithemDynamicprograme;

public class Lcs {
	public static void main(String[] args) {
		String a="geeksforgeeks";
		String b="lookforgeeks";
		char[] arr=a.toCharArray();
		char[]brr=b.toCharArray();
		int n=arr.length;
		int m=brr.length;
		int num=lcs(arr,brr,n,m);
		System.out.print("LONGEST COMMEN SUBSEQUENCE - "+num);
	}
	public static int lcs(char[]a,char[] b,int n,int m) {
		if(n==0||m==0) {
			return 0;
		}
		if(a[n-1]==b[m-1]) {
			return 1+lcs(a,b,n-1,m-1);
		}
		else 
			return max(lcs(a,b,n-1,m),lcs(a,b,n,m-1));
		
		
	}
	public static int max(int a,int b) {
		return a>b? a:b;
	}

}
