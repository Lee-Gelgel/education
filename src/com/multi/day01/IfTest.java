package com.multi.day01;

public class IfTest {
	public static void main(String args[]) {
		int score = 99;
		//조건문 if		
		if (score >= 90) {
			System.out.println("A학점입니다.");
		} else if(score>=80) {
			System.out.println("B학점입니다.");
		} else if(score>=70){
			System.out.println("C학점입니다.");
		} else if(score>=60){
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
		//조건문 switch
		switch(score/10){//식 또는 변수, 실수는 불가
		case 10: //case는 값만 가능
			System.out.println("A학점입니다.");
			break;
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
		}
		System.out.println("done.");
	}
}
