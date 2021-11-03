package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.DAO.HospitalDao;
import com.xworkz.xworkzapp.DAO.HospitalDaoImpl;
import com.xworkz.xworkzapp.DTO.HospitalDTO;

public class HospitalServiceImpl implements HospitalService {
	private HospitalDao hospitaldao = new HospitalDaoImpl();

	@Override
	public boolean validdateInfor(HospitalDTO dto) {
		boolean flag = true;
		if (dto.getLicenceNo() == null || dto.getLicenceNo().length() != 8) {
			System.out.println("Invalid licenceNo");
			flag = false;
			return flag;
		}else {
			flag=true;
			
		}
		if (dto.getName() == null || dto.getName().length() < 6) {
			System.out.println("Invalid name ");
			flag = false;
		}
		if (flag==true && dto.getLocation() == null || dto.getLocation().length() < 4) {
			System.out.println("invalid location");
			flag = false;
			
		}
		if (dto.getFounder() == null || dto.getFounder().length() < 4) {
			System.out.println("Invalid founder name");
			flag = false;
			
		}
		if (dto.getSpecialized() == null || dto.getSpecialized().length() < 6) {
			System.out.println("Invalid specialized field");
			flag = false;
			
		}
		if (dto.getPhoneNo() == null || dto.getPhoneNo().length() != 10) {
			flag = false;
		}
		if (flag) {
			hospitaldao.addDeatils(dto);
		}
		return flag;
	}

	@Override
	public void displayAll() {
		hospitaldao.displayAll();
	}

	@Override
	public void display(String licenceNo, String phoneNo) {
		hospitaldao.display(licenceNo, phoneNo);
	}

	@Override
	public void updateByLicenceAndPhonNo(String licenceNo, String phoneNo) {
		hospitaldao.updateByLicenceAndPhonNo(licenceNo, phoneNo);		
	}

	@Override
	public void updateByLocation(String location, String specialized) {
		hospitaldao.updateByLocation(location, specialized);
		
	}

	@Override
	public void deleteByLicence(String licenceNo) {
		// TODO Auto-generated method stub
		
	}

}