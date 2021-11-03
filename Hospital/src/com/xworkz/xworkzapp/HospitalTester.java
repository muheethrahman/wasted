package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.DTO.HospitalDTO;
import com.xworkz.xworkzapp.service.HospitalService;
import com.xworkz.xworkzapp.service.HospitalServiceImpl;

public class HospitalTester {

	public static void main(String[] args) {
		HospitalDTO hospital = new HospitalDTO("fhdy4564","rahman","mandya","Muheeth","SkinCare","8954662552");
		HospitalService service = new HospitalServiceImpl();
		service.validdateInfor(hospital);
		service.displayAll();
		service.updateByLicenceAndPhonNo("fhdy4564", "8954675552");
		service.displayAll();
		service.updateByLocation("mandya", "EyeCare");
		service.displayAll();
		service.display("fhdy4564","8954675552");
		service.deleteByLicence("fhdy4564");
	}

}
