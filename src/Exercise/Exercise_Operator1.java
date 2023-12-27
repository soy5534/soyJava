package Exercise;
import java.util.Scanner;

public class Exercise_Operator1 {
	public static void main(String [] args) {
		// 문제1.
		// 키보드로 입력받은 하나의 정수가 양수면 양수다
		// 양수가 아니면 양수가 아니다를 출력하세요
		// ex. 정수 : -9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int inputVal = sc.nextInt();
		
		if(inputVal > 0) {
			System.out.println("양수다.");			
		}else {
			System.out.println("양수가 아니다.");
		}
				
	}
}
