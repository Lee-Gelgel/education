package com.multi.day07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Texi texi = new Texi();
		driver.driv(bus);
		driver.driv(texi);
		
		//타입(클래스)에 존재하는 변수와 함수만 보인다.
		//변수는 타입(클래스)을 따진다
		//함수는 객체(인스턴스)를 따진다
	}
}
