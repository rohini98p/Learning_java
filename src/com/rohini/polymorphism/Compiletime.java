package com.rohini.polymorphism;

public class Compiletime {
	
	int variable = 10;
	
	public void method(int a,int b) throws InterruptedException {
		synchronized (this) {
			System.out.println(this.variable);
			Thread.sleep(10000);
		}
		
		{
			int c=a+b;
			//System.out.println("Compiler"+c);
		}
	}
	public void Compiletime(int variable) {
		this.variable = variable;
	}
	
	public int method(int x,int y,int z) {
		return x+y+z;
		
	}

}
