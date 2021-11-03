package com.xworkz.pub.dao;

import com.xworkz.pub.dto.PubDto;

public class PubDaoImpl implements PubDao {
	PubDto pubDetails[] = new PubDto[3];
	int index = 0;

	public PubDaoImpl() {
		System.out.println("Pub Dao Impl Constructor");
	}

	@Override
	public void addpubdto(PubDto dto) {
		pubDetails[index] = dto;
		index++;
		System.out.println("Data is add Successfully");
	}

	@Override
	public void updatePubDto(String licenceNo, int newEnterFees) {
		// TODO Auto-generated method stub
		System.out.println("inside the update method");
		for(int i=0;i<index;i++) {
			if(pubDetails[i].getLicenceNo()==licenceNo) {
				pubDetails[i].setEntryFees(newEnterFees);
			}
		}
	}

	@Override
	public void display() {
for(int i=0;i<index;i++) {
	if(pubDetails[i]!=null)
	System.out.println("pub deatils are:"+pubDetails[i].getEntryFees()+" "+pubDetails[i].getGstNo()+" "+pubDetails[i].getLicenceNo()+
			" "+pubDetails[i].getLocation()+" "+pubDetails[i].getName()+" "+pubDetails[i].getNoOfTable());
}
	}

	@Override
	public void displayByLicenceNo(String licenceNo) {
		// TODO Auto-generated method stub
		
			System.out.println("licence number to be deleted"+licenceNo);
		}
	

	@Override
	public void deleteByLicenceNo(String licenceNo) {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++) {
			if(pubDetails[i].getLicenceNo()==licenceNo) {
				pubDetails[i] =null;;
				System.out.println(licenceNo+": is deleted");
			}
		}
	}

}
