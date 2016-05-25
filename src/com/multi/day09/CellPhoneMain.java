package com.multi.day09;

class CellPhone {
    // �ʵ�
    String model; // �ڵ��� �� ��ȣ
    double battery; // ���� ���͸� ��
 
    // ������
    public CellPhone(String model) { // �� ��ȣ�� ���ڷ� �޴� ������
        super();
        this.model = model;
    }
 
    // �Լ�
    void call(int time) throws IllegalArgumentException {
        if (time < 0)
            throw new IllegalArgumentException("��ȭ�ð��Է¿���");
        System.out.println("��ȭ �ð� : " + time + "��");
        if (battery < time * 0.5) {
            battery = 0;
        } else {
            battery -= time * 0.5;
        }
    }
 
    void charge(int time) {
    	try{
    		if (time < 0)
    			throw new IllegalArgumentException("�����ð��Է¿���");
    		System.out.println("���� �ð� : " + time + "��");
    		battery += time * 3;
    		if (battery >= 100) {
    			battery = 100;
    		}
    	} catch (IllegalArgumentException e){
    		System.out.println(e.getMessage());
    	}
 
    }
 
    void printBattery() {
        System.out.println("���� ���͸� �� : " + battery);
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

 

// <<CellPhoneMain ������>>
// ���� �ð� : 20��
// ���� ���͸� �� : 60.0
// ��ȭ �ð� : 300��
// ���� ���͸� �� : 0.0
// ���� �ð� : 50��
// ���� ���͸� �� : 100.0
// ��ȭ �ð� : 40��
// ���� ���͸� �� : 80.0
// ��ȭ�ð��Է¿���
// ���� ���Դϴ�.

public class CellPhoneMain {
	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone("SCH-600");

		myPhone.charge(-20); // 20�а� ������ �Ѵ�.
		myPhone.printBattery();

		myPhone.call(300); // 300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();

		myPhone.charge(50); // 50�а� ������ �Ѵ�.
		myPhone.printBattery();

		myPhone.call(40); // 40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();

		try {
			myPhone.call(-20); // ��ȭ�ð��� �߸� �ԷµǾ���.
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		CellPhone yourPhone = new CellPhone("SCH-600");

		if (myPhone.equals(yourPhone)) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
	}

}
