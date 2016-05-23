package com.multi.day07;

public enum Season {
	SPIRNG("봄", 3), SUMMER("여름", 6), FALL("가을", 9), WINTER("겨울", 12);

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
