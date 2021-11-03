package Xworkzapp;

public class City {
public CityWardTo[ cityWardTo;
private int index;
public City(int size) {
	cityWardTo =new CityWardTo[size];
}
public void saveCityWards(CityWardTO cityWardTo) {
	this.cityWardsTo[index++]=cityWardTo;
}
public void getCityWardDetails() {
	for(int i=0;i<cityWardTo.length;i++) {
		System.out.println(cityWardTo[i].getWardName()+" "+cityWardTo[i].getWardNo()+" "+city[i].getWardName()
				+" "+cityWardTo[i].getWardCoropratorName()+" "+cityWardTo[i].getAreaSize());
		
	}
}
}
