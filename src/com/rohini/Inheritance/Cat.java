package com.rohini.Inheritance;

public class Cat extends Animal{
	public char behaviour(char ch) {
		ch='a';
		return ch;
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
