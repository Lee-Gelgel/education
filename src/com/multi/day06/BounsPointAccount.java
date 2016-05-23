package com.multi.day06;

public class BounsPointAccount extends BankBook {
	double bounsPoint;

	public BounsPointAccount(String accNo, String owner) {
		super(accNo, owner);
	}

	@Override
	public void deposit(int amount) {
		super.deposit(amount);
		bounsPoint = amount/100;
	}

}
