package com.multi.day13;

public class Fruit {
	private String name;
	private int count;
	private String origin;

	public Fruit(String name, int count, String origin) {
		super();
		this.name = name;
		this.count = count;
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", count=" + count + ", origin=" + origin + "]";
	}
	
	
}
