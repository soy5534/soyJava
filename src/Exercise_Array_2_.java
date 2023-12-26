import java.util.Scanner;

public class Exercise_Array_2_ {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		// 입력받고 평균을 구하는 프로그램을 작성하라.
		// 단, 배열의 크기는 5이다.
		
		// 변수선언 및 초기화
		int arrs [] = new int[5];
		int sum = 0;
		
		// 입력부분
		
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("정수 입력");
			arrs[i] = sc.nextInt();			
		}
		// 출력부분
		for(int i = 0; i < arrs.length; i++) {			
			sum += arrs[i];
		}                                //형변환
		// 형변환, 정수 / 정수 = 정수, 실수 / 정수->실수 = 실수
		System.out.println("평균 : " + (double)sum/arrs.length);
		
	}
}
