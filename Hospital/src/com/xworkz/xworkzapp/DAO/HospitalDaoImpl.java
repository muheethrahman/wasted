package com.xworkz.xworkzapp.DAO;

import com.xworkz.xworkzapp.DTO.HospitalDTO;

public class HospitalDaoImpl implements HospitalDao {
	HospitalDTO hospitaldto[] = new HospitalDTO[3];
	int index = 0;

	@Override
	public void addDeatils(HospitalDTO dto) {
		hospitaldto[index] = dto;
		index++;
	}

	@Override
	public void displayAll() {
		for (int i = 0; i < index; i++) {
			System.out.println("Hospital Details:" + hospitaldto[i].getLicenceNo() + " " + hospitaldto[i].getName()
					+ " " + hospitaldto[i].getFounder() + " " + hospitaldto[i].getSpecialized() + " "
					+ hospitaldto[i].getPhoneNo());
		}
	}

	@Override
	public void display(String licenceNo, String phoneNo) {
		for (int i = 0; i < index; i++) {
			if (hospitaldto[i].getLicenceNo() == licenceNo && hospitaldto[i].getPhoneNo() == phoneNo) {
				System.out.println("Hospital Details:" + hospitaldto[i].getLicenceNo() + " " + hospitaldto[i].getName()
						+ " " + hospitaldto[i].getFounder() + " " + hospitaldto[i].getSpecialized() + " "
						+ hospitaldto[i].getPhoneNo());
			}
		}
	}

	@Override
	public void updateByLicenceAndPhonNo(String licenceNo, String phoneNo) {
		for (int i = 0; i < index; i++) {
			if (hospitaldto[i].getLicenceNo() == licenceNo) {
				hospitaldto[i].setPhoneNo(phoneNo);
			}
		}
	}

	@Override
	public void updateByLocation(String location, String specialized) {
		for (int i = 0; i < index; i++) {
			if (hospitaldto[i].getLocation() == location) {
				hospitaldto[i].setSpecialized(specialized);
			}
		}
	}

	@Override
	public void deleteByLicence(String licenceNo) {
		for (int i = 0; i < index; i++) {
			if (hospitaldto[i].getLicenceNo() == licenceNo) {
				hospitaldto[i] = null;
			}
		}
	}

}
