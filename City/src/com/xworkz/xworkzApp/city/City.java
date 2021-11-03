package com.xworkz.xworkzApp.city;

import com.xworkz.xworkzApp.Constants.Constants;

public class City {
	private String name = "Bengaluru";
	public CityWardTo[] cityward;
	private int index;

	public City(int size) {
		cityward = new CityWardTo[size];

	}

	public void addCityWard(CityWardTo cityWardTo) {
		cityward[index++] = cityWardTo;
	}

	public void getWardDetails() {
		System.out.println(name);
		for (int i = 0; i < cityward.length; i++) {

			System.out.println(
					cityward[i].getWardNo() + " " + cityward[i].getWardName() + " " + cityward[i].getCorporatorName()
							+ " " + "" + cityward[i].getpopullation() + " " + cityward[i].getArea());
		}
	}

	public void getWardByName(String name) {
		for (int i = 0; i < cityward.length; i++) {
			System.out.println(
					cityward[i].getWardNo() + " " + cityward[i].getWardName() + " " + cityward[i].getCorporatorName()
							+ " " + "" + cityward[i].getpopullation() + " " + cityward[i].getArea());
		}
	}

	/*
	 * public void updateCityWardPopullation(int wardNo,long popullation) {
	 * if(popullation >0) { for (int i=0;i<cityward.length;i++) {
	 * if(cityward[i].getWardNo()==wardNo) {
	 * cityward[i].setpopullation(popullation); } else {
	 * System.out.println("no ward found"); } }
	 * 
	 * } }
	 */
	public boolean updateCityWardPopullation(int wardNo, long popullation) {
		boolean check = false;
		if (popullation > 0) {
			for (CityWardTo cityWardTo : cityward) {
				if (cityWardTo.getWardNo() == wardNo) {
					cityWardTo.setpopullation(popullation);
					check = true;
				} else {
					System.out.println("no ward found");
				}
			}

		}
		return check;
	}

	public void deleteCityWardDetails(int wardNo) {
		for (int i = 0; i < cityward.length; i++) {
			if (cityward[i].getWardNo() == wardNo) {
				cityward[i] = null;

				System.out.println("ward is deleted");
			}

		}

	}

	public String getCorporatorNmaeByWardName(Constants WardName) {
		for (CityWardTo cityWardTo : cityward) {
			if (cityWardTo.getWardName().equals(WardName)) {
				return cityWardTo.getCorporatorName();
			}
		}
		return null;

	}
}
