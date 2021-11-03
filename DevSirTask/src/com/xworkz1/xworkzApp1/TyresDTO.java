package com.xworkz1.xworkzApp1;

public class TyresDTO {
	private String companyName;
	private String tyreFor;
	private int noTyres;
	private double cost;
	private double warranty;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTyreFor() {
		return tyreFor;
	}

	public void setTyreFor(String tyreFor) {
		this.tyreFor = tyreFor;
	}

	public int getNoTyres() {
		return noTyres;
	}

	public void setNoTyres(int noTyres) {
		this.noTyres = noTyres;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {

		this.cost = cost;
	}

	public double getWarranty() {
		return warranty;
	}

	public void setWarranty(double warranty) {
		this.warranty = warranty;
	}
}
