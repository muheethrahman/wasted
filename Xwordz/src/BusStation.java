
public class BusStation {
String Route;
String ViaRoute;
double time;
String BusNo;
public void Mandya() {
	Route="Mysore";
	ViaRoute ="Maddur";
	time=12.05;
	BusNo="KA10F4568";
	System.out.println("Details of the Mandya Bus station");
	System.out.println("Route=="+Route);
	System.out.println("ViaRoute=="+ViaRoute);
	System.out.println("time of the bus=="+time);
	System.out.println("Bus Number"+BusNo);
	
}
public void ramanagar() {
	Route="Mysore";
	ViaRoute ="Mandya ";
	time=01.25;
	BusNo="KA11F4008";
	System.out.println("Details of the Ramanagar Bus station");
	System.out.println("Route=="+Route);
	System.out.println("ViaRoute=="+ViaRoute);
	System.out.println("time of the bus=="+time);
	System.out.println("Bus Number"+BusNo);
	
}
public void Maddur() {
	Route="Mysore";
	ViaRoute ="Maddur";
	time=12.45;
	BusNo="KA09F45=368";
	System.out.println("Details of the Maddur Bus station");
	System.out.println("Route=="+Route);
	System.out.println("ViaRoute=="+ViaRoute);
	System.out.println("time of the bus=="+time);
	System.out.println("Bus Number"+BusNo);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BusStation bus1=new BusStation();
BusStation bus2=new BusStation();
BusStation bus3=new BusStation();
bus1.Mandya();
bus2.ramanagar();
bus3.Maddur();
	}

}
