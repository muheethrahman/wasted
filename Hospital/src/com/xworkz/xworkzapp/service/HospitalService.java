package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.DTO.HospitalDTO;

public interface HospitalService {
public boolean validdateInfor(HospitalDTO dto);
public void displayAll();

public void display(String licenceNo, String phoneNo);

public void updateByLicenceAndPhonNo(String licenceNo, String phoneNo);

public void updateByLocation(String location, String specialized);

public void deleteByLicence(String licenceNo);

}
