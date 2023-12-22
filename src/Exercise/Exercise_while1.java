package Exercise;

import java.util.Scanner;

public class Exercise_while1 {
	public static void main(String [] args) {
//		 While문을 이용하여 -1이 입력될때까지 정수를 입력받고
//		 -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = 0;
		
		// -1이 입력되기 전까지 계속 입력을 받고 합을 계산
		while( input != -1) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			
			if (input != -1) {
				sum += input;
			}				
		}
		
		// 합을 출력
		System.out.println("입력한 수의 합: " + sum);
		
		// Scanner 닫기
		sc.close();

		

      //풀이 2.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i = 0;
//		int sum = 0;
//		
//		while( i < 10) {
//			System.out.print("정수 입력 : ");
//			int input = sc.nextInt();
//			if(input == -1) break;
//			sum = sum + input;
//			i++;			
//		}
//		
//		System.out.println("입력하신 수의 값은 " + sum + " 입니다.");
		
		
		
		
		
		
		
		
		

		
	}
}
