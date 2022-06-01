package com.rohini.thread;

import com.rohini.encapsulation.Test;
import com.rohini.polymorphism.Compiletime;

public class MyThread extends Thread{
	public void run() {
		if(Test.x == 1) {
			try {
				Test.obj.method(1, 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			Compiletime obj = new Compiletime();
			try {
				obj.method(1, 1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

