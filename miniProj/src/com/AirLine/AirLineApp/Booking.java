package com.AirLine.AirLineApp;

public class Booking {
	String source;
	String destination;
	String date;

	public void BooK(String source, String destination, String date, int person) {
		int amount = 5000;
		double gST = amount * 18 / 100;
		double ticket = amount + gST * person;
		System.out.println("your ticket booking deatils are");
		System.out.println("To    " + destination);
		System.out.println("From  " + source);
		System.out.println("Date  " + date);
		System.out.println("No of Persons" + person);
		System.out.println("Total Amount is  " + ticket);

	}
}
