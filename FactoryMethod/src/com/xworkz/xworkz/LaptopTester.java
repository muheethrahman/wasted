package com.xworkz.xworkz;

import java.util.Scanner;

import com.xworkz.xworkz.laptop.DellLaptop;
import com.xworkz.xworkz.laptop.HP;
import com.xworkz.xworkz.laptop.Lenovo;

public class LaptopTester {
	public static void main(String[] args) {
		String ch ,c="y";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("If you want to continue plz press Y or N");
			ch = scanner.next();
			System.out.println("1. Dell 2. HP 3. Lenovo");
			System.out.println("enter the choice");
			int obj = scanner.nextInt();

			switch (obj) {
			case 1:
				System.out.println("You have selected Dell Laptop");
				DellLaptop dellLaptop = new DellLaptop(25000.0);
				break;
			case 2:
				System.out.println("You have selected HP Laptop");
				HP hp = new HP(22000.0);
				break;
			case 3:
				System.out.println("You have selected Lenovo Laptop");
				Lenovo lenovo = new Lenovo(35000.0);
			}
		} while (c.equals(ch));

	}
}
