package com.multi.day10;

import java.util.Arrays;

public class Member implements Cloneable {
	String id;
	int[] scores;
	Car car;
	public Member(String id, int[] scores,Car car) {
		this.id = id;
		this.scores = scores;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Member¡§∫∏ [id=" + id + ", scores=" + Arrays.toString(scores) + ", car=" + car + "]";
	}




	@Override
	public boolean equals(Object obj) {

		return obj instanceof Member && id.equals(((Member) obj).id);

	}

	@Override
	public int hashCode() {

		return id.hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member)super.clone();
		cloned.scores = Arrays.copyOf(scores, scores.length);
		cloned.car = new Car(car.model,car.price);
		return cloned;
	}

	Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}

}
