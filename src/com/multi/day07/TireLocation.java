package com.multi.day07;

public enum TireLocation {
	FRONT_LEFT("�տ���"), FRONT_RIGHT("�տ�����"), BACK_LEFT("�ڿ���"), BACK_RIGHT("�ڿ�����"), NONE("����");
	
	private String name;

	private TireLocation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
}
