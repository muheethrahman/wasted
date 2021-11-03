package com.xworkz.userdetial.dao;

import com.xworkz.userdetial.dto.UserDetialsDto;

public class UserDetailsDaoImpl implements UserDetailsDao {
	UserDetialsDto userdetailsdto[] = new UserDetialsDto[5];
	int index = 0;

	@Override
	public void addDetails(UserDetialsDto dto) throws RuntimeException {
		userdetailsdto[index] = dto;
		index++;
		System.out.println("data is added");
	}

}
