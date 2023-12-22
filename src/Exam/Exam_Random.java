package Exam;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random {
	public static void main(String [] args) {
//		Random rand = new Random();
		// 0부터 n-1까지의 랜덤한 수 리턴
		// +1 먹이면 됨.
		// 0부터 10사이의 랜덤한수 출력
//		System.out.println(rand.nextInt(10)+1);
		
		// 25부터 35사이의 랜덤한 수 출력
//		System.out.println(rand.nextInt(11)+25);
		
		
//		===== 동전 앞 뒤 맞추기 ======
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요(1.앞면 / 2.뒷면)");
		
		int input01 = sc.nextInt();
		int randResult = rand.nextInt(2) + 1; // 1 또는 2 중 랜덤으로 출력
		
		System.out.println("동전 결과: " + randResult);
		
		if (input01 == randResult) {
			System.out.println("맞췄습니다!");			
		}
		if (input01 != randResult) {
		System.out.println("틀렸습니다");
		}
		if (input01 != 1 && input01 != 2) {
		System.out.println("1 또는 2를 입력해주세요.");
		}
		
		
		
		
		
		
	}
}



