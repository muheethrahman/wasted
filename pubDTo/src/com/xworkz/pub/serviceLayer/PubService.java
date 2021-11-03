package com.xworkz.pub.serviceLayer;

import com.xworkz.pub.dto.PubDto;

public interface PubService {
	public void validateLicenceNumber(PubDto dto);

	public void validateLicenceNumberForUpdate(String licenceNo, int newEntryFees);

	public void displayAll();

	public void displayByLicenceNo(String licenceNo);

	public void deleteByLicence(String licenceNo);
}
