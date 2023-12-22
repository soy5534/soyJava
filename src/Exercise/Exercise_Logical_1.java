package Exercise;

import java.util.Scanner;

// 	ver.1

//public class Exercise_Logical_1 {
//	public static void main(String [] args) {
//		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하시오 !
//		// 1 ~ 100 사이의 숫자를 입력하세요 : 32
//		// 1부터 100사이의 숫자인가? true
//	
//	System.out.print("1부터 100 사이의 정수를 입력하세요: ");
//	Scanner sc = new Scanner(System.in);
//	int userInput = sc.nextInt();
//	//입력한 정수가 1 - 100 사이의 정수인지 확인
//	boolean isBetween1And100 = (userInput >= 1 && userInput <= 100);
//	
//	System.out.println("1부터 100 사이의 숫자인가? " + isBetween1And100);
//	}
//}

//	 ver.2

public class Exercise_Logical_1 {
	public static void main(String [] args) {
		// 입력한 정수가 1 ~ 100 사이의 숫자인지 확인하시오 !
		// 1 ~ 100 사이의 숫자를 입력하세요 : 32
		// 1부터 100사이의 숫자인가? true
	
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 100 사이의 정수를 입력하세요: ");
		int inVal = sc.nextInt();
		
		//입력한 정수가 1 - 100 사이의 정수인지 확인
		boolean result = (1 <= inVal) && (inVal <= 100);
		
		System.out.println("1부터 100 사이의 숫자인가? " + result);
		
		// Scanner 자원 해제
		sc.close();
	}
}


