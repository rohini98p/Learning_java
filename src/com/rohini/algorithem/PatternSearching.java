package com.rohini.algorithem;

public class PatternSearching {
	public static void main(String[] args) {
		String str="AAABCDABBCDABCDBBBABCD";
		String pat="ABCD";
		search(str,pat);
		
	}
	public static void search(String str,String pat) {
		int n=str.length();
		int m=pat.length();
		for(int i=0;i<n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(str.charAt(i+j)!=pat.charAt(j)) {
					break;
				}
			}
			if(j==m) {
				System.out.print("ans is-"+i);
			}
			
		}
	}

}
