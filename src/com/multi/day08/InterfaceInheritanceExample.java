package com.multi.day08;

interface Parent1{
	public void print();
}

interface Parent2{
	public void print2();
}

interface ChildInterface extends Parent1, Parent2{
	public void print3();
}


class MyClass implements ChildInterface{

	@Override
	public void print() {
		System.out.println("Parnet1 print method");
	}

	@Override
	public void print2() {
		System.out.println("Parnet2 print2 method");		
	}

	@Override
	public void print3() {
		System.out.println("ChildInterface print3 method");		
	}
	
}


public class InterfaceInheritanceExample {
	public static void main(String[] args) {
		MyClass a = new MyClass();
		ChildInterface b = new MyClass();
		Parent1 c = new MyClass();
		Parent2 d = new MyClass();
		
//		a.print();
//		a.print2();
//		a.print3();

//		b.print();
//		b.print2();
//		b.print3();
		
		c.print();
		((MyClass)c).print2();
		((MyClass)c).print3();
		
		d.print2();
		((ChildInterface)d).print2();
		((ChildInterface)d).print3();
	}
}
