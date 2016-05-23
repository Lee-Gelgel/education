package com.multi.day08;

//interface를 이용하기위해 구현class정의
//구현class 사용했다.
//구현class 정의하지않고 사용? 익명구현객체
//추상class와 interface는 new불가
//하지만 익명구현객체생성가능
public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
		};

		action.work();
	}
}
