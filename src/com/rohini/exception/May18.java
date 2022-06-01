package com.rohini.exception;

import com.rohini.algorithem.backtracking.Permutation;

public class May18 {
public static void main(String[] args) {
	
	int amount=500;
	int wid=700;
	try {
	if(amount<wid) {
			throw new Exception();
	}
	}
	catch(Exception x) {
		System.out.println("exception");
	
	}
	finally {
		System.out.println("block is excuteded");
	}
	Permutation per=new Permutation();
	String str="";
	try {
		per.toString();
		 per.permute(str,0,4);
	}
	catch(Exception ex) {
		System.out.println("code does not excuted");
	}
	finally {
		System.out.println("block was excuted");
	}
}
}
