package com.multi.day06;

public class CreditLineExample {
	public static void main(String[] args) {
		CreditLineAccount ca = new CreditLineAccount("1234","gelgel",10000);
		ca.deposit(2000);
		System.out.println("balance : " + ca.balance);
		int amount = ca.withdraw(4000);
		System.out.println(amount + "√‚±›");
	}
}
