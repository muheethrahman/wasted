package com.xworkz.xworkz.laptop;

public class DellLaptop implements LaptopStructure {
private double price; 
	public DellLaptop(double price) {
	System.out.println("Dell Class Constructor");
	this.price = price;
	buyLaptop("Dell",10,"windows");
}
	@Override
	public void buyLaptop(String brandName, double version, String oSType) {
		// TODO Auto-generated method stub
		System.out.println(" client wants Dell Laptop and Requirements are  :"+brandName+" "+version+" "+oSType+" "+price);
	}

}
