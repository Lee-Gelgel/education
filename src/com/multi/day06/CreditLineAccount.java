package com.multi.day06;

public class CreditLineAccount extends BankBook {

	int creditLine;
	
	public CreditLineAccount(String accNo, String owner, int creditLine) {
		super(accNo, owner);
		this.creditLine = creditLine;
	}


	//�Ա��Լ�....��ӹ����� ���
	//����Լ�....������(�����, Override)
	//Override => �Լ��̸�, �Ű��������(����,Ÿ��)���ƾ���
	//���������ڴ� ���ų� �� �о����
	public int withdraw(int amount){
		System.out.println("���̳ʽ� �����̴�");
		if(balance+creditLine<amount){
			System.out.println("�ܾ��� �����ϴ�");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	
	
	
}
