package com.multi.day11.thread;

public class Account {
	private String accNo;
	private String owner;
	private int balance;

	public Account(String accNo, String owner, int balance) {
		super();
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	void deposit(int amount) {
		balance += amount;
	}

	int witdraw(int amount) {
		if (balance < amount) {
			System.out.println("ÀÜ°íºÎÁ·");
			return 0;
		}
		balance -= amount;
		return amount;
	}

	public int getBalance() {
		return balance;
	}

}
