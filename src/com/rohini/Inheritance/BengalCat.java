package com.rohini.Inheritance;

public class BengalCat extends Cat{
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
