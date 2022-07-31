package com.rohini.algorithem;

public class Recursion {
	public static void main(String[] args) {
		//recursion(8);
		//method1(4,5,6);
		int x=method3(5,9);
		System.out.println(x);
		int n=15;
		for(int i=0;i<n;i++) {
			System.out.print(fibno(i));
		}
		System.out.println(' ');
		int a=fact(10);
		System.out.println(a);
	}
	public static int method3(int n,int k) {
		if(k==1) {
			return n;
		}
		
		return n*(method3(n,k-1));
	}
	public static int fact(int n) {
		if(n==1){
			return 1;
		}
		return n*(fact(n-1));
	}
	public static int fibno(int n) {
		if(n<=1) {
			return n;
		}
		return fibno(n-1)+fibno(n-2);
	}
	public static void recursion(int n) {
	if(n==0) {
		System.out.println(n);
	}
	else {
		recursion(n-1);
	}
	}
	public static int  method1(int a,int b,int c) {
		int sum=a+b+c;
		if(sum==10) {
			System.out.println( sum*10);
		}
		sum=method1(a,b-2,c-3);
		return sum;
	}
	

}
