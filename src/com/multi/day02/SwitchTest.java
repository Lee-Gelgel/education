package com.multi.day02;

public class SwitchTest {
	public static void main(String[] args) {
		// >java SwitchTest 10
		// ����� �Ű������� ���� ���´�.
		// �������� ������ ����ϼ���.
		int month = Integer.parseInt(args[0]);
		String str = null;
		if (month <= 0 || month >= 13) {
			System.out.println("1~12 �Է�");
			// return;
			System.exit(0);
		} else {

			switch (month) {
			case 12:case 1:	case 2:
				str = "�ܿ�";
				break;
			case 3:	case 4: case 5:
				str = "��";
				break;
			case 6:	case 7:	case 8:
				str = "����";
				break;
			case 9:	case 10:case 11:
				str = "����";
			}
			System.out.println(str);
		}
	}
}
