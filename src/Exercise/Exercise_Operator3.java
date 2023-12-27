package Exercise;
import java.util.Scanner;

public class Exercise_Operator3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		//안내메세지 출력(사용자입력 Y / N )
		System.out.print("정수를 입력하세요.");
		int inputVal = sc.nextInt();
		
		if(inputVal % 2 == 0) {
			System.out.println("짝수입니다.");			
		}else {
			System.out.println("홀수입니다.");
		}
	
		sc.close();
		
	}
	
}
