package com.multi.day09;

class CellPhone {
    // 필드
    String model; // 핸드폰 모델 번호
    double battery; // 남은 배터리 양
 
    // 생성자
    public CellPhone(String model) { // 모델 번호를 인자로 받는 생성자
        super();
        this.model = model;
    }
 
    // 함수
    void call(int time) throws IllegalArgumentException {
        if (time < 0)
            throw new IllegalArgumentException("통화시간입력오류");
        System.out.println("통화 시간 : " + time + "분");
        if (battery < time * 0.5) {
            battery = 0;
        } else {
            battery -= time * 0.5;
        }
    }
 
    void charge(int time) {
    	try{
    		if (time < 0)
    			throw new IllegalArgumentException("충전시간입력오류");
    		System.out.println("충전 시간 : " + time + "분");
    		battery += time * 3;
    		if (battery >= 100) {
    			battery = 100;
    		}
    	} catch (IllegalArgumentException e){
    		System.out.println(e.getMessage());
    	}
 
    }
 
    void printBattery() {
        System.out.println("남은 배터리 양 : " + battery);
    }
 
    public boolean equals(Object otherObject) {
        if (otherObject instanceof CellPhone) {
            CellPhone cp = (CellPhone) otherObject;
            if (model.equals(cp.model)) {
                return true;
            }
        }
        return false;
    }
}

 

// <<CellPhoneMain 실행결과>>
// 충전 시간 : 20분
// 남은 배터리 양 : 60.0
// 통화 시간 : 300분
// 남은 배터리 양 : 0.0
// 충전 시간 : 50분
// 남은 배터리 양 : 100.0
// 통화 시간 : 40분
// 남은 배터리 양 : 80.0
// 통화시간입력오류
// 동일 모델입니다.

public class CellPhoneMain {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone("SCH-600");

		myPhone.charge(-20); // 20분간 충전을 한다.
		myPhone.printBattery();

		myPhone.call(300); // 300분간 통화를 한다.
		myPhone.printBattery();

		myPhone.charge(50); // 50분간 충전을 한다.
		myPhone.printBattery();

		myPhone.call(40); // 40분간 통화를 한다.
		myPhone.printBattery();

		try {
			myPhone.call(-20); // 통화시간이 잘못 입력되었다.
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		CellPhone yourPhone = new CellPhone("SCH-600");

		if (myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		}
	}

}
