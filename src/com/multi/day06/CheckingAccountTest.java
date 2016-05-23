package com.multi.day06;

public class CheckingAccountTest {
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount("12345","gelgel","c12345");
		ca.balance = 10000;
		ca.deposit(20000);
		System.out.println("잔고 : "+ca.balance);
		int amount = ca.withdraw(25000);
		System.out.println("출금 : "+amount);
		amount = ca.pay("c12345", 4000);
		System.out.println("카드출금 : " +amount);
		System.out.println("잔고 : "+ca.balance);
	}
}
