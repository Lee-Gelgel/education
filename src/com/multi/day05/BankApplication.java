package com.multi.day05;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("------------------------------------");
			System.out.print("선택>");

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
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void crateAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		int index = 0;
		boolean run = true;
		while (run) {
			if (accountArray[index] == null) {
				accountArray[index] = new Account(ano, owner, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				run = false;
			} else {
				if (accountArray[index].getAno().equals(ano)) {
					System.out.println("결과: 이미 존재하는 계좌입니다.");
					return;
				}
				index++;
			}
		}
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
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

	// 예금하기
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("입금액:");
		int amount = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 존재하지 않는 계좌입니다.");
		} else {
			int balance = account.getBalance();
			account.setBalance(balance + amount);
			System.out.println("결과: 예금이 성공되었습니다.");
		}

	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("출금액:");
		int amount = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 존재하지 않는 계좌입니다.");
		} else {
			int balance = account.getBalance();
			if (balance < amount) {
				System.out.println("결과: 잔고가 부족합니다.");
			} else {
				account.setBalance(balance - amount);
				System.out.println("결과: 출금이 성공되었습니다.");
			}
		}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
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
