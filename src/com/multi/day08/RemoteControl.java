package com.multi.day08;

public interface RemoteControl {

	// 7����...���
	int MAX_VALUE = 100;
	public static final int MAX_VALUE2 = 200;
	
	// 7����...�߻�޼��� (�����Ͻ� public abstract �ٴ´�)
	void turnOn();
	public abstract void turnOff();
	void setVolum(int volum);
	
	
	// 8����...default�޼���
	public default void print(){
		System.out.println("default �޼��� print");
	}
//	public default void setVolum(){
//		System.out.println(this.getClass().getSimpleName()+" set volum");
//	}

	// 8����...static�޼���
	public static void print2(){
		System.out.println("static �޼��� print2");
	}
	
	static void changeBattery(){
		System.out.println("�������� ��ȯ�մϴ�.");		
	}
}
