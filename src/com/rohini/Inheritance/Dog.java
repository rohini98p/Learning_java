package com.rohini.Inheritance;

public class Dog  extends Animal{
	int leg=4;
	public static void main(String[] args) {
		
	}
	public void setEar(int ear) {
		System.out.println("EAR -"+ear);
	}
    public boolean dogBehaviour(String b) {
    	if(b=="run") {
    		return true;
    	}
    	return false;
    }
    public int setLeg() {
    	if(leg==4) {
    		return leg;
    	}
    	return 0;
    }
    
}
