package com.multi.day04;

//.java(�ڹټҽ�)�� class�� ������ �ü��ִ�.
//public class�� �ϳ��� �����Ѵ�.
//public�� ���������ִ�.
//main�� �ִ� class�� .java�̸��� �ش�.
public class ParkingManage {
	public static void main(String[] args) {
		// 1.��ü������������
		Car car1;
		// 2.��ü����
		car1 = new Car();
		// 3.��ü���
		car1.model = "�ҳ�Ÿ";
		car1.color = "black";
		car1.maxSpeed = 200;
		car1.print();

		// java.lang��Ű���� class import����
		String str1 = new String("�ڹ�");
		String str2 = new String();
		char[] ch = { 'J', 'A', 'V', 'A' };
		String str3 = new String(ch);
		System.out.println(str3);
		byte[] by = { 65, 66, 67, 68, 69 };
		String str4 = new String(by);
		System.out.println(str4);

	}
}
