package com.multi.day13;

@FunctionalInterface
interface LambdaFunctonalInterface {
	public int sum(int start, int end);
}

class LambdaClass implements LambdaFunctonalInterface {

	@Override
	public int sum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

}

public class LambdaExample2 {
	public static void main(String[] args) {
		LambdaClass a = new LambdaClass();
		int result1 = a.sum(1, 10);
		System.out.println("�������̽� Ŭ���� ����"+result1);
		
		LambdaFunctonalInterface b = new LambdaFunctonalInterface() {
			@Override
			public int sum(int start, int end) {
				int sum = 0;
				for (int i = start ; i <=end; i++) {
					sum+=i;
				}
				return sum;
			}
		};
		int result2 = b.sum(1, 10);
		System.out.println("�������̽� �͸�ü ����"+result2);
		
		LambdaFunctonalInterface c = (start, end)-> {
				int sum = 0;
				for (int i = start ; i <=end; i++) {
					sum+=i;
				}
				return sum;
		};
		int result3 = c.sum(1, 10);
		System.out.println("���ٽ�"+result3);
	}
	
	
	
}
