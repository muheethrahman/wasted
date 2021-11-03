package com.xworkz.fireStation.fireStationDto;

public class FireStationDto {
private String fireId;
private String fireStationName;
private String location;
private String helpLine;
public FireStationDto(String fireId, String fireStationName, String location, String helpLine) {
	super();
	this.fireId = fireId;
	this.fireStationName = fireStationName;
	this.location = location;
	this.helpLine = helpLine;
}
public String getFireId() {
	return fireId;
}
public void setFireId(String fireId) {
	this.fireId = fireId;
}
public String getFireStationName() {
	return fireStationName;
}
public void setFireStationName(String fireStationName) {
	this.fireStationName = fireStationName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getHelpLine() {
	return helpLine;
}
public void setHelpLine(String helpLine) {
	this.helpLine = helpLine;
}

}
