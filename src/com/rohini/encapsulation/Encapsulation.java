package com.rohini.encapsulation;

public class Encapsulation {
private int age;
private String name;
private double weight;
private float height;
public void getName(String newname) {
	name=newname;
	System.out.println("NAME - "+name);
	
}
public void setAge(int newage) {
	age=newage;
}
public void setWeight(double newweight) {
	weight=newweight;
}
public void setHeight(float newheight) {
	height=newheight;
}
public int getAge() {
	return age;
}
public double getWeight() {
	return weight;
}
public float getHeight() {
	return height;
}
}
