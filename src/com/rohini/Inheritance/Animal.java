package com.rohini.Inheritance;

public class Animal {
	String name;
	int age;
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public int age(int a) {
		return a;
	}
	public String color(String color) {
		return color;
	}
	public boolean lifeSpan(double y) {
		if(y<12) {
			return false;
		}
		return true;
	}

}
