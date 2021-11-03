package com.xworkz.Abstract.Task;

public class Hotel extends CalGST { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalGST hot=new Hotel();
double gSTAmount=hot.getGSTAmount(500, 13);//amount is 25000 and gst is 18percentage
System.out.println("your GST Amount for Hotel class is "+gSTAmount);
	}


}
