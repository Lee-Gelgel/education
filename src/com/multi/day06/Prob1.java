package com.multi.day06;

//tetD

//testF(1000)

public class Prob1 {
	public static void main(String[] args) {
		Entry e1 = new Directory("tetD");
		e1.print();
		Entry e2 = new File("testF", 1000);
		e2.print();

	}

}

abstract class Entry {
	private String name;
	private int size;

	public Entry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entry(String name) {
		super();
		this.name = name;
	}

	public Entry(int size) {
		super();
		this.size = size;
	}

	public Entry(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public abstract void print();

}

class Directory extends Entry {

	public Directory(String name) {
		super(name);
	}

	@Override
	public void print() {

		System.out.println(getName());
	}

	// String str;
	//
	// Directory(String str) {
	// this.str = str;
	// }
	//
	// @Override
	// public void print() {
	// // TODO Auto-generated method stub
	// System.out.println(str);
	// }

}

class File extends Entry {

	public File(String name, int size) {
		super(name, size);
	}

	@Override
	public void print() {
		System.out.println(getName()+"("+getSize()+")");
	}
//	String str;
//	int i;
//
//	File(String str, int i) {
//		this.str = str;
//		this.i = i;
//	}
//
//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println(str + "(" + i + ")");
//	}

}
