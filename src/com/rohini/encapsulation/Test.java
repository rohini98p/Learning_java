package com.rohini.encapsulation;

import com.rohini.polymorphism.Compiletime;
import com.rohini.thread.MyThread;

public class Test {
	
	volatile public static int x = 1;
	public static Compiletime obj = new Compiletime();
	public static void main(String args[])
    {	
		int a[]=new int [10];
		for(int i=0;i<10;++i) {
			System.out.print(i+" ");
		}
 
        int n = 5;
        int arr[] = { 4, 2, 6, 9, 2 };
 
        qSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
	public static void qSort(int arr[],int left,int right) {
		if(left< right) {
			int pi=pointer(arr,left,right);
			
			qSort(arr,left,pi-1);
			qSort(arr,pi+1,right);
			
		}
	}
	public static int pointer(int arr[],int left,int right) {
		int cons=arr[right];
		int i=left-1;
		for(int j=left;j<=right-1;j++) {
			if(arr[j]<arr[right]) {
				i++;
				swap(arr,i,j);
			}
			
		}
		swap(arr,i+1,right);
		return i+1;
	}
	public static void swap(int arr[],int left, int right) {
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * Encapsulation ec=new Encapsulation(); // ec.setAge(20); //
	 * ec.setHeight(5.7f); // ec.setWeight(45.7); // ec.getName("Anish"); //
	 * System.out.println(ec.getAge()); // System.out.println(ec.getHeight()); //
	 * System.out.println(ec.getWeight()); System.out.print(Math.max(1, 1));
	 * 
	 * new MyThread().start(); new MyThread().start(); new MyThread().start();
	 * Thread.sleep(100); x=2; new MyThread().start(); new MyThread().start();
	 * 
	 * }
	 */
}
