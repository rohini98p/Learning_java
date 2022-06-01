package com.rohini.singleton;

public class Singleton {
	private static Singleton ss=null;
	private static Singleton instance() {
		if(ss==null) {
			ss=new Singleton();
		}
		return ss;
	}
	public String str=" the code is correct";
	private  Singleton() {
		System.out.println("inside the class");
	}
	public static void main(String[] args) {
		Singleton x=Singleton.instance();
		Singleton y=Singleton.instance();
		Singleton z=Singleton.instance();
		System.out.println("x-"+x.hashCode()+"y-"+y.hashCode()+"z-"+z.hashCode());
		System.out.println("\n");
		x.str=(x.str).toUpperCase();
		System.out.print("upper case - "+x.str);
		System.out.println("\n");
		//if(x.str.equals(y.str)) {
			//System.out.println("true");
		//}
		y.str=(y.str).toLowerCase();
		System.out.println("lower case - "+y.str);
		
		Singleton obj=new Singleton();
		Singleton obj2=new Singleton();
		
		System.out.println(obj.hashCode()+"   "+obj2.hashCode());
	}
}
