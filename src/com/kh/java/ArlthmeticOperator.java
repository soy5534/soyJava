package com.kh.java;

import java.util.Scanner;

public class ArlthmeticOperator {
	// 초 단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지 출력하는 프로그램을 작성하여라
	public static void main(String [] argus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int time = sc.nextInt();
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60; // time 나누기 60
		int second = time % 60;
		System.out.println(time + "초는 " + hour + "시간, " + minute + "분, " + second +"초 입니다.");
		// 정수를 입력하세요 : 5000
		// 5000초는 1시간, 23분, 20초입니다.
		// 3500초 / 60 -> 60분 / 60 -> 1시간
		// 4000초 / 60 -> 66분 %(나머지) -> 6분
	}
}
