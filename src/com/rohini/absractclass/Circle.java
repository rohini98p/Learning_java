package com.rohini.absractclass;

public class Circle extends Shape{

	double height=10.4;
	double length=12.0;
	int age=11;
	@Override
	double area() {
		double ans=height*length;
		// TODO Auto-generated method stub
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
		
	}

	@Override
	public int coloum() {
		return age;
	}


}
