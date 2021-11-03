package com.xworkz.xworkz.safety;

public class Mask {
public String faceShape;
public double faceCovered;
public Mask(String faceShape,double faceCovered) {
	super();
	this.faceShape=faceShape;
	this.faceCovered=faceCovered;
}
public void displayInfo() {
	System.out.println(faceShape);
	System.out.println(faceCovered);
}
}
