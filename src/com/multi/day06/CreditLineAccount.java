package com.multi.day06;

public class CreditLineAccount extends BankBook {

	int creditLine;
	
	public CreditLineAccount(String accNo, String owner, int creditLine) {
		super(accNo, owner);
		this.creditLine = creditLine;
	}


	//입금함수....상속받은거 사용
	//출금함수....재정의(덮어쓰기, Override)
	//Override => 함수이름, 매개변수사양(갯수,타입)같아야함
	//접근지정자는 같거나 더 넓어야함
	public int withdraw(int amount){
		System.out.println("마이너스 통장이다");
		if(balance+creditLine<amount){
			System.out.println("잔액이 부족하다");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	
	
	
}
