package com.multi.day06;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("gelgel", "blue", 0505);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("model : "+dmbCellPhone.model);
		System.out.println("color : "+dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("channel : "+dmbCellPhone.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoices("Hello");
		dmbCellPhone.receiveVoices("Who are you?");
		dmbCellPhone.sendVoices("I'm gelgel");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(20100505);
		dmbCellPhone.turnOffDmb();
	}
}
