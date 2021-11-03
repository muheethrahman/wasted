package aptitude;

public class fibonascci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonascci obj = new fibonascci();
		obj.fibonascci();
		obj.fibonascci(0, 1, 5);
		obj.fibonasci(0, 1, 5);
		obj.fibonasc(0, 1, 5);
	}

	private void fibonasc(int g, int h, int d) {
		// TODO Auto-generated method stub
		do {
			// System.out.println();
			System.out.println(g + " ");

			int Sum = g + h;
			g = h;
			h = Sum;
			// fibonascci(g, h, d);
		} while (g < d);
	}

	void fibonasci(int e, int f, int m) {
		// TODO Auto-generated method stub
		System.out.println();
		while (e < m) {
			// System.out.println();
			System.out.println(e + " ");

			int Sum = e + f;
			e = f;
			f = Sum;
			// fibonasci(e, f, m);
		}
	}

	void fibonascci(int i, int j, int k) {
		// TODO Auto-generated method stub
		System.out.println();
		if (i <= k) {

			System.out.println(i + " ");
			int sum = i + j;
			i = j;
			j = sum;
			fibonascci(i, j, k);
		}
	}

	void fibonascci() {
		int a = 0, b = 1, sum = 0;
		for (int i = 0; i <= 5; i++) {
			System.out.println(a + " ");
			sum = a + b;
			a = b;
			b = sum;
		}

	}
}
