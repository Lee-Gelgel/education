package com.multi.day01;

public class OperatorTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		System.out.println(a + b);
		System.out.println("합계=" + a + b);// 문자 연산
		System.out.println("합계=" + (a + b));// 연산 우선순위
		System.out.println(a - b);
		// System.out.println("빼기="+a-b);//문자에서 '-'연산 안됨
		System.out.println("빼기=" + (a - b));
		System.out.println("곱하기=" + a * b);
		System.out.println("나누기=" + a / b); // 몫 ... 정수/정수 -> 정수
		System.out.println((double) a / b); // 캐스팅 실수표현
		System.out.println(1.0 * a / b); // 1.0(실수) 곱해서 실수표현
		System.out.println(a % b); // 나머지

		System.out.println("==================");
		System.out.println(a = b);// b를 a에 넣고 a를 출력
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println("======논린연산자======");
		int su1 = 10;
		int su2 = 20;

		// &&,& (and) 모두 true이면 true이다.
		System.out.println(su1 < 10 && ++su2 >= 20); //&& 단축구문, 앞에 문장이 false이면 뒤에 문장 수행안한다
		System.out.println(su2);
		System.out.println(su1 < 10 & ++su2 >= 20); //& 앞에 문장이 false이라도 뒤에 문장 수행한다
		System.out.println(su2);
		
		// System.out.println(su1>=10 & su2>=20);
		// System.out.println(su1>=10 && su2<20);
		// System.out.println(su1>=10 & su2<20);

		// ||,| (or) 하나라도 true이면 true이다.
		System.out.println(su1==10 || ++su2 >=20);// || 단축구문, 앞에 문장이 true이면 뒤에 문장 수행안한다.
		System.out.println(su2);
		System.out.println(su1==10 | ++su2 >=20);// | 앞에 문장이 true이라도, 뒤에 문장 수행한다.
		System.out.println(su2);
		
		String str = null; //null은 정해지지 않았다.
		System.out.println(str);
		System.out.println(str!=null && str.length()>0);
		//System.out.println(str!=null & str.length()>0); // error
		System.out.println(str==null||str.length()>0);

		//비트연산자
		System.out.println(3 & 4);
		
		//대입연산자
		short score = 100;
		score++;
		++score;
		score += 1; //복합대입연산자는 자동 cast
		score = (short)(score+1); // 강제형변환 필요
		System.out.println(score);
		
		//조건문
		if(score>100){
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		//삼항연산자
		System.out.println(score>100?"pass":"fail");
		
		String grade;
		grade = score>100?"A":"B";
		System.out.println(grade+"학점입니다");
	}
	
}
