package com.multi.day06;

public class KumhoTire extends Tire{
	
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	//�޼ҵ�

	@Override
	public boolean roll() {
		++accumulatedRotion; //���� ȸ���� 1����
		if(accumulatedRotion<maxRotation){
			System.out.println(location+ " KumhoTire ����: "
		+ (maxRotation-accumulatedRotion)+"ȸ");
			return true;
		} else {
			System.out.println("*** "+location+" KumhoTire ��ũ ***");
			return false;
		}
	}
	

}
