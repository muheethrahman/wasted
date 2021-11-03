package aptitude;

public class LastPatternProgram {
int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastPatternProgram lpp =new LastPatternProgram();
//		lpp.diamand();
//	lpp.reverseDiamaond();
		lpp.o();
	//lpp.v();
		}  
	public void diamand() {
		int n=5;int m=0;
		int i,j, mid=n/2;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i-j==mid||i+j==mid||j-i==mid||i+j==mid*3) {
					m=m+1;
					System.out.print(m+" ");
				}
				System.out.print("   ");
			}
			System.out.println();
		}
		
	}
	public void  reverseDiamaond() {
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
	void o() {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != 0 && i != n - 1 || i == 0 && j != 0 && j != n - 1
						|| j == n - 1 && i != 0 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
					System.out.print(i+" ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	void v() {
		
		int n=19;
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if (j == i && mid > i || i + j == n - 1 && mid >= i) {
					if(j%2==0) {
						System.out.print(j+" ");
					}
					
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	}


