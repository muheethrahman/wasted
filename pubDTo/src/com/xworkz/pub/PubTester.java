package com.xworkz.pub;

import com.xworkz.pub.dto.PubDto;
import com.xworkz.pub.serviceLayer.PubService;
import com.xworkz.pub.serviceLayer.PubServiceImpl;

public class PubTester {

	public static void main(String[] args) {
		PubDto pubdto = new PubDto("25226fdg", "fsfgdgdg525", "tipsy", "kormagala", 20, 3000);
		PubDto pubdto1 = new PubDto("2504fg", "assd5252", "Stories", "rt nagar", 21, 300);
		PubDto pubdto2 = new PubDto("256fdg", "some25", "three dot", "majestic", 25, 1000);
		PubService pubServiceImpl = new PubServiceImpl();
		pubServiceImpl.validateLicenceNumber(pubdto);
		pubServiceImpl.validateLicenceNumber(pubdto1);
		pubServiceImpl.validateLicenceNumber(pubdto2);
		pubServiceImpl.displayAll();
		pubServiceImpl.validateLicenceNumberForUpdate("2504fg", 500);
		pubServiceImpl.displayAll();
		pubServiceImpl.displayByLicenceNo("2504fg");
		pubServiceImpl.deleteByLicence("2504fg");
		pubServiceImpl.displayAll();
	}

}
