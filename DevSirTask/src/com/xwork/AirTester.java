package com.xwork;

import java.util.Scanner;

import com.xwork.xworkzApp.AirBookDTO;
import com.xwork.xworkzApp.AirPlane;


public class AirTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of Bookings");
		int size = sc.nextInt();
		AirPlane airPlane = new AirPlane(size);
		for (int i = 0; i < size; i++) {
			System.out.println("enter the FlightName");
			String flightName=sc.next();
			System.out.println("enter the FlightCode");
			int flightCode=sc.nextInt();
			System.out.println("enter the flightComp");
			String flightComp=sc.next();
			System.out.println("enter the Source");
			String source=sc.next();
			System.out.println("enter the Destination");
			String destination=sc.next();
			System.out.println("enter the No of Seats");
			int noSeat=sc.nextInt();
			System.out.println("enter the Economic");
			double economic=sc.nextDouble();
			System.out.println("enter the Business");
			double business=sc.nextDouble();
			System.out.println("enter the Domastic");
			boolean domastic=sc.nextBoolean();
			AirBookDTO airBookDTO=new AirBookDTO();
			airBookDTO.setFlightName(flightName);
			airBookDTO.setFlightCode(flightCode);
			airBookDTO.setFlightComp(flightComp);
			airBookDTO.setSource(source);
			airBookDTO.setDestination(destination);
			airBookDTO.setNoSeat(noSeat);
			airBookDTO.setEconomic(economic);
			airBookDTO.setBusiness(business);
			airBookDTO.setDomastic(domastic);
			airPlane.addAirBook(airBookDTO);
			
			}
		airPlane.getBookingDetails();
		airPlane.bookingInfo("kempegowda");
		
	}

}
