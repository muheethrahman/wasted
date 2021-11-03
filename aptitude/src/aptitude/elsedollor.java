package aptitude;

public class elsedollor {
	static int n = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == 4)
					System.out.print("@" + " ");
				else if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
					System.out.print("*" + " ");
				else

					System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
