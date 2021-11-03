package com.xwork.xworkzApp;

public class AirPlane {
	private String airPortName = "KempeGowda International Airport";
	public AirBookDTO[] airBook;
	private int index;

	public AirPlane(int size) {
		airBook = new AirBookDTO[size];

	}

	public void addAirBook(AirBookDTO airBookDTO) {
		if(airBookDTO.getFlightCode() > 0 
				&& airBookDTO.getFlightComp()!=null && airBookDTO.getSource()!=null 
				&& airBookDTO.getBusiness()>1000 && airBookDTO.getEconomic()>800 ) {
			airBook[index++] = airBookDTO;
		}
		
	}

	public void getBookingDetails() {
		System.out.println(airPortName);
		for (int i = 0; i < airBook.length; i++) {

			System.out.println("booking details"+
					airBook[i].getFlightName() + " " + airBook[i].getFlightCode() + " " + airBook[i].getFlightComp()
							+ " " + "" + airBook[i].getSource() + " " + airBook[i].getDestination()+ " " + airBook[i].getNoSeat()+ " " + airBook[i].getEconomic()
							+ " " + airBook[i].getDomastic());
		}

	}
		
		public void bookingInfo(String source){
			if(source!=null) {
				for(AirBookDTO airBookDTO:airBook) {
					if(airBookDTO.getSource().equals(source)) {
						System.out.println(" booking info by Source "+airBookDTO.getFlightComp()+" "+airBookDTO.getFlightName()+" "+airBookDTO.getFlightCode()+" "+
					airBookDTO.getDestination()+" "+airBookDTO.getNoSeat()+" "+airBookDTO.getEconomic()+" "+airBookDTO.getSource()+" "+airBookDTO.getDomastic());
					}
					else {
						System.out.println("your Source not matches");
					}
				}
			}
			else
			{
				System.out.println("plz enter the your source");
			}
		}
		
		
	}


