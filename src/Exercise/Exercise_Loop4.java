package Exercise;
import java.util.Scanner;

public class Exercise_Loop4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 문제1.
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면
		// *1 이상의 숫자를 입력해주세요"를 출력하세요.
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		// 두 수 중 작은 수를 min에, 큰 수를 max에 할당
		int min = (num1 > num2) ? num2 : num1;
		int max = (num1 > num2) ? num1 : num2;
		
		// 입력된 값 중 하나라도 1 미만이면 메세지 출력 후 프로그램 종료
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			sc.close(); // Scanner를 닫아줘야 합니다.
			return; // 프로그램 종료
		}
		// 입력된 값 중 하나라도 1 미만일 때 다시 입력받게 하려면?
		
		
		// min부터 max까지의 숫자 출력
		for(int i = num1; i <= num2; i++) {
			// sum = sum + i;
			// sum += i;
		
			System.out.printf("%d ", i);
					
		}
	}
}
