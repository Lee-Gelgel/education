package com.multi.day04;

public class MethodTest {
	
	public int sum(int a, int b){
		int c = a + b;
		return c;
	}
	/* DOS > java MethodTest
	 * 1) class load.....static변수,함수,블럭이 메모리에 load
	 * static곳에서 non-static사용불가
	 * 2)
	 */
	
	public static void main(String[] args) {
		System.out.println("함수호출");
		MethodTest test = new MethodTest();
		int result = test.sum(10,20);
		System.out.println("합계 결과"+result);
		
		Car c1 = new Car();
		c1.print();
		
		c1.print("Car의 정보입니다.");
		int speed = c1.print(100);
		System.out.println("수정된 speed : "+speed);
	}
}
