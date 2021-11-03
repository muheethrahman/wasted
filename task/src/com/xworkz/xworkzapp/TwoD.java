package com.xworkz.xworkzapp;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoD to = new TwoD();
		to.twoD();
	}

	public void twoD() {
		int[][] a = { { 1, 2, 7 }, { 3, 4, 8 }, { 5, 6, 9 } ,{{1,2,3}{4,5,6}{7,8,9}};

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

	}
}
