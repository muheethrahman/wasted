
public class mount {

	public static void amount(){
		float bill=2800;
		 
		double billpay=0;
		double billAmount=0;
	        	if(bill<1000)
		 {
		      billpay=bill*18/100;
		      billAmount=billpay+bill;
		  }
		else if(bill>1000 && bill<3000)
		 {
		   billpay=bill*13/100;
		   billAmount=billpay+bill;
		 }
		else if(bill>3000)
		{
		    billpay=bill*8/100;
		    billAmount=billpay+bill;
		}
	       
		System.out.println("Bill to pay : "+bill);
		System.out.println("GST :"   + billpay);
		System.out.println("Total :"+billAmount);

	}
	private static void ticket() {
		// TODO Auto-generated method stub
		int sits=2;
		String movieName="Grown_up";
		int amount=0;
		switch(movieName) {
		case "Avenger":
			amount=200*sits;
			System.out.println("Avengers movie ticket cost is  :"+amount);
			break;
		case "Mr.Incridible":
			amount=150*sits;
			System.out.println("Mr.Incridible movie ticket cost is  :"+amount);
			break;
		case "Grown_up":
			amount=300*sits;
			System.out.println("Grown_up movie ticket cost is  :"+amount);
			break;
		case "Avenger2":
			amount=300*sits;
			System.out.println("Avenger2 movie ticket cost is  :"+amount);
			break;
		case "Wonder Women":
			amount=310*sits;
			System.out.println("Wonder Women movie ticket cost is  :"+amount);
			break;
		case "KGF":
			amount=210*sits;
			System.out.println("KGF movie ticket cost is  :"+amount);
			break;
		default:
			System.out.println(movieName+"This movies is not released in this Mall");
		}
	}
	private static void orderFood() {
		// TODO Auto-generated method stub
		int plate=2;
		String foodName="Biriyani";
		int amount=0;
		switch(foodName) {
		case "Pizza":
			amount=200*plate;
			System.out.println("Pizza cost is  :"+amount);
			break;
		case "pasta":
			amount=150*plate;
			System.out.println("Pasta cost is  :"+amount);
			break;
		case "chinese":
			amount=300*plate;
			System.out.println("chinese cost is  :"+amount);
			break;
		case "Indian":
			amount=250*plate;
			System.out.println("Indian food cost is  :"+amount);
			break;
		case "Biriyani":
			amount=310*plate;
			System.out.println("Biriyani cost is  :"+amount);
			break;
		case "Egg_Roll":
			amount=210*plate;
			System.out.println(" Egg_Roll cost is  :"+amount);
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mount.amount();
		mount.ticket();
		mount.orderFood();
	}
	
	
	

}
