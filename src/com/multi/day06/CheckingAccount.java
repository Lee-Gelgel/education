package com.multi.day06;

//���Ұ���....BankBook + ī���ȣ(����) + �����ϴ�(�Լ�)
public class CheckingAccount extends BankBook {
	// ��ӹ޾Ƽ� �� �����´�
	// String accNo;
	// String owner;
	// int balance;
	//
	// public void deposit(int amount){
	// balance += amount;
	// }
	// public int withdraw(int amount){
	// if(balance<amount){
	// System.out.println("�ܾ��� �����ϴ�");
	// return 0;
	// }
	// balance -= amount;
	// return amount;
	// }
	
	public CheckingAccount(String accNo, String owner, String cardNo){
		//super(); //�θ��� ������ȣ�⹮���� ����
		//super()->����class�� default������ ȣ��
		//super(����,����)->����class�� �ٸ������� ȣ��
		super(accNo,owner);
		this.cardNo = cardNo;
		System.out.println("�ڽ�class�� ������");
	}

	String cardNo;

	public int pay(String cardNo, int amount) {
		if (!this.cardNo.equals(cardNo)) {
			System.out.println("ī���ȣ�� Ʋ����");
			return 0;
		}
		// �θ�Ŭ������ �Լ��� �ٷ� ����
		// if (balance < amount) {
		// System.out.println("�ܾ��� �����ϴ�");
		// return 0;
		// }
		// balance -= amount;
		// return amount;
		return withdraw(amount);
	}
}
