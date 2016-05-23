package com.multi.day07;

public enum Season {
	SPIRNG("��", 3), SUMMER("����", 6), FALL("����", 9), WINTER("�ܿ�", 12);

	private String season;
	private int month;

	private Season(String season, int month) {
		this.season = season;
		this.month = month;
	}

	public String getSeason() {
		return season;
	}

	public int getMonth() {
		return month;
	}
	
	

}
