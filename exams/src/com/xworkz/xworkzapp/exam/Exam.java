package com.xworkz.xworkzapp.exam;
//super class or  parent class 
public class Exam {
 private String examCode;
 //has a relationship
 private HallTicket ticket;
 private int fees;
 
 public void allow (HallTicket ticket) {
	 System.out.println("inside allow");
	 if(this.fees>=1100) {
		 if(ticket != null)//null check  
		 {
			 this.ticket=ticket;
			 System.out.println("can attend the exam");
			 
		 }
		 else
		 {
			 System.out.println("no hall ticket");
		 }
	 }
	 else
	 {
		 System.out.println("please pay th fees");
	 }
 }
 public String getExamCode() {
	 return examCode;
 }
 public void setExamCode(String examCode) {
	 this.examCode=examCode;
	 
 }
 public HallTicket getTicket() {
	 return ticket;
	 }
 public void setTicket(HallTicket ticket) {
	 this.ticket=ticket;
	 
 }
 public int getFees() {
	 return fees;
 }
 public void setFees(int fees) {
	 this.fees=fees;
 }
}

