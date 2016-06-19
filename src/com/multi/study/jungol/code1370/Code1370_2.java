package com.multi.study.jungol.code1370;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//회의실이 하나 있다. 여러 회의들이 시작시간과 종료시간이 예약되어 있으며, 시간대가 겹치는 회의는 동시에 개최가 불가능하다. 
//따라서 같은 시간대에 속하는 회의들 중 하나만 개최하고 나머지 회의들은 버려야한다. 
//
//단, 종료시간과 시작시간이 같은 경우에는 시간이 겹친다고 말하지 않는다. 회의의 개수 N과 각 회의의 시작시간, 
//종료시간이 주어졌을 때 되도록 많은 회의를 개최하고자 한다.회의를 최대한 많이 배정하는 프로그램을 작성하시오.
// 
//첫줄에는 회의의 수 N(5≤N≤500), 둘째 줄부터 i-1번 회의의 번호와 시작시간과 종료시간이 차례로 주어진다. (500 이하의 정수)
//
//
//첫줄에는 배정 가능한 최대의 회의수를 출력하고 다음 줄부터는 배정한 회의의 번호를 시간대순으로 출력한다. 만약, 
//답이 여러 가지(최대회의수가 될 수 있는 배정 방법이 여러가지)라면 그 중 아무거나 하나 출력한다.
//
//[입력]
//6
//1 1 10
//2 5 6
//3 13 15
//4 14 17
//5 8 14
//6 3 12
//[출력]
//3
//2 5 4

public class Code1370_2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/com/multi/study/jungol/code1370/Code1370.txt"));
		Scanner scanner = new Scanner(System.in);
		// 회의 정보 입력
		insertArr(scanner);
		// 회의 정보 정렬
		sortST(meetingReservation);
		// 회의 정보 출력
		//printArr(meetingReservation);
		// 배정 결과
		compareTime(meetingReservation);
	}

	static String meetingCnt; // 배정 가능한 회의 수
	static String[] meetingSchedule; // 배정한 회의의 번호 배열
	static int[][] meetingReservation; // 예약된 회의의 배열;

	// 회의 정보 입력
	public static void insertArr(Scanner scanner) {
		// meetingReservationCnt = 예약된 회의 수
		int meetingReservationCnt = Integer.parseInt(scanner.nextLine());
		// 배열 생성
		meetingReservation = new int[meetingReservationCnt][3];
		while (scanner.hasNext()) {
			// 회의정보 입력하는 반복문
			for (int i = 0; i < meetingReservation.length; i++) {
				// 회의 정보의 각 항목을 나눔(회의번호, 시작시간, 종료시간)
				String[] str = scanner.nextLine().split(" ");
				for (int j = 0; j < meetingReservation[i].length; j++) {
					meetingReservation[i][j] = Integer.parseInt(str[j]);
				}
			}
		}
	}

	// 회의 정보 시작시간 오름차순 정렬
	public static void sortST(int[][] meetingReservation) {
		// 임시저장 배열
		int[] arrTemp = new int[3];

		// 시작시간 오름차순 정렬
		for (int i = 0; i < meetingReservation.length - 1; i++) {
			for (int j = 0; j < meetingReservation.length - 1; j++) {

				// 앞배열 시작시간이 뒷배열 시작시간보다 클때 정렬
				if (meetingReservation[j][1] > meetingReservation[j + 1][1]) {
					for (int k = 0; k < meetingReservation[j].length; k++) {
						arrTemp[k] = meetingReservation[j][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j][k] = meetingReservation[j + 1][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j + 1][k] = arrTemp[k];
					}
				}

				// 시작시간이 같을때 종료시간 오름차순 정렬
				if (meetingReservation[j][1] == meetingReservation[j + 1][1]
						&& meetingReservation[j][2] > meetingReservation[j + 1][2]) {
					for (int k = 0; k < meetingReservation[j].length; k++) {
						arrTemp[k] = meetingReservation[j][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j][k] = meetingReservation[j + 1][k];
					}
					for (int k = 0; k < meetingReservation[j].length; k++) {
						meetingReservation[j + 1][k] = arrTemp[k];
					}
				}
			}
		}

	}

	// 회의 정보 출력
	public static void printArr(int[][] meetingReservation) {
		for (int i = 0; i < meetingReservation.length; i++) {
			for (int j = 0; j < meetingReservation[i].length; j++) {
				System.out.print(meetingReservation[i][j] + " ");
			}
			System.out.println();
		}
	}

	// 다음 회의들 중 (시작시간이 먼저 배정한 회의 종료시간보다 같거나 크고, 종료시간이 가장 낮은) 회의를 배정
	public static void compareTime(int[][] meetingReservation) {
		//System.out.println();
		int maxNum = 0;
		int maxCount = 0;
		int count = 0;
		for (int k = 0; k < meetingReservation.length; k++) {
			//System.out.println();
			count = 0;
			for (int i = k; i < meetingReservation.length; i++) {
				count++;
				//System.out.println(i + ", " + meetingReservation[i][0]);
				int minTime = 500;
				int minNum = meetingReservation.length;
				for (int j = i + 1; j < meetingReservation.length; j++) {
					if (meetingReservation[j][1] >= meetingReservation[i][2] && minTime > meetingReservation[j][2]) {
						minTime = meetingReservation[j][2];
						minNum = j;
					}
				}
				i = minNum - 1;
			}
			//System.out.println(count + ", " + k + "!!");

			if (maxCount < count) {
				maxCount = count;
				//System.out.println("!!" + maxCount);
				maxNum = k;
			}
		}
		//System.out.println(maxNum);
		count = 0;
		ArrayList<Integer> resultArr = new ArrayList<>();
		for (int i = maxNum; i < meetingReservation.length; i++) {
			count++;
			resultArr.add(meetingReservation[i][0]);
			int minTime=500;
			int minNum = meetingReservation.length;
			for (int j = 0; j < meetingReservation.length; j++) {
				if (meetingReservation[j][1] >= meetingReservation[i][2] && minTime > meetingReservation[j][2]) {
					minTime = meetingReservation[j][2];
					minNum = j;
				}
			}
			i = minNum - 1;
		}
		System.out.println(count);
		for(Integer integer : resultArr){
			System.out.print(integer+" ");
		}
	}

}
