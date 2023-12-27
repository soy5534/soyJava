package Exercise;
import java.util.Scanner;

public class Exercise_Operator5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// 키보드로 입력 받은 값들을 변수에 기록하고 
		// 저장된 변수값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력처리 하세요.
		
		System.out.println("성별을 입력하세요 : M / F ");
		// Char(x) char(o) 주의.
		char gender = sc.next().charAt(0);
		
		           //  ' ' 주의 //
			// 대소문자 모두 허용되도록 //
		if (gender == 'M' || gender == 'm') {
			System.out.println("남학생");
		}else {
			System.out.println("여학생");
		}
		
		sc.close();
		
		
	}
}
