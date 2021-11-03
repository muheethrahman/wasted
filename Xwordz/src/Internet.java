
public class Internet {
String internetProvider;
String plan;
String address;
double cost;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Internet inter=new Internet();
		Internet obj=new Internet();
		inter.internetProvider="Airtel Telecom Network";
		inter.plan="Specail plan";
		inter.cost=1500.00;
		inter.address="rajajinagar";
		obj.internetProvider="Vodafone Telecom Network";
		obj.plan="Normal plan";
		obj.cost=150.00;
		obj.address="RT Nagar";
		inter.serve();
		System.out.println("Name of the Provider "+"    Plan Name  "+"  Cost of the Plan"+"   Address of provider");
        System.out.println(inter.internetProvider+"   "+inter.plan+"   "+inter.cost+"           "+inter.address);
        System.out.println(obj.internetProvider+"   "+obj.plan+"   "+obj.cost+"           "+obj.address);
	}
public void serve() {
	System.out.println("Details of the service provider");
}
}
