package com.multi.day11.thread;

public class ShareArea {
	Account gel;
	Account lu;
	
	public ShareArea(Account gel, Account lu) {
		super();
		this.gel = gel;
		this.lu = lu;
	}
	
	public synchronized void print(){
		int gel2 = gel.getBalance();
		int lu2 = lu.getBalance();
		System.out.println("두 계좌합계:"+(gel2+lu2));
	}
	
	public synchronized void transfer(){
		int amount = gel.witdraw(100);
		System.out.println("gel계좌에서 출금:"+amount);
		lu.deposit(amount);
		System.out.println("lu계좌로 입금:"+amount);
	}
	
}
