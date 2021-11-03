package aptitude;

import java.util.Scanner;

public class Soldier {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier sol = new Soldier();
		char c = ' ';
		do {
			sol.protect();
			System.out.println("if you want ot continue press Y or N");
			c = sc.next().charAt(0);

		} while (c == 'y');
	}

	void protect() {
		int i = 1;
		System.out.println("enter the war won");
		int n = sc.nextInt();
		do {
			System.out.println("india");
			i++;
		} while (i <=n);
	}

}
