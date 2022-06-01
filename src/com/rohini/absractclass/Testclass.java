package com.rohini.absractclass;

public class Testclass {
public static void main(String[] args){
	Circle obj=new Circle();
	obj.area();
	System.out.println(obj.area());
	System.out.println(obj.toString());
	
	
	
	
	Triangle obj1=new Triangle();
	obj.method();
	System.out.println(obj1.area());
	System.out.println(obj1.toString());

	Shape s=new Circle();
	s.coloum();
	System.out.println(s.coloum());
	Shape tri=new Triangle();
	System.out.println(tri.coloum());
	
	
}
}
