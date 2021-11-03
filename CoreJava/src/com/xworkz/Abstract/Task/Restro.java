package com.xworkz.Abstract.Task;

public class Restro extends CalGST{

	@Override
	double getGST(double amount) {
		// TODO Auto-generated method stub
		int gst=13;
		double gSTPercentage=(double) (amount*gst/100);
		return gSTPercentage;
	}

}
