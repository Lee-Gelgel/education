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
		System.out.println("�� �����հ�:"+(gel2+lu2));
	}
	
	public synchronized void transfer(){
		int amount = gel.witdraw(100);
		System.out.println("gel���¿��� ���:"+amount);
		lu.deposit(amount);
		System.out.println("lu���·� �Ա�:"+amount);
	}
	
}
