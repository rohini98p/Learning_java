package com.rohini.datastructure;

public class Arraylist {
	public static void main(String[] args) {
		Node root = new Node();
		root.data = 1;
		root.left = new Node();
		root.left.data = 2;
		root.right = new Node();
		root.right.data = 3;
		root.left.left = new Node();
		root.left.left.data = 4;
		root.left.right = new Node();
		root.left.right.data = 5;
	}

}
