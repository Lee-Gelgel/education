package com.multi.day06;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("gelgel", "blue", 0505);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("model : "+dmbCellPhone.model);
		System.out.println("color : "+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("channel : "+dmbCellPhone.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoices("Hello");
		dmbCellPhone.receiveVoices("Who are you?");
		dmbCellPhone.sendVoices("I'm gelgel");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(20100505);
		dmbCellPhone.turnOffDmb();
	}
}
