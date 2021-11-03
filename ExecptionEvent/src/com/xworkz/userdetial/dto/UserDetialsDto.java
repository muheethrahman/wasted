package com.xworkz.userdetial.dto;

public class UserDetialsDto {
	private String userName;
	private String location;
	private long phoneNo;
	private String adhaarNo;
	private String email;

	public UserDetialsDto(String userName, String location, long phoneNo, String adhaarNo, String email) {
		super();
		this.userName = userName;
		this.location = location;
		this.phoneNo = phoneNo;
		this.adhaarNo = adhaarNo;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
