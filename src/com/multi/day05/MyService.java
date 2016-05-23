package com.multi.day05;

//Singleton 구현방법
public class MyService {
	// 1.멤버변수
	private static MyService myService;

	static {
		myService = new MyService();
	}

	// 2.생성자
	// 외부접근불가
	private MyService() {
		System.out.println("MyService create.");
	}
	//외부접근가능
	public static MyService getInstance(){
		return myService;
	}
	// //1.멤버변수
	// String name;
	// private static MyService myService = new MyService();
	// //2.생성자
	// private MyService(){
	// //초기화
	// }
	// //3.메서드
	// public MyService getInstance(){
	// return myService
	// }
}
