package com.multi.day09;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.deposit(1000);
		System.err.println("�ܰ� : "+acc.getBalance());
		try{
		long amount = acc.withdraw(2000);
		return;
		//System.out.println(amount);
		} catch (BalanceInSufficientException e){
			e.getMessage();
		} finally {
			System.out.println("��������");
		}
	}
}
/*
 * 
 super()
 
 
 */
