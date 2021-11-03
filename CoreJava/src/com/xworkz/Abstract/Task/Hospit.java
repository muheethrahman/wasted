package com.xworkz.Abstract.Task;

public class Hospit extends CalGST{

		@Override
		double getGST(double amount) {
			// TODO Auto-generated method stub
			int gst=18;
			double gSTPercentage=(double) (amount*gst/100);
			return gSTPercentage;
		}
}
