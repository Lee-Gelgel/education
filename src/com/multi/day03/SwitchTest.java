package com.multi.day03;

//dosâ -> java SwitchTest 10
public class SwitchTest {
	public static void ifPring(String month) {
		int mon = Integer.parseInt(month);
		String season;
		if (mon == 12 || mon == 1 || mon == 2) {
			season = "�ܿ�";
		} else if (mon >= 3 && mon <= 5) {
			season = "��";
		} else if (mon >= 6 && mon <= 8) {
			season = "����";
		} else if (mon >= 9 && mon <= 11) {
			season = "����";
		} else {
			System.out.println("1~12������ �Է�");
			return;
		}
		System.out.println("����� �¾ ������ " + season);
	}

	public static void switchPrint(String month) {
		String season;
		switch (month) {
		case "12":case "1":case "2":
			season = "�ܿ�";	break;
		case "3":case "4":case "5":
			season = "��";	break;
		case "6":case "7":case "8":
			season = "����";	break;
		case "9":case "10":case "11":
			season = "����";	break;
		default:
			System.out.println("1~12������ �Է�");
			return;
		}
		System.out.println("����� �¾ ������ " + season);
	}

	// main�� �ڹ����α׷��� ������(������ ������)
	public static void main(String[] args) {
		ifPring(args[0]);
		switchPrint(args[0]);
	}
}
