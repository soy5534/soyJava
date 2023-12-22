package Exam;

import java.util.Scanner;

public class Exam_PrintSample {
	public static void main(String [] args) {
		System.out.println("우리가 지금까지 쓰던 출력 메소드");
		System.out.print("가이드 메시지를 출력할 때 쓰던 메소드\n");
		// ★둘의 차이는? 개행(줄바꿈)이 되는가 안 되는가의 차이
		// 'ln'이 줄바꿈 가능의 역할을 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가이드 메시지를 출력할 때 쓰던 메소드\n");
		//sc.next();
		
		// ★★ \n = 개행
		
		// printf() 메소드
		int num = 11;
		System.out.printf("정수 출력 : %d\n", num); // \n = 개행
		System.out.printf("실수 출력 : %.2f\n", 1.11);
		
		System.out.printf("문자열 출력 : %s\n", "소수정예F클래스");
		
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강 %b입니다."
				, 'F', "공공데이터 개발자과정", 11.13, 4.25, true);
		// F반 공공데이터 개발자과정, 11.13, 4.25 true입니다.
	}
}
