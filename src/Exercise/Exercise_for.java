package Exercise;

public class Exercise_for {

	public static void main(String [] args) {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		// 라고 나오도록 for문 사용해보기.
		
		// 변수를 사용하여 합을 저장할 변수를 초기화.
//		int sum = 0;
//		
//		// 1부터 10까지 루프를 돌면서 덧셈을 수행하고 출력함.
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i);
//		
//		// 마지막 숫자는 덧셈 기호를 출력하지 않습니다.
//		if (i < 10) {
//			System.out.print("+");
//		}
//		
//		// 합을 계산
//		sum += i;
//		}
//		
//		// 최종 합을 출력
//		System.out.println("=" + sum);

		
		// 다른 풀이방법
		
		int sum = 0;
//             초기식      조건식  증가식		      
		for(int i = 1; i <=10; i++) {
			sum = sum + i;
			if(i <= 9)
				System.out.print(i + "+");
			else
				System.out.print(i + "=");
		}
		System.out.println(sum);
		
		
		
		
		
	}
}
