package com.xworkz.userdetial.service;

import com.xworkz.userdetial.dto.UserDetialsDto;

public interface UserDetailsService {
	public void validateInfo(UserDetialsDto dto) throws RuntimeException;
}
