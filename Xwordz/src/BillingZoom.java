
public class BillingZoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ZoomCar obj=new ZoomCar();

obj.carName="verna";
obj.bookingDate="10-feb-2021";
obj.cost=1500;
System.out.println("Details are");
System.out.println("Car Name="+obj.carName+" Date of Booking= "+obj.bookingDate+" Cost is = "+obj.cost);
System.out.println("Name of the user=="+ZoomCar.userName); 
ZoomCar.zoom();
	}

}
