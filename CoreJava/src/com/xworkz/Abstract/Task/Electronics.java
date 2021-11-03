package com.xworkz.Abstract.Task;

public class Electronics extends CalGST { 
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	CalGST elect=new Electronics();
	double gSTAmount=elect.getGSTAmount(25000, 18);//amount is 25000 and gst is 18percentage
	System.out.println("your GST Amount for Electronics class is "+gSTAmount);
		}

		@Override
		double getGST(double amount) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

