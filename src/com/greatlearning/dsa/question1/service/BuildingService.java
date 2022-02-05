package com.greatlearning.dsa.question1.service;

import java.util.Stack;

public class BuildingService {

	public void constructUtil(int[] floorArray) {

		Stack<Integer> st = new Stack<>();

		System.out.println("\nThe order of construction is as follows");

		int num = floorArray.length;

		for (int i = 0; i < floorArray.length; i++) {
			st.push(floorArray[i]);

			System.out.println("Day: " + (i + 1));

			while (!st.isEmpty() && st.peek() == num) {
				System.out.print(st.pop() + " ");
				num--;
			}
			System.out.println();
		}

	}

}
