package com.AirLine.AirLineApp;

public class Flight {
	private static String airPortName = "KempeGowda International AirPort";
	private long flightNo = 2685;
	private String viaRoute = "London";
	private String duration = "5:30 hrs";
	public CustomerDetail[] cust;

	public void DetailInfo() {
		System.out.println("your flight detials are below");
		System.out.println("airPortName" + airPortName);
		System.out.println("Flight Number" + flightNo);
		System.out.println("Via Route of flight" + viaRoute);
		System.out.println("Duration of flight" + duration);
		System.out.println("Happy Journey ");

	}
}
