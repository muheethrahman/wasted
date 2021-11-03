package com.xworkz.xworkz.safety;

public class SocialDistance {
	private Mask mask;
	private double bodyTemp;
	private String faceShape;

	
	public void entry(Mask mask) {
		System.out.println("You are in Entered");
		if(this.bodyTemp<=99.08) {
			if(this.mask != null) {
				this.mask=mask;
				System.out.println("You have putted the right mask");
			}
			else {
				System.out.println("Pleace put the mask correctly ");
			}
		}
		else {
			System.out.println("Your body temperature is high ");
		}
	}
	public double getbodyTemp() {
		return bodyTemp;
	}
	public void setbodyTemp(double bodyTemp) {
		this.bodyTemp=bodyTemp;
	}
public String getfaceShape() {
	return faceShape;
}
public void setfaceShape(String faceShape) {
	this.faceShape=faceShape;
	
}
public Mask getMasks() {
	return mask;
}
public void setMasks(Mask mask) {
	this.mask=mask;
}
}
