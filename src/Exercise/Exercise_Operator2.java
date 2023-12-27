package Exercise;
import java.util.Scanner;

public class Exercise_Operator2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); 
		// 문제2.
		// 키보드로 입력받은 하나의 정수가 양수면 양수다
		// 양수가 아닌 경우 중에서 0이면 0이다.
		// 0이 아니면 음수다를 출력하세요
		// ex. 정수 : -9
		
		//가이드메세지(사용자입력 O)
		System.out.print("숫자를 입력하세요 : ");
		int inputVal = sc.nextInt();
		
		if(inputVal < 0) {
			System.out.println("음수입니다.");
		}else if(inputVal == 0){
			System.out.println("0이다.");
		}else {
			System.out.println("양수입니다.");
		}
		
		sc.close();
			
		
	}
}
