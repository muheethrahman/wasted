
public class Police {
String stationName;
int NoPolice;
int cases;
int vehicle ;
String area;

public void majesticStation() {
	stationName="majectic";
	NoPolice=15;
	cases=252;
	vehicle=4;
	area="majestic";
	System.out.println("Details of the Station "+stationName);
	System.out.println("NoPolice "+NoPolice);
	System.out.println("cases "+cases);
	System.out.println("vehicle "+vehicle);
	System.out.println("Area Name ="+area);
}
public void rtNagar() {
	stationName="RT Nagar";
	NoPolice=10;
	cases=22;
	vehicle=2;
	area="RT Nagar";
	System.out.println("Details of the Station "+stationName);
	System.out.println("NoPolice "+NoPolice);
	System.out.println("cases "+cases);
	System.out.println("vehicle "+vehicle);
	System.out.println("Area Name ="+area);
}
public void rajajiNagar() {
	stationName="Rajaji Nagar";
	NoPolice=9;
	cases=52;
	vehicle=1;
	area="RajajiNagar";
	System.out.println("Details of the Station "+stationName);
	System.out.println("NoPolice "+NoPolice);
	System.out.println("cases "+cases);
	System.out.println("vehicle "+vehicle);
	System.out.println("Area Name ="+area);
}
public static void main(String a[])
{
	Police obj=new Police();
	obj.majesticStation();
	obj.rtNagar();
	obj.rajajiNagar();
}
}
