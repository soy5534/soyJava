import java.util.Scanner;

public class Exercise_Loop1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 
		// 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"
		// 를 출력하세요.
				
		// 안내메세지 출력 (사용자 입력가능 Y / N )
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
				
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			sc.close();
			return;
		}
		
		// 1부터 입력한 숫자까지의 숫자 출력
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " ");
		}
		
		sc.close();
		
	}
}
