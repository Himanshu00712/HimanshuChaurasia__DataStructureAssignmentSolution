package com.greatlearning.dsa.question2.main;

import com.greatlearning.dsa.question2.model.Node;
import com.greatlearning.dsa.question2.service.SkewedTreeService;

public class Driver {

	public static void main(String[] args) {
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		SkewedTreeService skewedTreeService = new SkewedTreeService();

		Node node = skewedTreeService.convertToSkewed(root);
		skewedTreeService.traverse(node);
	}

}
