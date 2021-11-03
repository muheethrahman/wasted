package com.xworkz.Abstract.Task;

public class Garments extends CalGST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CalGST garms=new Garments();
double gSTAmount=garms.getGSTAmount(10000, 10);//amount is 10000 and gst is 10percentage

System.out.println("your GST Amount for garments class is "+gSTAmount);
	}

}