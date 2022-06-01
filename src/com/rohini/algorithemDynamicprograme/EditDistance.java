package com.rohini.algorithemDynamicprograme;

public class EditDistance {
	public static void main(String[] args) {
		String str="forgeeks";
		String str1="onlygeeks";
		int m=str.length();
		int n=str1.length();
		int ans=edit(str,str1,m,n);
		System.out.print("Ans-"+ans);
	}
	public static int edit(String str,String str1,int m,int n) {
		if(n==0) {
		return m;
		}
		if(m==0) {
		return n;
		}
		if(str.charAt(m-1)==str1.charAt(n-1)) {
			return edit(str,str1,m-1,n-1);
		}
		return 1+min(edit(str,str1,m,n-1),edit(str,str1,m-1,n),edit(str,str1,m-1,n-1));
	}
	public static int min(int x,int y,int z) {
		if(x<=y&&x<=z) {
			return x;
		}
		if(y<=x&&y<=z) {
			return z;
		}
		return z;
	}
}
