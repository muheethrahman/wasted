package com.xworkz.xworkzapp.Insurance;

public class InsuranceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideUsingHashCodeAndToString obje=new OverrideUsingHashCodeAndToString();
		OverrideUsingHashCodeAndToString obje1=new OverrideUsingHashCodeAndToString();
		obj.insuranceId=321;
		obj.type="healt-insurance";
		obj1.insuranceId=258;
		obj1.type="car-insurance";
		System.out.println(obje.insuranceId);
		System.out.println(obje.type);
		System.out.println(obje1.insuranceId);
		System.out.println(obje1.type);
		System.out.println(obje.hashCode());
		System.out.println(obje.toString());
		System.out.println(obje1.hashCode());
		System.out.println(obje1.toString());
		System.out.println(obje.equals(obje1));
	}

}
