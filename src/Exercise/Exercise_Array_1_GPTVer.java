package Exercise;
import java.util.Random;
import java.util.Scanner;

public class Exercise_Array_1_GPTVer {
	public static void main(String []args) {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는
		// 프로그램을 작성하시오.	
		Scanner sc = new Scanner(System.in); // 입력받기(Scanner객체 생성.)
		Random rd = new Random(); // 그냥 복습해봄.(Random객체 생성.)
		
		// 배열 선언 및 초기화
		int[] nums = new int[5];
		
		// 사용자로부터 양수 5개 입력받기
		for (int i = 0; i < 5; i++) {
			System.out.print("양수를 입력하세요("+(i+1)+") : "); // 가이드메세지 입력(사용자입력 O)
			int input = sc.nextInt();
			
			//입력받은 값이 양수인지 확인
			while (input <= 0) {
				System.out.println("양수만 입력 가능합니다. 다시 입력해주세요."); // 가이드메세지 입력(사용자입력 X)
				System.out.print("양수를 입력하세요: "); // 가이드메세지 입력(사용자입력 O)
				input = sc.nextInt();
			}
			
			// 배열에 입력받은 값을 저장
			nums[i] = input;					
		}
		
		// 배열에서 제일 큰 수 찾기
		int maxNumber = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > maxNumber) {
				maxNumber = nums[i];
			}
		}
		
		// 제일 큰 수 출력
		System.out.println("제일 큰 수는: " + maxNumber);
		
		// Scanner 닫기
		sc.close();
		
	}
}
