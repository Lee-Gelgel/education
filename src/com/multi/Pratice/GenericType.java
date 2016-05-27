package com.multi.Pratice;
class SingleGenericType<Type> {
	private Type type;

	public Type get() {
		return type;
	}

	public void set(Type type) {
		this.type = type;
	}
}

class DoubleGenericType<Type, Type2>{
	private Type type;
	private Type2 type2;
	Type getType(){
		return type;
	}
	Type2 getType2(){
		return type2;
	}
	void set(Type type, Type2 type2) {
		this.type = type;
		this.type2 = type2;
	}
	
}

public class GenericType {
	public static void main(String args[]) {
		singleGenericType();
		doubleGenericType();

	}
	
	static void singleGenericType(){
		SingleGenericType<String> sgt = new SingleGenericType<>();
		sgt.set("SingleGenericType");
		System.out.println(sgt.get());
	}
	
	static void doubleGenericType(){
		DoubleGenericType<String,Integer> dgt = new DoubleGenericType<>();
		dgt.set("DoubleGenericType", 2);
		System.out.println(dgt.getType()+", "+dgt.getType2());
		
		DoubleGenericType<Integer,String> dgt2 = new DoubleGenericType<>();
		dgt2.set(2, "DoubleGenericType");
		System.out.println(dgt2.getType()+", "+dgt2.getType2());
	}
}
