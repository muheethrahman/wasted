package aptitude;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		factorial fat = new factorial();
		fat.factFor();
		fat.factWhile();
		fat.factDoWhile();
		fat.factIf(7, 1, 1);

	}

	void factFor() {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial for of is: " + fact);
	}

	void factWhile() {
		int j = 1, fact = 1;
		while (j <= 6) {
			fact = fact * j;
			j++;

		}
		System.out.println("Factorial  while of is: " + fact);
	}

	void factDoWhile() {
		int k = 1, fact = 1;
		do {
			fact = fact * k;
			k++;

		} while (k <= 2);
		System.out.println("Factorial DoWhile of is: " + fact);
	}

	void factIf(int num, int m, int facts) {

		if (m <  num) {
			m++;
			// System.out.println("Factorial IF of is: "+facts);
			facts = facts * m;

			factIf(num, m, facts);
		} else {
			System.out.println("Factorial IF of is: " + facts);
		}

	}
}
 