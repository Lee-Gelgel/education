package com.multi.day21;

public class Prob3 {
	public static void main(String[] args) {
		Account account = new Account("112-18845-12");
		account.save(1000000);
		account.deposite(700000);
	}
}

class Account {
	// �����Ͻÿ�
	private String accNo;
	private int balance;

	public Account(String accNo) {
		super();
		this.accNo = accNo;
		this.balance = 0;
		System.out.println(accNo + "���°� �����Ǿ��� �ܰ�� " + balance + "�� �Դϴ�.");
	}

	public void save(int amount) {
		balance += amount;
		System.out.println(accNo + "���¿� " + amount + "�� �ԱݵǾ��� �ܰ�� " + balance + "�� �Դϴ�.");

	}

	public void deposite(int amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println(accNo + "���¿� " + amount + "�� ��ݵǾ��� �ܰ�� " + balance + "�� �Դϴ�.");
		} else {
			System.out.println("�ܾ׺���");
		}
	}
}

// [����]
// - ���� ��ȣ�� ��Ÿ���� accNo�� �ܰ� ��Ÿ���� balance �����͸� ������ �ִ�.
// - �Ա��� �ǹ��ϴ� save �Լ��� ����� �ǹ��ϴ� deposit �Լ��� ������ �ִ�.
// - main�Լ��� �������� �ʽ��ϴ�.
// [��°��]
// 112-18845-12���°� �����Ǿ��� �ܰ�� 0�� �Դϴ�.
// 112-18845-12���¿� 1000000�� �ԱݵǾ��� �ܰ�� 1000000���Դϴ�.
// 112-18845-12���¿� 700000�� ��ݵǾ��� �ܰ�� 300000���Դϴ�.
