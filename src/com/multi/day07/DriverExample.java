package com.multi.day07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		driver.driv(bus);
		driver.driv(texi);
		
		//Ÿ��(Ŭ����)�� �����ϴ� ������ �Լ��� ���δ�.
		//������ Ÿ��(Ŭ����)�� ������
		//�Լ��� ��ü(�ν��Ͻ�)�� ������
	}
}
