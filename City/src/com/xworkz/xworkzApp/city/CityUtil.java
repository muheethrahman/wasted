package com.xworkz.xworkzApp.city;

import java.util.Scanner;

import com.xworkz.xworkzApp.Constants.Constants;

import static com.xworkz.xworkzApp.Constants.Constants.*;

public class CityUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("1. insert 2. update 3. delete");
		 * System.out.println("enter the choose"); int choose=sc.nextInt();
		 * 
		 * switch(choose) { case 1:System.out.println("enter the number of wards"); int
		 * size=sc.nextInt(); City city=new City(size); for(int i=0;i<size;i++) {
		 * System.out.println("enter the ward number"); int wardNo=sc.nextInt();
		 * System.out.println("enter the ward Name"); String wardName=sc.next();
		 * System.out.println("enter the Corporator name"); String
		 * corporatorName=sc.next(); System.out.println("enter the popullation"); long
		 * popullation=sc.nextLong();
		 * System.out.println("enter the area in square Kilo Meter"); String
		 * area=sc.next(); CityWardTo CityWardTo=new CityWardTo();
		 * CityWardTo.setWardNo(wardNo); CityWardTo.setWardName(wardName);
		 * CityWardTo.setCorporatorName(corporatorName);
		 * CityWardTo.setpopullation(popullation); CityWardTo.setarea(area);
		 * city.addCityWard(CityWardTo); city.getWardDetails(); } break; case
		 * 2:System.out.println("enter the number of wards"); int size1=sc.nextInt();
		 * City city1=new City(size1);
		 * System.out.println("enter ward no change the popullation"); int
		 * wardNo=sc.nextInt(); System.out.println("enter the popullation"); long
		 * popullation=sc.nextLong(); city1.updateCityWardPopullation(wardNo,
		 * popullation); city1.getWardDetails(); break; case 3:
		 * System.out.println("enter the number of wards"); int size2=sc.nextInt(); City
		 * city2=new City(size2); System.out.println("enter the ward no to delete");
		 * wardNo=sc.nextInt(); city2.deleteCityWardDetails(wardNo); break; }
		 */

		System.out.println("enter the number of wards");
		int size = sc.nextInt();
		City city = new City(size);
		for (int i = 0; i < size; i++) {
			System.out.println("enter the ward number");
			int wardNo = sc.nextInt();
			System.out.println("enter the ward Name");
			String wardName = sc.next();
			System.out.println("enter the Corporator name");
			String corporatorName = sc.next();
			System.out.println("enter the popullation");
			long popullation = sc.nextLong();
			System.out.println("enter the area in square Kilo Meter");
			String area = sc.next();
			CityWardTo CityWardTo = new CityWardTo();
			CityWardTo.setWardNo(wardNo);
			CityWardTo.setWardName(Constants.valueOf(wardName));
			CityWardTo.setCorporatorName(corporatorName);
			CityWardTo.setpopullation(popullation);
			CityWardTo.setarea(area);
			city.addCityWard(CityWardTo);
		}
		city.getWardDetails();
		System.out.println("enter ward no change the popullation");
		int wardNo = sc.nextInt();
		System.out.println("enter the popullation");
		long popullation = sc.nextLong();
		boolean check = city.updateCityWardPopullation(wardNo, popullation);
		System.out.println(check);
		city.getWardDetails();

		System.out.println("enter the ward no to delete");
		wardNo = sc.nextInt();
		city.deleteCityWardDetails(wardNo);
		System.out.println("    ");
		System.out.println(city.cityward.length);/*
													 * in the system class we have variable called "out" hold the print
													 * stream class which has method println (has a relation)
													 */
		String corp = city.getCorporatorNmaeByWardName(RAJAJINAGAR);
		System.out.println(corp);
	}

}
