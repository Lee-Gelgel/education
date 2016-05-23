package com.multi.day06;

public class Tire {
	// �ʵ�
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accumulatedRotion; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ

	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// �޼ҵ�
	public boolean roll(){
		++accumulatedRotion; //���� ȸ���� 1����
		if(accumulatedRotion<maxRotation){
			System.out.println(location+ " Tire ����: "+ (maxRotation-accumulatedRotion)+"ȸ");
			return true;
		} else {
			System.out.println("*** "+location+" Tire ��ũ ***");
			return false;
		}
	}
}
