package com.multi.day13;

class MyClass implements MyfunctionalInterface{

	@Override
	public String method(int su) {
		int sum = 0;
		for (int i = 0; i <= su; i++) {
			sum+=i;
		}
		System.out.println("MyClass"+sum);
		return "���1���"+sum;
	}
	
}


public class LambdaExample {
	public static void main(String[] args) {
		// 1. Class�� Interface����
		MyClass mc = new MyClass();
		String a = mc.method(5);
		System.out.println(a);
		
		
		// 2. Interface �͸�ü����
		MyfunctionalInterface mfi = new MyfunctionalInterface() {
			@Override
			public String method(int su) {
				int sum = 0;
				for (int i = 0; i <= su; i++) {
					sum+=i;
				}
				System.out.println("MyfunctionalInterface"+sum);
				return "���2���"+sum;
			}
		};
		String b = mfi.method(10);
		System.out.println(b);
		
		
		// 3. ���ٽ� (�Լ��� �������̽�) ����
		MyfunctionalInterface mfi2 = su ->{
			int sum = 0;
			for (int i = 0; i <= su; i++) {
				sum+=i;
			}
			System.out.println("MyfunctionalInterface2"+sum);
			return "���3���"+sum;
		};
		
		String c = mfi2.method(100);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		// Thread�� ����� �۾�
		Runnable job1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnalbe�͸�ü");
			}
		};

		Runnable job2 = () -> {
			System.out.println("Runnable�͸�ü");
		};
	}
}
