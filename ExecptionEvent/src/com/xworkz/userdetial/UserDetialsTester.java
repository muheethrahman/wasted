package com.xworkz.userdetial;

import com.xworkz.userdetial.dto.UserDetialsDto;
import com.xworkz.userdetial.service.UserDetailsService;
import com.xworkz.userdetial.service.UserDetailsServiceImpl;

public class UserDetialsTester {

	public static void main(String[] args) throws Throwable {
		UserDetialsDto dto = new UserDetialsDto("alibaba", "Bangalore", 8974562135l, "25325fdjfnn", "alibaba@gmail.com");
		UserDetialsDto dto1 = new UserDetialsDto("muheeth", "Bangalore", 8974562135l, "25325fdjfnn", "muheeth78@gmail.com");
		UserDetialsDto dto2= new UserDetialsDto("nayyer", "mangalore", 8974562135l, "25325fdjfnn", "nayyer45@gmail.com");
		UserDetialsDto dto3= new UserDetialsDto("jawad", "Mysore", 8974562254l, "25325ffnn", "youmangmail.com");
		UserDetialsDto dto4= new UserDetialsDto("AliBinSaad", "Bangalore", 8974562135l, "25325fdjfnn", "alibaba@gmail.com");
		UserDetailsService service=new UserDetailsServiceImpl();
		service.validateInfo(dto);
		service.validateInfo(dto1);
		service.validateInfo(dto2);
		service.validateInfo(dto3);
		service.validateInfo(dto4);
	}

}
