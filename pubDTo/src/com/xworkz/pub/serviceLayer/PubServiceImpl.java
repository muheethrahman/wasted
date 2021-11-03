package com.xworkz.pub.serviceLayer;

import com.xworkz.pub.dao.PubDao;
import com.xworkz.pub.dao.PubDaoImpl;
import com.xworkz.pub.dto.PubDto;

public class PubServiceImpl implements PubService {
	private PubDao pubDaoImpl = new PubDaoImpl();

	public PubServiceImpl() {
		System.out.println(" pub Sevice Impl Constructor");
	}

	@Override
	public void validateLicenceNumber(PubDto dto) {
		if (dto.getLicenceNo() != null) {
			pubDaoImpl.addpubdto(dto);
		}
		else {
			System.out.println("enter the details ");
		}
	}

	@Override
	public void validateLicenceNumberForUpdate(String licenceNo, int newEntryFees) {
		// TODO Auto-generated method stub
		if (licenceNo != null) {
			pubDaoImpl.updatePubDto(licenceNo, newEntryFees);

		}
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		pubDaoImpl.display();
	}

	@Override
	public void displayByLicenceNo(String licenceNo) {
		// TODO Auto-generated method stub
		pubDaoImpl.displayByLicenceNo(licenceNo);
	}

	@Override
	public void deleteByLicence(String licenceNo) {
		// TODO Auto-generated method stub
		pubDaoImpl.deleteByLicenceNo(licenceNo);
	}

	
	

	
}
