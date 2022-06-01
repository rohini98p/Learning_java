package com.rohini.constructer;


public class Test {
	String name="test class";

	/*
	 * public static void main(String[] args) { Test obj=new Test();
	 * 
	 * System.out.println(obj.name);
	 * 
	 * }
	 */
	public Test() {
		System.out.println("geeks");
	}
	public Test(int a,int b) {
		int c=a+b;
		System.out.println("Ans is-"+c);
	}
	public Test(String name) {
		this.name=name;
		System.out.println("TEST - "+name);
	}
}
