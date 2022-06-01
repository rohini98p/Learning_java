package com.rohini.polymorphism;

public class Overridding extends Runtime{
	public void method() {
		System.out.println("Child CLASS");
	}
	public void run() {
		System.out.println("NAME-child");
	}
	public int method1(int a,int b) {
		int c=0;
		System.out.println("Ans int c is-"+c);
		return c;
	}
}
