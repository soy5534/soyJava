package Exercise;
import java.util.Scanner;

public class Exercise_Operator8_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 문제8.
		// 주민번호를 이용하여 남자인지, 여자인지
		// 구분하여 출력하세요
		// ex. 주민번호를 입력하세요(-포함) : 991230-2123322
		// 여자
		
		 // 가이드메세지 입력 ( 사용자입력 Y / N )
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char socialNum = sc.next().charAt(7);
		
		switch(socialNum) {
			case '1' : // 생략 가능
			case '3' : System.out.println("남자"); break;
			case '2' : // 생략 가능
			case '4' : System.out.println("여자"); break;
			default : System.out.println("잘못된 데이터를입력하셨습니다.");
		}
		
		sc.close();
		
	}
}
