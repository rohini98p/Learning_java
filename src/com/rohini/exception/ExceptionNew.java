package com.rohini.exception;

public class ExceptionNew {
	public static void main(String[] args) throws Exception {
		run();
		int []arr=new int[10];
		method(arr);
	}
	public static void run() {
		try {
			int n=Integer.parseInt("adb");
			System.out.print("executed");
		}
		catch(Exception e) {
			System.out.print("Exception caused");
		}
		finally {
			System.out.println("block is executed");
		}
	}
	public static void method(int arr[]) throws Exception {
		int n=arr.length;
		try {
			int i=0;
			while(i<arr.length) {
				System.out.println(arr[10]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			throw new Exception();
		}
		catch(Exception ex) {
			System.out.print("out of bounds");
		}
	}
}
