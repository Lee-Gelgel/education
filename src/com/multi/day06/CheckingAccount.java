package com.multi.day06;

//직불계좌....BankBook + 카드번호(변수) + 인출하다(함수)
public class CheckingAccount extends BankBook {
	// 상속받아서 다 가져온다
	// String accNo;
	// String owner;
	// int balance;
	//
	// public void deposit(int amount){
	// balance += amount;
	// }
	// public int withdraw(int amount){
	// if(balance<amount){
	// System.out.println("잔액이 부족하다");
	// return 0;
	// }
	// balance -= amount;
	// return amount;
	// }
	
	public CheckingAccount(String accNo, String owner, String cardNo){
		//super(); //부모의 생성자호출문장이 제공
		//super()->상위class의 default생성자 호출
		//super(변수,변수)->상위class의 다른생성자 호출
		super(accNo,owner);
		this.cardNo = cardNo;
		System.out.println("자식class의 생성자");
	}

	String cardNo;

	public int pay(String cardNo, int amount) {
		if (!this.cardNo.equals(cardNo)) {
			System.out.println("카드번호가 틀리다");
			return 0;
		}
		// 부모클래스의 함수로 바로 리턴
		// if (balance < amount) {
		// System.out.println("잔액이 부족하다");
		// return 0;
		// }
		// balance -= amount;
		// return amount;
		return withdraw(amount);
	}
}
