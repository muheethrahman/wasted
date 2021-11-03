
public class billpay {

	public static void eleBill(int units) {
		// TODO Auto-generated method stub
		double unitRate=25.5;
		double bill= (units*18/100)*unitRate;
		System.out.println("Your electricity bill is :"+bill);
		
	}
	public static void rechBill(long phoneNum ,int amount) {
		// TODO Auto-generated method stub
		System.out.println("Your Recharge of    "+phoneNum+"   is :"+amount);
	}
	private static void cardBill(String cardName,String holderName,long cardNum,int amount) {
		// TODO Auto-generated method stub
		System.out.println("Your Cardname   "+cardName+"   holderName  "+holderName+"   cardnumber  "+cardNum+"  Amount  "+amount+"   is successfull");
	}
	private static void waterBill(int line ,int units) {
		// TODO Auto-generated method stub
		double unitRate=15;
		double bill= (units*18/100)*unitRate;
		System.out.println("Your Water bill is :"+bill);
	}
	
	private static void dthBill(long number, String provider,int amount) {
		// TODO Auto-generated method stub
		System.out.println("Your DTHNumber "+number+"   ProviderName  "+provider+"    Amount  "+amount+"    is successfull");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		billpay.eleBill(80);
		billpay.rechBill(123456789l,250);
		billpay.cardBill("MasterCard","Rahman",123456987412l,5000);
		billpay.waterBill(125,21);
		billpay.dthBill(25896314l,"TataSky",260);
		
	}


}
