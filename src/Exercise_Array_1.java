import java.util.Random;
import java.util.Scanner;

public class Exercise_Array_1 {
	public static void main(String []args) {		
		
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는
		// 프로그램을 작성하시오.	
		Scanner sc = new Scanner(System.in); // 입력받기(Scanner객체 생성.)
		Random rd = new Random(); // 그냥 복습해봄.(Random객체 생성.)
		
		// 배열 선언 및 초기화
		int nums [] = new int [5];
		int max = 0;
		
		// 사용자로부터 양수 5개 입력받기
		for(int i = 0; i < nums.length; i++) {
			System.out.print("정수 입력 ("+(i+1)+") : ");
			nums[i] = sc.nextInt();
			
			// 입력한 값이 제일 큰가?
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		// 제일 큰 수 출력
		System.out.println("가장 큰 수는 " + max + "입니다."); // 가이드메세지 출력(사용자입력 X)
		
		// Scanner 닫기
		sc.close();
		
	}
}
