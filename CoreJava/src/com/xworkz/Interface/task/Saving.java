package com.xworkz.Interface.task;

public class Saving implements BankOperations{

int saving=10000;

	@Override
	public int withDraw(int amount) {
		// TODO Auto-generated method stub
		saving=saving-amount;
		
		return saving;
	}

	@Override
	public int deposit(int amount) {
		// TODO Auto-generated method stub
		saving=saving+amount;
		return saving;
	}

	
}
