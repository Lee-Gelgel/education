package com.multi.day09;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public long withdraw(int money) throws BalanceInSufficientException {
		//�������ܹ߻�
		if(balance<money){
			throw new BalanceInSufficientException("�ܰ����");
		}
//		if(balance<money){
//			System.out.println("�ܰ����");
//			return 0;
//		}
		return 0;
	}
}

class BalanceInSufficientException extends Exception{

	public BalanceInSufficientException(String message) {
		super(message);
	}
	
	
}