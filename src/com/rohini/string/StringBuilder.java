package com.rohini.string;

public class StringBuilder {
	public static void main(String[] args) {
		String str="geeks for geeks";
		int i=0;
		String s="";
		String s1="";
		while(i<str.length()) {
			s=str.charAt(i)+s;
			s1=s1+str.charAt(i);
			i++;
		}
		System.out.print(s);
		System.out.println();
		System.out.println(s1);
		str.substring(0, 5);
		System.out.print("subString -"+str.substring(0, 5));
	}

}
