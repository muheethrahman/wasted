package com.xworkz.userdetial.service;

import com.xworkz.userdetial.customException.InvalidAdhaar;
import com.xworkz.userdetial.customException.InvalidEmailException;
import com.xworkz.userdetial.customException.InvalidLocationLength;
import com.xworkz.userdetial.customException.InvalidPhoneNo;
import com.xworkz.userdetial.customException.MinSizeException;
import com.xworkz.userdetial.dao.UserDetailsDao;
import com.xworkz.userdetial.dao.UserDetailsDaoImpl;
import com.xworkz.userdetial.dto.UserDetialsDto;

public class UserDetailsServiceImpl implements UserDetailsService {
	private UserDetailsDao obj = new UserDetailsDaoImpl();
	boolean isValid = true;

	@Override
	public void validateInfo(UserDetialsDto dto) throws RuntimeException {
		if (!dto.getEmail().contains("@") || dto.getEmail() == null) {

			isValid = false;
			throw new InvalidEmailException("Invalid Email");
		}
		if (dto.getUserName() == null || dto.getUserName().length() < 4) {
			isValid = false;
			throw new MinSizeException("Invalid Username");
		}
		if (dto.getLocation().length() < 4 || dto.getLocation() == null) {
			isValid = false;
			throw new InvalidLocationLength("Invalid Location");
		}
		if (dto.getPhoneNo() == 0 || dto.getPhoneNo()    < 10) {
			isValid = false;
			throw new InvalidPhoneNo("Invalid PhoneNo");
		}
		if (dto.getAdhaarNo() == null || dto.getAdhaarNo().length() < 8) {
			isValid = false;
			throw new InvalidAdhaar("Invalid AdhaarNo");
		}
		if (isValid) {
			obj.addDetails(dto);
		}

	}

}
