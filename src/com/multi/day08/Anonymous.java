package com.multi.day08;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			System.out.println("자동차가 달립니다.");
		}
	};

	void method1() {

		new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		}.run();
		
		/*Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();*/
	}

	void method2(Vehicle v) {
		v.run();
	}
}
