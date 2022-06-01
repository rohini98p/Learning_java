package com.rohini.patterns;

import java.util.*;

public class Triangle {
	public static void main(String[] args) {
            //  inner loop to handle number of columns
		//solve();
		System.out.println(solve5(16,2,2));
		System.out.println(solve2("abcc","abbc"));
		asdasd().toString().equals("");
		new Boolean(true).toString().toString().toString().toString().toString().toString();
	}

		public static Object asdasd(){
			return new Object();
		}
	  public static int[][] solve1(int[][] arr) {
		  HashMap<Integer,ArrayList<Integer>> map=new HashMap<>(); 
		  for(int i=0;i<arr.length;i++) { 
			  int[] arr1=arr[i]; 
			  int a=arr1[0]; 
			  	if(map.containsKey(a)) { 
				  ArrayList<Integer> marks = map.get(a);
				  marks.add(arr1[1]);
				} else { 
					ArrayList<Integer> al=new ArrayList<>();
					al.add(arr1[i]);
					map.put(a,al);
				} 
		 } 
		 for(Integer a:map.keySet()) { 
			 ArrayList<Integer> al=map.get(a);
			 al.stream().min(null);
			 Collections.sort(al);
		 }
		 return null;
	 }
	 
	public static boolean solve3(int[][] arr) {
		Arrays.stream(arr).sorted((o1, o2) -> {return o1[0]-o2[0];});

		//Arrays.sort(arr[0],(a,b) -> {return b-a;});
		
		for(int i=0;i<arr.length-1;i++) {
			//int[] arr1=arr[i];
			/*
			 * int a=arr1[0]; int b=arr1[1];
			 */
				int[] a=arr[i];
				int[] b=arr[i+1];
				if(a[1]>b[0]) {
					return false;
				}
		}
		return true;
	}
	public static boolean solve2(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}
			else {
				map.put(ch,map.get(ch)+1);
			}
		}
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			if(!map.containsKey(ch)) {
				return false;
			}
			else if(map.get(ch)==1) {
				map.remove(ch);
			}
			else {
				map.put(ch,map.get(ch)-1);
			}
		}
		return false;
		
	}
	static int maxval=0;
	static Stack<Integer>st=new Stack<>();
	public static void solve4() {
	   push(0);
	   pop(0);
	   max(0);
	}
	static void push(int x) {
		if(st.isEmpty()) {
			st.push(x);
			maxval=x;
		}
		if(x>maxval) {
			st.push(2*x-maxval);
			maxval=x;
		}
		else {
			st.push(x);
		}
	}
	static void pop(int x) {
		if(st.isEmpty()) {
			return;
		}
		int t=st.peek();
		st.pop();
		if(t>maxval) {
			maxval=2*maxval-t;
		}
		else {
			System.out.print(t);
		}
	}
	static void peek(int x) {
		if(st.isEmpty()) {
			System.out.print("Stack is Empty");
		}
		int t=st.peek();
		if(t>maxval) {
			System.out.print(maxval);
		}
		else {
			System.out.print(t);
		}
	}
	static int max(int x) {
		if(st.isEmpty()) {
			return 0;
		}
		return maxval;
	}
	
	public static int solve5(int money,int prize,int noOfWraperRequiredToGetChol) {
		return money/prize+solve6(money/prize,noOfWraperRequiredToGetChol,0);
	}
	public static int solve6(int wraper,int noOfWraperRequiredToGetChol,int rem) {
		if((wraper+rem)<noOfWraperRequiredToGetChol){
			return 0;
		}
		int a=(wraper+rem)/noOfWraperRequiredToGetChol;
		rem=(wraper+rem)%noOfWraperRequiredToGetChol;
		return a+solve6(a,noOfWraperRequiredToGetChol,rem);
	}
	

}
