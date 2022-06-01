package com.rohini.datastructure;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<>();
		ll.add("geeks");
		ll.add("for");
		ll.add("geeks");
		System.out.println("linkedlist"+ll);
		ll.remove("geeks");
		System.out.println("linkedlist"+ll);
		ll.addFirst("rohini");
		System.out.println("linkedlist"+ll);
		ll.addLast("completed");
		System.out.println("linkedlist"+ll);
		ll.set(0, "geeks");
		System.out.println("linkedlist"+ll);
				

	}

}
