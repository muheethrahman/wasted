package com.xworkz.Interface.DtoDao;

public class StadiumTester {
	public static void main(String[] args) {
		StadiumDto stadiumdto = new StadiumDto("Kantirava", 12, 10000, "Bangaluru");
		StadiumDao stadiumDaiImpl = new StadiumDaoImpl();
		stadiumDaiImpl.addStadium(stadiumdto);
	}
}
