package com.greatlearning.bsttoskewedmain;

import com.greatlearning.bsttoskewed.BSTtoSkewed;
import com.greatlearning.node.Node;

public class BSTtoSkewedMain {

	public static void main(String[] args) {
		
		
		BSTtoSkewed obj = new BSTtoSkewed();
		
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);
		
		
		Node rightRoot = new Node(0);
		rightRoot = obj.BSTSkewed(root);
		
		
		obj.traverseRightSkewed(rightRoot);
		

	}

}
