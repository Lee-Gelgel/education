package com.multi.day03;

public class CommandTest {
	//함수정의시에서 형식매개변수를 사용한다.
	public static void compute(int su1, int su2){
		System.out.println(su1+"+"+su2+"="+su1+su2);
		System.out.println(su1+"-"+su2+"="+(su1-su2));
		System.out.println(su1+"*"+su2+"="+su1*su2);
		System.out.println(su1+"/"+su2+"="+su1/su2);
		System.out.println(su1+"%"+su2+"="+su1%su2);
	}
	
	// 명령행 매개변수로 입력된 두수의 사칙연산결과 출력
	public static void main(String[] args) {
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		compute(su1, su2);
		System.out.println("==============");
		compute(10, 5);
	}
}
