import java.util.Scanner;

public class Exercise_Operator11 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 문제11.
		// A, B, C사원의 연봉을 입력받고 각 사원의 연봉과 인센티브를
		// 포함한 연봉을 계산하여 출력하고 인센티브 포함 급여가
		// 3000만원 이상이면 "3000 이상', 미만이면 "3000만원 미만"을 출력하세요.
		// (a사원의 인센티브는 0.4, b사원의 인센티브는 없으며,
		// c사원의 인센티브는 0.15)
		// 메소드를 이용하면 조금더 줄일 수 있을텐데,,,
		
		System.out.print("A사원의 연봉 : ");
		int aSal = sc.nextInt();		
		// double = 부동 소수점 숫자를 나타냄.
		double aIncent = aSal*1.4;
		
		System.out.print("B사원의 연봉 : ");
		int bSal = sc.nextInt();
				
		System.out.print("C사원의 연봉 : ");
		int cSal = sc.nextInt();
		double cIncent = cSal*1.15;
		
		if(aIncent >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
		if(bIncent >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
		if(cIncent >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}

		
		sc.close();
		
	}
}
