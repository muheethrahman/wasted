package aptitude;

public class Alphabets {
	int i, j, n = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets obj = new Alphabets();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		obj.e();
		obj.f();
		obj.g();
		obj.h();
		obj.i();
		obj.j();
		obj.k();
		obj.l();
		obj.m();
		obj.n();
		obj.o();
		obj.p();
		obj.q();
		obj.r();
		obj.s();
		obj.t();
		obj.u();
		obj.v();
		obj.w();
		obj.x();
		obj.y();
		obj.z();

	}

	public void a() {
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n / 2; j++) {
				if (i == 0 && j != 0 && j != n / 2 || j == 0 && i != 0 || j == n / 2 && i != 0 || i == n / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void x() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j || i + j == 4)
					System.out.print("* ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void l() {
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == 0 || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void i() {
		int mid = n / 2;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || j == mid || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void b() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i == 0 && j != n / 2 || j == 0 || j == n / 2 && i != 0 && i != n / 2 && i != n - 1
						|| i == n / 2 && j != n / 2 || i == n - 1 && j != n / 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void e() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i == 0 || i == n - 1 || i == mid || j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void f() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i == 0 || i == mid || j == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void h() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == mid || j == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void c() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i == 0 && j != 0 || i == n - 1 && j != 0 || j == 0 && i != 0 && i != n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void d() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i == 0 && j != n / 2 || i == n - 1 && j != n / 2 || j == 0 || j == n / 2 && i != 0 && i != n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void g() {
		for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<n-1 ;j++ )
            {
                if (j==0||(i==0||i==n-1)&&j<=n/2||(j==n/2||j==n-2)&&i>=n/2||(i==n/2&&j>=n/2))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

	public void m() {

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - 1; j++) {
				if (j == 0 || j == 4 || (i == j && i <= 2) || (i + j == 4 && i <= 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println();
	}

	public void o() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != 0 && i != n - 1 || i == 0 && j != 0 && j != n - 1
						|| j == n - 1 && i != 0 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void n() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void t() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == n - 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void j() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == mid || i == n - 1 && j != n - 1 && j != n - 2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void p() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid || j == n - 1 && mid >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void w() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j && mid <= i || i + j == n - 1 && mid >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void y() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && mid >= i || i + j == n - 1 && mid >= i || j == mid && mid <= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void s() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 && i != n - 1 && i != n - 2 || i == mid || j == n - 1 && i != n - 4
						|| i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void r() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j != n - 1 && j != n - 2
						|| j == mid && i != n - 1 && i != n - 2 | i == mid && j != n - 1 && j != n - 2
						|| i - j == mid) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void k() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i + j == mid || i - j == mid) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void q() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != n - 1 && mid >= i || i == 0 && j != 0 && mid >= j || mid == j && mid >= i
						|| mid == i && mid >= j || i == j && mid <= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void u() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != n - 1 || j == n - 1 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void v() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i && mid > i || i + j == n - 1 && mid >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void z() {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i + j == n - 1 || i == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}
