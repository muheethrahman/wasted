package com.xworkz.execption;

public class ExecptionEvent {

	public ExecptionEvent() {
System.out.println("ExecptionEvent Object Generated");
	}
	public void createEvent(boolean create) throws Throwable{
		if(create) {
			throw new Throwable("Throwable event generated");
		}else {
			System.out.println("Event not created");
		}
	}

}
