package com.xworkz.xworkz.laptop;

public class HP implements LaptopStructure{
private double price;

public HP(double price) {
	System.out.println("HP class constructor");
	this.price = price;
	buyLaptop("HP",7, "windows");
}

@Override
public void buyLaptop(String brandName, double version, String oSType) {
	// TODO Auto-generated method stub
	System.out.println(" client wants HP Laptop and Requirements are  :"+brandName+" "+version+" "+oSType+" "+price);
}

}
