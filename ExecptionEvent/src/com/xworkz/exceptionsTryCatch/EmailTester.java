package com.xworkz.exceptionsTryCatch;

public class EmailTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started the program");
		EmailCheck emailCheck = new EmailCheck("sam@gmail.com");
		EmailCheck emailCheck1 = new EmailCheck("jam@gmail.com");
		EmailCheck emailCheck2 = new EmailCheck("kam@gmail.com");
		EmailCheck emailCheck3 = new EmailCheck(null);
		EmailCheck emailCheck4 = new EmailCheck("shamgmail.com");
		EmailCheck emailCheck5 = new EmailCheck("dam@gmail.com");
		emailCheck.EmailCheckAt("you@gmail.com");
		emailCheck1.EmailCheckAt("me@gmail.com");
		emailCheck2.EmailCheckAt("we@gmail.com");
		emailCheck3.EmailCheckAt("sham@gmail.com");
		emailCheck4.EmailCheckAt("brocodegmail.com");
		emailCheck5.EmailCheckAt("gogo@gmail.com");
		System.out.println("EOD program");
	}

}
