package com.xworkz.Abstract.Task;

public class Education extends CalGST { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalGST edu=new Education();
double gSTAmount=edu.getGSTAmount(30000, 18);//amount is 25000 and gst is 18percentage
System.out.println("your GST Amount for Education class is "+gSTAmount);
	}


}
