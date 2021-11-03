package com.xworkz.Abstract.Task;

public class Hospital extends CalGST { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalGST hos=new Hospital();
double gSTAmount=hos.getGSTAmount(100000, 18);//amount is 25000 and gst is 18percentage
System.out.println("your GST Amount for Hospital class is "+gSTAmount);
	}


}
