package com.xworkz.execption;

public class ExecptionTester {

	public static void main(String[] args) throws Throwable {
ExecptionEvent execptionEvent = new ExecptionEvent();
System.out.println("program started");
execptionEvent.createEvent(false);
System.out.println("create event with true value");
execptionEvent.createEvent(true);
	}

}
