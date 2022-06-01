package com.rohini.Interface;

public class Car implements Vehicle{

	@Override
	public void changeGear(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
	int speed=60+a;
	System.out.println("speed- "+speed);
	}

	@Override
	public void applyBrakes(int a) {
		// TODO Auto-generated method stub
		int brake=a/2;
		System.out.println("BRAKE-"+brake);
	}

}
