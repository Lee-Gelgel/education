package com.multi.day06;

class Child extends Parent {
	String phoneNumber;

	Child(String name, String phoneNumber) {
		// �������� 1��° �ٿ� super()�� ������
		// 1.����class�� default�����ڰ� �־���Ѵ�
		// 2.��������� ����class�� ������ȣ��
		super(name);
		this.phoneNumber = phoneNumber;
	}
}
