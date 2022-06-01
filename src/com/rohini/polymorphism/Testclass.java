package com.rohini.polymorphism;

public class Testclass {
	public static void main(String[] args) throws InterruptedException {
		Compiletime obj=new Compiletime();
		
		obj.method(3, 10);
		
		Runtime or=new Overridding();
		or.method();
		or.method1(2, 9);
		or.run();
		
	}
	


}
