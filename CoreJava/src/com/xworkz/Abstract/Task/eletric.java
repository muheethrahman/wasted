package com.xworkz.Abstract.Task;

public class eletric extends CalGST{

	@Override
	double getGST(double amount) {
		// TODO Auto-generated method stub
		int gst=10;
		double gSTPercentage=(double) (amount*gst/100);
		return gSTPercentage;
	}

}
