package Exercise;
import java.util.Scanner;

public class Exercise_Operator8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 문제8.
		// 주민번호를 이용하여 남자인지, 여자인지
		// 구분하여 출력하세요
		// ex. 주민번호를 입력하세요(-포함) : 991230-2123322
		// 여자
		
		 // 가이드메세지 입력 ( 사용자입력 Y / N )
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String personalNum = sc.next();
		// SUBSTR(EMP_NO, 8,1) IN ('2', '4')
		if(personalNum.charAt(7) == '2'
				|| personalNum.charAt(7) == '4') {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
		sc.close();
		
		
	}
}
