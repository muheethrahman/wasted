package com.xworkz.pub.dto;

public class PubDto {
	private String licenceNo;
	private String gstNo;
	private String name;
	private String location;
	private int noOfTable;
	private int entryFees;

	public PubDto(String licenceNo, String gstNo, String name, String location, int noOfTable, int entryFees) {
		
		System.out.println("Pub Dto Constructor is called");
		this.licenceNo = licenceNo;
		this.gstNo = gstNo;
		this.name = name;
		this.location = location;
		this.noOfTable = noOfTable;
		this.entryFees = entryFees;
	}

	public PubDto() {
		
		System.out.println("No agr Constructor");
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfTable() {
		return noOfTable;
	}

	public void setNoOfTable(int noOfTable) {
		this.noOfTable = noOfTable;
	}

	public int getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(int entryFees) {
		this.entryFees = entryFees;
	}

}
