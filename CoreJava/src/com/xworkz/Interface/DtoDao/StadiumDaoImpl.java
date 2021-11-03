package com.xworkz.Interface.DtoDao;

public class StadiumDaoImpl implements StadiumDao{

	
	StadiumDto stadiumdto[]=new StadiumDto[10];
	@Override
	public void addStadium(StadiumDto dto) {
		// TODO Auto-generated method stub
		stadiumdto[0]=dto;
		System.out.println("Stadium addeds successfull"+dto.getName());
	}

}
