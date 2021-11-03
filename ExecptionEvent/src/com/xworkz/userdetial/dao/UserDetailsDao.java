package com.xworkz.userdetial.dao;

import com.xworkz.userdetial.dto.UserDetialsDto;

public interface UserDetailsDao {
	public void addDetails(UserDetialsDto dto) throws RuntimeException;
}
