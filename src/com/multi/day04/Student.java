package com.multi.day04;

import java.util.Arrays;

//DTO(Data Transfer Object)
//VO(Value Object)
//JavaBeans
//POJO(Plain Old Java Object)
public class Student {
	//멤버변수
	private String stdId;
	private String name;
	private String major;
	private int[] scores;
	
	//생성자
	public Student(String stdId, String name, String major, int[] scores) {
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.scores = scores;
	}
	
	//Getter Setter
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	//메서드
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", major=" + major + ", scores=" + Arrays.toString(scores)
				+ "]";
	}
	
	public int totalScore(){
		int totalScore=0;
		for(int i=0;i<scores.length;i++){
			totalScore += scores[i];
		}
		return totalScore;
	}


	
	
}
