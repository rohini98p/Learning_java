package com.rohini.reflection;

public class TestClass {
	public static void main(String[] args) {
		Refelection obj=new Refelection();
		Class cls=obj.getClass();
		cls.getClass();
		cls.getName();
		System.out.println(cls.getName());
		System.out.println(cls.getMethods());
		System.out.println(cls.getClass());
	}

}
