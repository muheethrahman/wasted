package com.xworkz.fireStation.fireStationDao;

import com.xworkz.fireStation.fireStationDto.FireStationDto;

public class FireStationDaoImpl implements FireStationDao{
FireStationDto fire[]=new FireStationDto[5];
int index=0;
	@Override
	public void addDetails(FireStationDto dto) {
		fire[index]=dto;
	}

}
