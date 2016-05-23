package com.multi.day05;

//Singleton �������
public class MyService {
	// 1.�������
	private static MyService myService;

	static {
		myService = new MyService();
	}

	// 2.������
	// �ܺ����ٺҰ�
	private MyService() {
		System.out.println("MyService create.");
	}
	//�ܺ����ٰ���
	public static MyService getInstance(){
		return myService;
	}
	// //1.�������
	// String name;
	// private static MyService myService = new MyService();
	// //2.������
	// private MyService(){
	// //�ʱ�ȭ
	// }
	// //3.�޼���
	// public MyService getInstance(){
	// return myService
	// }
}
