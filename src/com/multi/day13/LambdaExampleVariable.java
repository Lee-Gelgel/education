package com.multi.day13;

class OutterClass {
	int outterVar = 10;

	class InnerClass {
		int innerVar = 20;

		void method() {
			int localVar = 30;
			
			LambdaFunctonalInterface a = (start, end) -> {
				System.out.println(start+end);
				System.out.println(outterVar+innerVar+localVar);
				return start+end+outterVar+innerVar+localVar;
			};
			int result = a.sum(3, 5);
			System.out.println("ÇÕ°è´Â "+result);
		}
	}
}

public class LambdaExampleVariable {
	public static void main(String[] args) {
		OutterClass outter = new OutterClass();
		OutterClass.InnerClass inner = outter.new InnerClass();
		inner.method();
	}
}
