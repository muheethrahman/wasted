package com.xworkz.xworkz.laptop;

public class Lenovo implements LaptopStructure {
private double price;

	public Lenovo(double price) {
	System.out.println("Lenovo class constructor ");
	this.price = price;
	buyLaptop("lenovo", 5,"Linux");
}

	@Override
	public void buyLaptop(String brandName, double version, String oSType) {
		// TODO Auto-generated method stub
		System.out.println(" client wants Lenovo Laptop and Requirements are  :"+brandName+" "+version+" "+oSType+" "+price);

	}

}
