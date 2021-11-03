package com.xworkz.Interface.task;

public class TesterBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperations saving=new Saving();
		BankOperations loan=new Loan();
		int savingBalance=saving.deposit(2500);
		int loanBalance=loan.withDraw(10000);
		System.out.println("first 10000    "+savingBalance);
		System.out.println("first loan10000    "+loanBalance);

	}

}
