package com.greatlearning.dsa.question1.main;

import java.util.Scanner;
import com.greatlearning.dsa.question1.service.BuildingService;

public class Driver {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		int numFloor = sc.nextInt();

		int[] floorArray = new int[numFloor];

		for (int i = 0; i < floorArray.length; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1));
			floorArray[i] = sc.nextInt();
		}

		BuildingService buildingService = new BuildingService();
		buildingService.constructUtil(floorArray);
		sc.close();
	}

}
