package com.AirLine.AirLineApp;

public class CustomerDetail {
	private int custId;
	private String custName;
	private String destination;
	private String source;
	private String date;

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getDestination() {
		return destination;

	}

	public String getSource() {
		return source;
	}

	public String getDate() {
		return date;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
