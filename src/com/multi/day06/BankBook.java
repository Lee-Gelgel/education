package com.multi.day06;

//final class : 자식class를 가질수 없다. 상속불가
//final 함수 : 재정의불가(Override 불가)
//finla 변수 : 상수, 값변경불가, 선언 혹은 생성자에서 반드시 값셋팅
//final static : 상수, 값변경불가, 선언시 값셋팅
public class BankBook {
	final String name="gelgel";;
	//변수
	String accNo;
	String owner;
	int balance;
	
	public BankBook(){
		//super();
		
		System.out.println("부모class의 생성자");
	}
	
	//생성자
	public BankBook(String accNo, String owner) {
		this.accNo = accNo;
		this.owner = owner;
		balance=0;
	}
	
	//함수
	public void deposit(int amount){
		balance += amount;
	}
	
	
	protected int withdraw(int amount){
		if(balance<amount){
			System.out.println("잔액이 부족하다");
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
