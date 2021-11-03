package aptitude;

public class stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,  n = 5;
		int mid = n/2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == j || i + j == n - 1 || mid == j || mid == i) {
					System.out.print("*" + "  ");
				} else {
					System.out.print("   ");
				}
				System.out.print("");
			}
			System.out.println();
		}
	}

}
