package aptitude;

public class FibonacciInLeftAngle {
	public static void main(String[] args) {
		FibonacciInLeftAngle ff = new FibonacciInLeftAngle();
		ff.leftAngle();
		// ff.fibonacci();
		ff.left();
	}

	void leftAngle() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	void fibonacci() {
		int n = 5;
		int a = 0, b = 1, sum = 0;
		for (int i = -0; i < n; i++) {
			sum = a + b;
			System.out.println(a + " ");
			a = b;
			b = sum;

		}
		System.out.println();
	}

	void left() {
		int n = 5;
		int a = 0, b = 1, sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					sum = a + b;
					System.out.print(a);
					a = b;
					b = sum;

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
