package Exercise;

import java.util.Scanner;

public class Exercise_Logical_2_ {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 문자를 입력해주세요 : a
		// 문자 출력 : a
		// 영어 대문자인가? : false
	
	System.out.print("문자를 입력해주세요: ");
	Scanner sc = new Scanner(System.in);
	String userInput = sc.next();
	char firstChar = userInput.charAt(0);
	// 입력받은 문자가 대문자인지 여부 확인
	boolean isLowerCase = Character.isLowerCase(firstChar);
	
	System.out.println("영어 소문자인가? " + isLowerCase);
			
	}
}


//--  ver.2

public class Exercise_Logical_2_ {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 문자를 입력해주세요 : a
		// 문자 출력 : a
		// 영어 대문자인가? : false
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자를 입력해주세요: ");
	// 입력 받은 문자열 중 첫번째 문자를 잘라서 word에 저장
	char word = sc.next().charAt(0);	
	
	System.out.println("문자 출력 : " + word);
	boolean result = (word >= 'A') && (word <= 'Z');
	
	System.out.println("영어 대문자 확인 : " + result);
			
	}
}