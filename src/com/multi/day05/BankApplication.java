package com.multi.day05;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("------------------------------------");
			System.out.print("����>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				crateAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	// ���»����ϱ�
	private static void crateAccount() {
		System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next();
		System.out.print("������:");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();
		int index = 0;
		boolean run = true;
		while (run) {
			if (accountArray[index] == null) {
				accountArray[index] = new Account(ano, owner, balance);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				run = false;
			} else {
				if (accountArray[index].getAno().equals(ano)) {
					System.out.println("���: �̹� �����ϴ� �����Դϴ�.");
					return;
				}
				index++;
			}
		}
	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				return;
			} else {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t"
						+ accountArray[i].getBalance());
			}
		}
	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next();
		System.out.print("�Աݾ�:");
		int amount = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���: �������� �ʴ� �����Դϴ�.");
		} else {
			int balance = account.getBalance();
			account.setBalance(balance + amount);
			System.out.println("���: ������ �����Ǿ����ϴ�.");
		}

	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next();
		System.out.print("��ݾ�:");
		int amount = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("���: �������� �ʴ� �����Դϴ�.");
		} else {
			int balance = account.getBalance();
			if (balance < amount) {
				System.out.println("���: �ܰ��� �����մϴ�.");
			} else {
				account.setBalance(balance - amount);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
			}
		}
	}

	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				return null;
			}
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}