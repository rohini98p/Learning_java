package com.rohini.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Transient {
	int z=10;
	transient int a=9;
	transient static int q=100;
	transient final int s=99;
	public static void main(String [] args) {
		Transient tr=new Transient();
		int x=tr.a;
		System.out.print(x);
	}
}
