package com.multi.study.jungol.code1370;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("src/com/multi/study/jungol/code1370/Code1370.txt"));
		Scanner scanner = new Scanner(System.in);
		// 회의 정보 입력
		insertArr(scanner);
		// 회의 정보 정렬
		sortST(meetingReservation);
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
		// 가장 많이 배정 한 수
		int maxCount = 0;
		// 가장 많이 배정 한 수의 시작번호
		int maxNum = 0;
		// 배정 한 수
		int count = 0;
		
		// 시작번호 처음부터 끝까지 한번씩 실행하는 반복문
		for (int k = 0; k < meetingReservation.length; k++) {
			count = 0;
			// 배정 하는 반복문
			for (int i = k; i < meetingReservation.length; i++) {
				count++;
				// 종료시간 비교변수
				int minTime = 500;
				// 종료시간이 가장 낮은 회의
				int minNum = meetingReservation.length;
				// 시작시간보다 같거나 나중이고, 종료시간이 가장 빠른 회의 찾는 반복문
				for (int j = i + 1; j < meetingReservation.length; j++) {
					if (meetingReservation[j][1] >= meetingReservation[i][2] && minTime > meetingReservation[j][2]) {
						minTime = meetingReservation[j][2];
						minNum = j;
					}
				}
				i = minNum - 1;
			}
			
			// 가장 많이 배정 했을때 그 수와, 시작번호를 저장
			if (maxCount < count) {
				maxCount = count;
				maxNum = k;
			}
		}
		
		// 가장 많이 배정 했을때의 시작번호로 출력
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
