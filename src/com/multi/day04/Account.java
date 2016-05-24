package com.multi.day04;

public class Account {
	
	// 1.멤버변수
	private final String accNo; // 계좌번호 변경하면 안됨
	private int balance; // 잔액을 임의로 변경하면 안됨

	// 2.생성자
	public Account(String accNo, int balance) {
		int won = 10000;
		this.accNo = accNo;
		this.balance = balance / won; // 출력이 만원 단위라서 나눠줘야함
		System.out.println(accNo + " 계좌가 개설되었습니다.");
		getBlance();
	}

	public Account(String accNo) {
		this(accNo, 0);
	}

	// 3.메서드
	// 입금함수
	public void save(int money) {
		int won = 10000;
		balance += money / won; // 출력이 만원 단위라서 나눠줘야함
		System.out.println(accNo + " 계좌에 " + balance + "만원이 입금되었습니다.");
		getBlance();
	}

	// 출금함수
	void deposit(int money) {
		int won = 10000;
		if (money/won > balance) {
			System.out.println("잔고부족!! 출금가능액 " + balance +"만원 입니다.");
			
		} else {
			balance -= money / won; // 출력이 만원 단위라서 나눠줘야함
			System.out.println(accNo + " 계좌에 " + balance + "만원이 출금되었습니다.");
			getBlance();
		}
	}

	// 잔고확인함수
	public int getBlance() {
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
		return balance;
	}

	// 계좌번호확인함수
	public String getAccNo() {
		return accNo;
	}
}
