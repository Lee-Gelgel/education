package com.multi.day13;

class MyClass implements MyfunctionalInterface{

	@Override
	public String method(int su) {
		int sum = 0;
		for (int i = 0; i <= su; i++) {
			sum+=i;
		}
		System.out.println("MyClass"+sum);
		return "방법1결과"+sum;
	}
	
}


public class LambdaExample {
	public static void main(String[] args) {
		// 1. Class에 Interface구현
		MyClass mc = new MyClass();
		String a = mc.method(5);
		System.out.println(a);
		
		
		// 2. Interface 익명객체구현
		MyfunctionalInterface mfi = new MyfunctionalInterface() {
			@Override
			public String method(int su) {
				int sum = 0;
				for (int i = 0; i <= su; i++) {
					sum+=i;
				}
				System.out.println("MyfunctionalInterface"+sum);
				return "방법2결과"+sum;
			}
		};
		String b = mfi.method(10);
		System.out.println(b);
		
		
		// 3. 람다식 (함수적 인터페이스) 구현
		MyfunctionalInterface mfi2 = su ->{
			int sum = 0;
			for (int i = 0; i <= su; i++) {
				sum+=i;
			}
			System.out.println("MyfunctionalInterface2"+sum);
			return "방법3결과"+sum;
		};
		
		String c = mfi2.method(100);
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		// Thread에 등록할 작업
		Runnable job1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnalbe익명객체");
			}
		};

		Runnable job2 = () -> {
			System.out.println("Runnable익명객체");
		};
	}
}
