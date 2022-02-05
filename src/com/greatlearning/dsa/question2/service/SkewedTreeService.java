package com.greatlearning.dsa.question2.service;

import java.util.ArrayList;
import java.util.List;

import com.greatlearning.dsa.question2.model.Node;

public class SkewedTreeService {

	public void traverse(Node root) {
		if (root == null)
			return;

		System.out.println(root.data);
		traverse(root.right);

	}

	public Node convertToSkewed(Node root) {

		if(root != null)
		{
			List<Integer> list = new ArrayList<>();
			
			inorderTraversal(root, list);
			
			Node rootSkewedTree = new Node(list.get(0));
			Node tmp = rootSkewedTree;
			
			for(int i=1; i<list.size(); i++)
			{
				tmp.right = new Node(list.get(i));
				tmp = tmp.right;
			}
			return rootSkewedTree;
		}
		
		return null;
	}

	private static void inorderTraversal(Node root, List<Integer> list) {
		if (root != null) {
			inorderTraversal(root.left, list);
			list.add(root.data);
			inorderTraversal(root.right, list);

		}

	}

}
