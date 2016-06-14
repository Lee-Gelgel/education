package com.multi.day21;

public class Prob3 {
	public static void main(String[] args) {
		Account account = new Account("112-18845-12");
		account.save(1000000);
		account.deposite(700000);
	}
}

class Account {
	// 구현하시오
	private String accNo;
	private int balance;

	public Account(String accNo) {
		super();
		this.accNo = accNo;
		this.balance = 0;
		System.out.println(accNo + "계좌가 개설되었고 잔고는 " + balance + "원 입니다.");
	}

	public void save(int amount) {
		balance += amount;
		System.out.println(accNo + "계좌에 " + amount + "원 입금되었고 잔고는 " + balance + "원 입니다.");

	}

	public void deposite(int amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println(accNo + "계좌에 " + amount + "원 출금되었고 잔고는 " + balance + "원 입니다.");
		} else {
			System.out.println("잔액부족");
		}
	}
}

// [조건]
// - 계좌 번호를 나타내는 accNo와 잔고를 나타내는 balance 데이터를 가지고 있다.
// - 입금을 의미하는 save 함수와 출금을 의미하는 deposit 함수를 가지고 있다.
// - main함수는 수정하지 않습니다.
// [출력결과]
// 112-18845-12계좌가 개설되었고 잔고는 0원 입니다.
// 112-18845-12계좌에 1000000원 입금되었고 잔고는 1000000원입니다.
// 112-18845-12계좌에 700000원 출금되었고 잔고는 300000원입니다.
