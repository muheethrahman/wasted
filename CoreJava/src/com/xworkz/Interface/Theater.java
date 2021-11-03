package com.xworkz.Interface;

public class Theater  extends TheaterBranch implements Theateroperation{
 private String name;
 private String location;
 private int capacity;
private int noOfScreen;
private int noOfShow;
private boolean isAc;
public Theater(String name, String location, int capacity, int noOfScreen, int noOfShow, boolean isAc) {
	super();
	this.name = name;
	this.location = location;
	this.capacity = capacity;
	this.noOfScreen = noOfScreen;
	this.noOfShow = noOfShow;
	this.isAc = isAc;
}
@Override
public void ticketIssue() {
	// TODO Auto-generated method stub
	System.out.println("GST No :"+super.gstNo);
	System.out.println("Ticket Issue successsfull");
	
}
@Override
public void parkingCheck() {
	// TODO Auto-generated method stub
	System.out.println("Parking Check Successfull");
	
}
@Override
public void orderFood() {
	// TODO Auto-generated method stub
	System.out.println("Thank you for Order ");
}



}
