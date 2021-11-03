package com.xwork.xworkzApp;
public class AirBookDTO {
	private String flightName;
	private int flightCode;
	private String flightComp;
	private String source;
	private String destination;
	private int noSeat;
	private double economic;
	private double business;
	private boolean domastic;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(int flightCode) {
		this.flightCode = flightCode;
	}

	public String getFlightComp() {
		return flightComp;
	}

	public void setFlightComp(String flightComp) {
		this.flightComp = flightComp;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoSeat() {
		return noSeat;
	}

	public void setNoSeat(int noSeat) {
		this.noSeat = noSeat;
	}
	public double getEconomic() {
		return economic;
	}

	public void setEconomic(double economic) {
		this.economic = economic;
	}
	public double getBusiness() {
		return business;
	}

	public void setBusiness(double business) {
		this.business = business;
	}
	public boolean getDomastic() {
		return domastic;
	}

	public void setDomastic(boolean domastic) {
		this.domastic = domastic;
	}

}
