package com.multi.day01;

public class IfTest {
	public static void main(String args[]) {
		int score = 99;
		//���ǹ� if		
		if (score >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if(score>=80) {
			System.out.println("B�����Դϴ�.");
		} else if(score>=70){
			System.out.println("C�����Դϴ�.");
		} else if(score>=60){
			System.out.println("D�����Դϴ�.");
		} else {
			System.out.println("F�����Դϴ�.");
		}
		
		//���ǹ� switch
		switch(score/10){//�� �Ǵ� ����, �Ǽ��� �Ұ�
		case 10: //case�� ���� ����
			System.out.println("A�����Դϴ�.");
			break;
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("C�����Դϴ�.");
			break;
		case 6:
			System.out.println("D�����Դϴ�.");
			break;
		default:
			System.out.println("F�����Դϴ�.");
		}
		System.out.println("done.");
	}
}
