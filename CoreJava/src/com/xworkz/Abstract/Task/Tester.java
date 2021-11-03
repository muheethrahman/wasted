package com.xworkz.Abstract.Task;
import com.xworkz.Abstract.Task.Edu;
import com.xworkz.Abstract.Task.Hospit;
import com.xworkz.Abstract.Task.eletric;
import com.xworkz.Abstract.Task.Hotels;
import com.xworkz.Abstract.Task.Restro;

public class Tester  {
public static void main(String[] args) {
	CalGST obj1=new Edu();
	CalGST obj2=new Hospit();
	CalGST obj3=new Hotels();
	CalGST obj4=new eletric();
	CalGST obj5=new Restro();
	System.out.println("education gst"+obj1.getGST(250000));
	System.out.println("Hospital gst"+obj2.getGST(5000));
	System.out.println("Hotels gst"+obj3.getGST(2500));
	System.out.println("electric gst"+obj4.getGST(25000));
	System.out.println("restro gst"+obj5.getGST(250));
}

 
}
