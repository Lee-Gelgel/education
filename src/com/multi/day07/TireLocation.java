package com.multi.day07;

public enum TireLocation {
	FRONT_LEFT("앞왼쪽"), FRONT_RIGHT("앞오른쪽"), BACK_LEFT("뒤왼쪽"), BACK_RIGHT("뒤오른쪽"), NONE("없음");
	
	private String name;

	private TireLocation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	
}
