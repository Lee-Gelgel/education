package com.multi.day06;

public class PointAccountExample {
	public static void main(String[] args) {
		BounsPointAccount b = new BounsPointAccount("1234", "gel");
		b.deposit(1000);
		System.out.println(b.bounsPoint);
		int amount = b.withdraw(1000);
		System.out.println(amount);
	}
}
