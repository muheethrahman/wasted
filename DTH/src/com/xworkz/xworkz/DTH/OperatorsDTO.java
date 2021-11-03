package com.xworkz.xworkz.DTH;

public class OperatorsDTO {
private int operatorId;
private String operatorName;
private String offer;
private double price;
private int period ;
public int getOperatorId() {
	return operatorId;
}
public void setOperatorId(int operatorId) {
	this.operatorId=operatorId;
}
public String getOperatorName() {
	return operatorName;
	
}
public void setOperatorName(String operatorName) {
	this.operatorName=operatorName;
}
public String getOffer() {
	return offer;
}
public void setOffer(String offer) {
	this.offer=offer;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price=price;
}
public int getPeriod() {
	return period;
}
public void setPeriod(int period) {
	this.period=period;
}
}
