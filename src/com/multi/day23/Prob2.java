package com.multi.day23;

public class Prob2 {
	public static void main(String[] args) {
		int[] rottoNums = rottoGenerator();
		System.out.println("<< 생성된 ROTTO 번호 >>");
		for (int i = 0; i < rottoNums.length; i++) {
			System.out.println(rottoNums[i]);
		}
	}
	
	

	private static int[] rottoGenerator() {
		
		// 구현하세요.	
		// 1~45숫자 6개 중복허용안함
				int[] num = new int[6];
				int cnt = num.length;
				aa: for (int i = 0; i < cnt; i++) {
					if (i == 0) {
						num[i] = (int) (Math.random() * 45 + 1);
					} else {
						int number = (int) (Math.random() * 45 + 1);
						// 중복비교
						for (int j = 0; j < i; j++) {
							// 중복일때
							if (number == num[j]) {
								--i;
								continue aa;
							} else {
								// 중복아닐때
								num[i] = number;
							}
						}
					}
				}
				// 버블정렬(오름차순)
				int temp;
				for (int j = 0; j < cnt - 1; j++) {
					for (int i = 0; i < cnt - 1; i++) {
						if (num[i] > num[i + 1]) {
							temp = num[i + 1];
							num[i + 1] = num[i];
							num[i] = temp;
							temp = 0;
						}
					}
				}
		
		return num;
	}
}


//<< 제약조건 >>
//정렬로직을 구현할 때 java.util.Arrays 클래스의 sort() 메쏘드를 사용하지 말고 순수하게 정렬 알고리즘을 구현해야 한다. 
//
//
//<< 주의사항 >>
//1. 제공되는 prob2 패키지의 Prob2.java main() 메쏘드는 수정하지 않고 실행한다.
//2. 문제에서 제공되는 rottoGenerator() 메쏘드 시그니쳐는 절대 수정해서는 안된다. 
//3. 제출할 정답 파일은 Prob2.java 파일이다.
