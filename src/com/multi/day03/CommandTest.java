package com.multi.day03;

public class CommandTest {
	//�Լ����ǽÿ��� ���ĸŰ������� ����Ѵ�.
	public static void compute(int su1, int su2){
		System.out.println(su1+"+"+su2+"="+su1+su2);
		System.out.println(su1+"-"+su2+"="+(su1-su2));
		System.out.println(su1+"*"+su2+"="+su1*su2);
		System.out.println(su1+"/"+su2+"="+su1/su2);
		System.out.println(su1+"%"+su2+"="+su1%su2);
	}
	
	// ����� �Ű������� �Էµ� �μ��� ��Ģ������ ���
	public static void main(String[] args) {
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		compute(su1, su2);
		System.out.println("==============");
		compute(10, 5);
	}
}
