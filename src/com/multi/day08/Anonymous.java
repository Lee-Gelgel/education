package com.multi.day08;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("�ڵ����� �޸��ϴ�.");
		}
	};

	void method1() {

		new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		}.run();
		
		/*Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
			}
		};
		localVar.run();*/
	}

	void method2(Vehicle v) {
		v.run();
	}
}
