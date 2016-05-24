package com.multi.day09;

class MyObject {
	String str;
	int i;

	public MyObject(String str, int i) {
		super();
		this.str = str;
		this.i = i;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	// MyObject -> Object -> MyObject
	public boolean equals(Object obj) {
		boolean result;
	
		
		if(obj instanceof MyObject){
			//����ȯ�Ҷ��� �����ϰ� �ؾ��Ѵ�. 
			MyObject you = (MyObject)obj;
			result = (this.str.equals(you.str) && this.i==you.i);
		} else {
			result = super.equals(obj);
		}
		return result;
	}

	
	
}

public class ObjectTest {
	public static void main(String[] args) {
		Object obj1 = new MyObject("���ǰ�ü", 100);
		Object obj2 = new MyObject("���ǰ�ü", 100);

		System.out.println(obj1);
		System.out.println(obj1.toString());

		System.out.println(obj2);
		System.out.println(obj2.toString());

		System.out.println(obj1 == obj2); // �ּҺ�
		System.out.println(obj1.equals(obj2)); // �ּҺ�
		System.out.println(obj1.equals(new String("���ǰ�ü"))); // �ּҺ�

		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s2.toString());
		String s3 = "JAVA";
		s3 = s3 + "�ϼ�";
		String s4 = "JAVA";
		s4 = s4 + "�ϼ�";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	}
}
