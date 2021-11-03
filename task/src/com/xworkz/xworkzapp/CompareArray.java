package com.xworkz.xworkzapp;

public class CompareArray {
	int a[] = { 1, 2, 4 };
	int b[] = { 1, 2, 3 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareArray com=new CompareArray();
		com.compare();
	}
	public void compare() {
		if (a.length == b.length) {
			for (int i = 0; i <a.length; i++)
				//for(int j=0;j<b.length;j++)
				if (a[i] == b[i]) {
					System.out.println("Array is same");
				}

				else {
					System.out.println("Array is not same");
				}
		} else {
			System.out.println("the length of array is not equal");
		}
	}

}
