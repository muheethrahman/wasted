package com.xworkz.pub.dao;

import com.xworkz.pub.dto.PubDto;

public interface PubDao {
	public void addpubdto(PubDto dto);

	public void updatePubDto(String licenceNo, int newEnterFees);

	public void display();

	public void displayByLicenceNo(String licenceNo);

	public void deleteByLicenceNo(String licenceNo);

}
