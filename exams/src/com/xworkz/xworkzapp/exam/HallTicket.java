package com.xworkz.xworkzapp.exam;

public class HallTicket {
public String name;
public String usn;
public String subjectCode;
public HallTicket(String name,String usn, String subjectCode) {
	super();
	this.name=name;
	this.usn=usn;
	this.subjectCode=subjectCode;
}
public void displayInfo() {
	System.out.println(this.name);
	System.out.println(this.usn);
	System.out.println(this.subjectCode);
}
}
