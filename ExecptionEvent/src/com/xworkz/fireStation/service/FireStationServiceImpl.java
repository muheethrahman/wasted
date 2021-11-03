package com.xworkz.fireStation.service;

import com.xworkz.fireStation.fireStationDto.FireStationDto;

public class FireStationServiceImpl implements FireStationService {

	@Override
	public void validDate(FireStationDto dto) {
		// TODO Auto-generated method stub
		System.out.println("inside validate method");
		try {
			if(dto.getFireId()==null|| dto.getFireId().startsWith("FIR")) {
				throw new InvalidFireStationId("please enter the fireStation");
			}
			if(dto.getHelpLine().length()<6) {
				throw new InvalidHelpLineNo("please enter the FireStation HelpLine number correctly");
			}
		}catch (InvalidFireStationId e) {
			System.out.println("you have entered invalid fire station id");
		}
		catch (InvalidHelpLineNo e) {
			System.out.println("you have invalid fire station helpline");
		}
		System.out.println("validation ends");
	}

}
