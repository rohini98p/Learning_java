package com.rohini.absractclass;

public class Triangle extends Shape{
	public static void main(String[] args) {
		for(int i=0;i<5;++i) {
			System.out.println(" I is - "+i);
		}
		for(int i=0;i<5;i++) {
			System.out.println("new I is - "+i);
		}
	}
	
	
	
	double h=98;
	double l=12.6;
	int a=20;
	@Override
	double area() {
		// TODO Auto-generated method stub
		double ans=h/l;
		return ans;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("geeksforgeeks");
	}

	@Override
	public int coloum() {
		return a;
	}
}
