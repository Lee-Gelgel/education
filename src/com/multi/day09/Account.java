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
		//강제예외발생
		if(balance<money){
			throw new BalanceInSufficientException("잔고부족");
		}
//		if(balance<money){
//			System.out.println("잔고부족");
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