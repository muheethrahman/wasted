package com.xworkz.Interface;

public class KempG implements Airport {
	int id;

	public KempG(int id) {
		super();
		this.id = id;
		System.out.println(id);
	}

	@Override
	public void securityCheck() {
		// TODO Auto-generated method stub
		System.out.println("your securty check done");
	}

	@Override
	public void ticketIssue() {
		// TODO Auto-generated method stub
		System.out.println("your ticket issued");
	}

}
