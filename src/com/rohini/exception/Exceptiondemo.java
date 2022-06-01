package com.rohini.exception;

public class Exceptiondemo{
	public static void main(String []args) {
		System.out.println("mn");
		exception();
		System.out.print("hello world");
		shuffleArray(new long[10],10);
		
		
	}
	static void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        for(int i=0;i<n;i=i+2){
            int j=0;
            while(j<n/2){
                arr[i]=arr[j];
            }
            int k=n/2;
            while(k<n){
                arr[i+1]=arr[k]; 
            }
            j++;
            k++;
            System.out.println(arr[i]+" "+arr[i+1]);
        }
    }
	public static void exception() {
		int a=1;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception x) {
			System.out.print("exception ocurred");
			exce();
		}
		
	}
	public static void exce() {
		int arr[]=new int[10];
		try {
			for(int i=0;i<10;i++) {
				System.out.print("array"+arr[10]);
			}
		}
		catch(Exception ex) {
			System.out.print("arrays out of bounds");
		}
	}
}
