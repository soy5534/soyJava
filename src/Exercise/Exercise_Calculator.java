package Exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력(+, -, *, /, %) : ");
		char operator = sc.next().charAt(0);
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		//입력된 연산자에 따라 계산 수행
		switch (operator) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '%' : result = num1 % num2; break;		
			case '/' :
				//나누기 전에 0으로 나누는지 확인
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("0으로 나눌 수 없습니다.");
					return; // 프로그램 종료
				}
				break;				
		default:
			System.out.println("올바른 연산자를 입력하세요.");
			return; // 프로그램 종료
	}
	
	// 최종 결과 출력
	System.out.println("결과값 : " + result);
	
	// Scanner 닫기
	sc.close();
		
	}
}
