package com.multi.day10;

import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member a = new Member("blue",null,null);
		Member b = new Member("blue",null,null);
		Member c = new Member("red",null,null);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------------");
		System.out.println(a.equals(b) ? "����" : "�ٸ�");
		System.out.println(a.equals(c) ? "����" : "�ٸ�");
		System.out.println("------------------");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println("------------------");
		HashSet<String> hs = new HashSet<String>();
		hs.add("������");
		hs.add("�����");
		hs.add("�����");
		hs.add("�Ͽ���");
		for (String print : hs) {
			System.out.println(print);
		}
		System.out.println(hs.size() + "��");
		String s1 = new String("�����");
		String s2 = new String("�����");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("------------------");
		HashSet<Member> hs2 = new HashSet<Member>();
		hs2.add(a);
		hs2.add(b);
		hs2.add(c);
		for (Member print : hs2) {
			System.out.println(print.id);
		}
		System.out.println(hs2.size() + "��");
	}
}
