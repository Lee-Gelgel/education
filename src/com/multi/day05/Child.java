package com.multi.day05;

import com.multi.day06.Parent;

class Child extends Parent {
	String phoneNumber;

	Child(String name, String phoneNumber) {
		// �������� 1��° �ٿ� super()�� ������
		// 1.����class�� default�����ڰ� �־���Ѵ�
		// 2.��������� ����class�� ������ȣ��
		super(name);
		this.age = 28;
		this.phoneNumber = phoneNumber;
	}
}
