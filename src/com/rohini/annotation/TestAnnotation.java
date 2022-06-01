package com.rohini.annotation;

import java.util.ArrayList;

public class TestAnnotation {
	public static void main(String[] args) {
		B obj=new B();
		obj.m1n();
		//@SuppressWarnings("unchecked")  
		ArrayList <String>list=new ArrayList<>();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object ob:list)  
		System.out.println(obj);  
	}

}
