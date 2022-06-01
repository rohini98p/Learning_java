package com.rohini.recall;

import java.util.ArrayList;

public class May21 {
	public static void main(String[] args) {
		May21 obj=new May21();
		May21 o=new May21();
		System.out.println(o.hashCode());
		System.out.println(obj.hashCode());
		May21 obj2=new May21(5,8);
		May21 obj3=new May21("geeks for geeks");
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		sort();
	}
	public May21() {
		System.out.println("constracter");
	}
	public May21(int a,int b) {
		int c=a+b;
		System.out.println("c :"+c);
	}
	public May21(String str) {
		System.out.println("Strind name ; "+str);
	}
	
	public static void sort() {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(8);
		al.add(4);
		al.forEach(n->System.out.print(n+" "));
		al.forEach(n-> {if(n%2==0)System.out.println(n);});
		//((int x,int y)->{ return (x>y)? x:y;});
 }
}