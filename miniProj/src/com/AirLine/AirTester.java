package com.AirLine;

import java.util.Scanner;

public class AirTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wish = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("you want continue if yes enter 1 or 0");
		wish = sc.nextInt();

		do {

			System.out.println("1.booking 2. info 3.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("hi");
				break;
			case 2:
				System.out.println("hello");
				break;
			case 3:
				System.out.println("welcome");

				break;
			default:
				System.out.println("plz enter the valid number");
			}
		} while (wish == 1);

	}

}
