package com.xworkz.Interface.task;

public class Loan implements BankOperations{
	int loan=10000;

	@Override
	public int withDraw(int amount) {
		// TODO Auto-generated method stub
		loan=loan+amount;
		
		return loan;
	}

	@Override
	public int deposit(int amount) {
		// TODO Auto-generated method stub
		loan=loan-amount;
		return loan;
	}


}
