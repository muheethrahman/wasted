package com.xworkz.Abstract;

public abstract class InterestRate {
	int bankCode;
static int branchCode;
abstract int getHomeLoanInterrest();
abstract int getCarLoanInterrest();
abstract int getPersonalLoanInterrest();/*we can create constructor initize the variable ,we have static 
variable and static methods are allowed */

public static void test() {
	
}
public int getEducationLoan() {
	// TODO Auto-generated method stub
	return 11;
}
}
