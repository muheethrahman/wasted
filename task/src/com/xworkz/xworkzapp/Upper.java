package com.xworkz.xworkzapp;


public class Upper {

	public static void main(String[] args) {
		Upper up = new Upper();
		up.upper("welocme hu DER");
	}

	public void upper(String s) {
		String result = "";
		char ch = ' ';
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ch = (char) (s.charAt(i) - 32);
			} else {
				ch = (char) (s.charAt(i));
			}

			result += ch;
		}
		System.out.println(result);
	}
}
