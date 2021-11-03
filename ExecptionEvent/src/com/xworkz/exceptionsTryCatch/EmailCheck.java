package com.xworkz.exceptionsTryCatch;

public class EmailCheck {

	public EmailCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmailCheck(String email) {
		String[] emailString = new String[5];
		int index = 0;
		try {
			if (email.length() > 3)
				emailString[index] = email;
			index++;
		} catch (Exception e) {

			System.out.println("exception arise");
		}
	}

	public void EmailCheckAt(String email)throws RuntimeException {
		System.out.println("control enter in method");
		try {
			if (email.contains("@")) {
				System.out.println("email is correct");
			}else {
				throw new Exception("Exception Arise");
			}
		} catch (Exception e) {
			System.out.println("exception arise from method");
		}
	}
}
