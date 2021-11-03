package com.xworkz.whatsApp.dto;

import java.io.Serializable;

import com.xworkz.whatsApp.Constaints.StatusPrivacy;

//Hibernate uses DTO to perform CRUD
public class WhatsAppDto implements Serializable {

	private int whatsappId;
	private String status;
	private String chats;
	private Long contacts;
	private StatusPrivacy privacy;
	public WhatsAppDto() {
		System.out.println();
	}
	public int getWhatsappId() {
		return whatsappId;
	}
	public void setWhatsappId(int whatsappId) {
		this.whatsappId = whatsappId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getChats() {
		return chats;
	}
	public void setChats(String chats) {
		this.chats = chats;
	}
	public Long getContacts() {
		return contacts;
	}
	public void setContacts(Long contacts) {
		this.contacts = contacts;
	}
	public StatusPrivacy getPrivacy() {
		return privacy;
	}
	public void setPrivacy(StatusPrivacy privacy) {
		this.privacy = privacy;
	}
	
	
	
	
}
