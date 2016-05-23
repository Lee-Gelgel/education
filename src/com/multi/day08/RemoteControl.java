package com.multi.day08;

public interface RemoteControl {

	// 7버전...상수
	int MAX_VALUE = 100;
	public static final int MAX_VALUE2 = 200;
	
	// 7버전...추상메서드 (컴파일시 public abstract 붙는다)
	void turnOn();
	public abstract void turnOff();
	void setVolum(int volum);
	
	
	// 8버전...default메서드
	public default void print(){
		System.out.println("default 메서드 print");
	}
//	public default void setVolum(){
//		System.out.println(this.getClass().getSimpleName()+" set volum");
//	}

	// 8버전...static메서드
	public static void print2(){
		System.out.println("static 메서드 print2");
	}
	
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");		
	}
}
