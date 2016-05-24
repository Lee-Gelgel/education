package com.multi.day04;

public class Account {
	
	// 1.�������
	private final String accNo; // ���¹�ȣ �����ϸ� �ȵ�
	private int balance; // �ܾ��� ���Ƿ� �����ϸ� �ȵ�

	// 2.������
	public Account(String accNo, int balance) {
		int won = 10000;
		this.accNo = accNo;
		this.balance = balance / won; // ����� ���� ������ ���������
		System.out.println(accNo + " ���°� �����Ǿ����ϴ�.");
		getBlance();
	}

	public Account(String accNo) {
		this(accNo, 0);
	}

	// 3.�޼���
	// �Ա��Լ�
	public void save(int money) {
		int won = 10000;
		balance += money / won; // ����� ���� ������ ���������
		System.out.println(accNo + " ���¿� " + balance + "������ �ԱݵǾ����ϴ�.");
		getBlance();
	}

	// ����Լ�
	void deposit(int money) {
		int won = 10000;
		if (money/won > balance) {
			System.out.println("�ܰ����!! ��ݰ��ɾ� " + balance +"���� �Դϴ�.");
			
		} else {
			balance -= money / won; // ����� ���� ������ ���������
			System.out.println(accNo + " ���¿� " + balance + "������ ��ݵǾ����ϴ�.");
			getBlance();
		}
	}

	// �ܰ�Ȯ���Լ�
	public int getBlance() {
		System.out.println(accNo + " ������ �ܰ�� " + balance + "�����Դϴ�.");
		return balance;
	}

	// ���¹�ȣȮ���Լ�
	public String getAccNo() {
		return accNo;
	}
}
