package com.kh.java;

import java.util.Scanner;

public class practicepracticepractice {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 문자를 입력해주세요 : a
		// 문자 출력 : a
		// 영어 대문자인가? : false
	Scanner sc = new Scanner (System.in);
	
	System.out.print("문자를 입력하세요: ");
	String userInput = sc.next();
	char firstChar = userInput.charAt(0);
	boolean isLowerCase = Character.isLowerCase(firstChar);
	
	)
	System.out.println("영어 소문자인가? " + isLowerCase);
		
	}
}
