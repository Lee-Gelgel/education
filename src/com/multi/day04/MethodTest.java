package com.multi.day04;

public class MethodTest {
	
	public int sum(int a, int b){
		int c = a + b;
		return c;
	}
	/* DOS > java MethodTest
	 * 1) class load.....static����,�Լ�,���� �޸𸮿� load
	 * static������ non-static���Ұ�
	 * 2)
	 */
	
	public static void main(String[] args) {
		System.out.println("�Լ�ȣ��");
		MethodTest test = new MethodTest();
		int result = test.sum(10,20);
		System.out.println("�հ� ���"+result);
		
		Car c1 = new Car();
		c1.print();
		
		c1.print("Car�� �����Դϴ�.");
		int speed = c1.print(100);
		System.out.println("������ speed : "+speed);
	}
}
