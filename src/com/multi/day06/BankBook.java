package com.multi.day06;

//final class : �ڽ�class�� ������ ����. ��ӺҰ�
//final �Լ� : �����ǺҰ�(Override �Ұ�)
//finla ���� : ���, ������Ұ�, ���� Ȥ�� �����ڿ��� �ݵ�� ������
//final static : ���, ������Ұ�, ����� ������
public class BankBook {
	final String name="gelgel";;
	//����
	String accNo;
	String owner;
	int balance;
	
	public BankBook(){
		//super();
		
		System.out.println("�θ�class�� ������");
	}
	
	//������
	public BankBook(String accNo, String owner) {
		this.accNo = accNo;
		this.owner = owner;
		balance=0;
	}
	
	//�Լ�
	public void deposit(int amount){
		balance += amount;
	}
	
	
	protected int withdraw(int amount){
		if(balance<amount){
			System.out.println("�ܾ��� �����ϴ�");
			return 0;
		}
		balance -= amount;
		return amount;
	}
}
