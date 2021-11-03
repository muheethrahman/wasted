package com.xworkz.whatsApp;

import com.xworkz.whatsApp.Constaints.StatusPrivacy;
import com.xworkz.whatsApp.dto.WhatsAppDto;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WhatsAppDto appDTO=new WhatsAppDto();
appDTO.setChats("hi dude...");
appDTO.setContacts(8904013254L);
appDTO.setPrivacy(StatusPrivacy.MY_CONTACTS);
appDTO.setStatus("ffff");
appDTO.setWhatsappId(1);
	}

}
