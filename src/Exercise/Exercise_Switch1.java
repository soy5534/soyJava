package Exercise;

import java.util.Scanner;

public class Exercise_Switch1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// 100 ~ 90 : A
		// 80 ~ 89 : B
		// 70 ~ 79 : C
		// 60 ~ 69 : D
		// 60미만 : F
		// 학점은 F입니다.
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		char grade;		
		
		if(score >= 0 && score <= 100) {		
			if(score >= 90) 
				System.out.println("A학점입니다.");
			else if(score >= 80) 
				System.out.println("B학점입니다.");
			else if(score >= 70) 
				System.out.println("C학점입니다.");		
			else if(score >= 60) 
				System.out.println("D학점입니다.");		
			else 
			System.out.println("F학점입니다.");
			}else {
				System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
			}
			
//			System.out.println("학점은 "+grade+"입니다");
		
		sc.close();
}
		
	}

