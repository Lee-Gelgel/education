package com.multi.day04;
//계좌(Account) 클래스는 계좌 번호를 나타내는 accNo 데이터와 잔고를 나타내는 balance 데이터를 가지고 있습니다.
//함수로는 입금을 의미하는 save 함수와 출금을 의미하는 deposit 함수 및 잔고를 확인하는 getBalance 함수와 
//계좌 번호를 확인하는 getAccNo 함수를 가지고 있습니다. 
//TestAccount 클래스를 이용하여 Account 클래스의 함수를 호출시켰을 때 콘솔에 출력되는 결과는 다음과 같습니다.
//
//[TestAccount 실행결과]
//078-3762-293 계좌가 개설되었습니다.
//078-3762-293 계좌의 잔고는 0만원입니다.
//078-3762-293 계좌에 100만원이 입금되었습니다.
//078-3762-293 계좌의 잔고는 100만원입니다.
//078-3762-293 계좌에 30만원이 출금되었습니다.
//078-3762-293 계좌의 잔고는 70만원입니다.

public class TestAccount {
	public static void main(String[] args) {
//		Account a = new Account("078-3762-293");
//		a.save(100000);
//		a.deposit(50000);
		
//		Account b = new Account("078-3762-293",1000000);
//		b.save(1000000);
//		b.deposit(1800000);
		
		Account a = new Account("078-3762-293", 1000);
		a.save(100000);
		a.deposit(50000);
		a.deposit(50000);
		a.deposit(50000);
	}

}
