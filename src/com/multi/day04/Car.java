package com.multi.day04;

//public ��� ��Ű������ ��밡��
public class Car {
	// 1.�������(Ư¡)
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	static int carCount; // �ڵ����� ������

	// 2.������ -> new�� �ڵ����� ȣ��Ǵ� �Լ�
	// default �����ڰ� �����ȴ� => public Car(){} //(�Ű������� ����)
	// �����ڰ� �߰��Ǹ� default�����ڰ� ���ŵȴ�
	// �������� Overloading�����ϴ�
	// Overloading=>�̸��� ������ �Ű����� ����� �ٸ���
	//this: ���簴ä(new)�� �ǹ��Ѵ�
	//1)
	//2)
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, String color) {
		this(model, color, 120);
	}

	public Car(String model) {
		this(model, "Red", 120);
	}

	public Car() {
		this("SM7", "Red", 120);
	}

	// 3.�Ϲ��Լ�...�����ε��� �����ϴ�
	public void print() {
		System.out.println(model + ", " + color + ", " + maxSpeed);
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}

	//public : ��� ��Ű������ ���ٰ���
	public int print(int speed) {
		
		changeSpeed(speed);
		return maxSpeed;
	}
	
	//private : �� Ŭ������������ ������ �����ϴ�
	private void changeSpeed(int speed){
		if(speed==0) return;
		System.out.println("Speed����˴ϴ�.");
		maxSpeed = maxSpeed + speed;
	}
}
