
public class Airport {
String airportName;
int noOfTerminals;
String arrival;
String dest;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Airport obj=new Airport();
obj.airportName="KempeGowda International Airport";
obj.noOfTerminals=32;
obj.arrival="Bangaluru";
obj.dest="Dubai";
obj.checking();
System.out.println("Name of the Airport         "+"   No Of Terminals "+"Arrival  "+"  Departure ");
System.out.println(obj.airportName+"     "+obj.noOfTerminals+"       "+obj.arrival+"   "+obj.dest);
	}
public void checking() {
	System.out.println("passenger checking process");
}

}
