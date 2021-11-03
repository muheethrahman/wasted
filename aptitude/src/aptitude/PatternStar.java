package aptitude;

public class PatternStar {
int i,j,k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternStar st=new PatternStar();
		st.trSatr();
		st.watStar();
		st.star();
		
		
	}
public void trSatr() {
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
	public void watStar() {
		int n = 7;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j && i + j <= n - 1 || j >= i && i+j >= n - 1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
		public void star() {
			int n = 7;
			for (i = 0; i <= n - 1; i++) {
				for (j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (k = i; k <= n - 1; k++) {
					System.out.print("*" + " ");
				}
				System.out.println("");
			}
			for (i = n - 1; i >= 0; i--) {
				for (j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for (k = i; k <= n - 1; k++) {
					System.out.print("*" + " ");
				}
				System.out.println("");
			}
		}
	
}

