package com.xworkz.xworkz;

import java.util.Scanner;

import com.xworkz.xworkz.DTH.DthPay;
import com.xworkz.xworkz.DTH.OperatorsDTO;



public class DthTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
String ch;
do {
	System.out.println("Do u wants to continue the process Y or N");
	ch=sc.next();
	System.out.println("enter the number of entries");
	int size = sc.nextInt();
	DthPay dp = new DthPay(size);
	for (int i = 0; i < size; i++) {
		System.out.println("enter the Operator Id");
		int operatorId=sc.nextInt();
		System.out.println("enter the Operator Name");
		String OperatorName=sc.next();
		System.out.println("enter the Offer special or regular");
		String offer=sc.next();
		System.out.println("enter the Price 399 or 499 or 599 or 299");
		double price=sc.nextDouble();
		System.out.println("enter the period 56 or 46 or 28");
		int period=sc.nextInt();
		OperatorsDTO operator=new OperatorsDTO();
		operator.setOperatorId(operatorId);
		operator.setOperatorName(OperatorName);
		operator.setOffer(offer);
		operator.setPrice(price);
		operator.setPeriod(period);
		dp.addOperatorDetails(operator);
	}
	dp.getOperatorsDetails();
//	System.out.println("enter the operator name to check the details");
//	String operatorName=sc.next();
//	dp.infoBYOperatorName(operatorName);
	System.out.println("enter the operator id to change the operator name");
	int operatorId=sc.nextInt();
	System.out.println("enter the operator name");
	String operatorName=sc.next();
	boolean check=dp.updateOperatorNameByOperatorId(operatorId, operatorName);
	System.out.println(check);
	dp.getOperatorsDetails();
	System.out.println("enter the operator id to delete");
	operatorId=sc.nextInt();
	dp.deleteOperatorId(operatorId);
	
}while(ch.equals("y"));
	}

}
