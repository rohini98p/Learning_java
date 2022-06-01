package com.rohini.Inheritance;

public class Testclass {
public static void main(String[] args) {
	System.out.println("cat  -");
	PersianCat pc=new PersianCat();
	System.out.print(pc.age(2));
	System.out.println(pc.behaviour('A'));
	pc.setName("kitty");
	System.out.println();
	System.out.println("name"+pc.getName());
	System.out.println(pc.lifeSpan(5));
	System.out.println(pc.color("white"));
	
	System.out.println("dog  -");
	GermanSphered gp=new GermanSphered();
	gp.setEar(3);
	System.out.println(gp.dogBehaviour("bow bow bow"))	;
	
}
}
