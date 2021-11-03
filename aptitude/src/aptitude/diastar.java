package aptitude;

public class diastar {

	public static void main(String[] args) {
		int n = 7;
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j && i + j <= n - 1 || j >= i && i+j >= n - 1) {
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}