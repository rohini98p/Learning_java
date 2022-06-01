package com.rohini.recall;

import com.rohini.enaum.WeekDays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.RetentionPolicy;
import java.util.Scanner;

public class May19 {
	public static void main(String[] args) throws IOException {
		System.out.println(WeekDays.TUESDAY.getDay());
		System.out.println(WeekDays.MONDAY.getDay());
		System.out.println(WeekDays.WEDNESDAY.getDay());
		System.out.println(WeekDays.THURSDAY.getDay());
		System.out.println(WeekDays.FRIDAY.getDay());
		System.out.println(WeekDays.SATURDAY.getDay());
		System.out.println(WeekDays.SUNDAY.getDay());


		/*
		 * Scanner sc=new Scanner(System.in); int x=sc.nextInt(); float
		 * f=sc.nextFloat(); String s=sc.next(); String str=sc.nextLine();
		 * 
		 * System.out.println(x+" "+f+" "+s); System.out.println(str); try {
		 * BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		 * String sr=bf.readLine(); int q=bf.read(); System.out.print(sr+" "+q); }
		 * catch(IOException e) { System.out.println("io exception caused"); }
		 */
		System.out.println("num is - ");
        Scanner q=new Scanner(System.in);
        int s=q.nextInt();
        System.out.println(s);
        System.out.println("Hello, World!");
        System.out.println();
        System.out.println("rohini");
		Integer sad = 34;
		Integer asd = new Integer(12);
		method1();
	}
	@Deprecated
	public static void method1(){
	}
}
