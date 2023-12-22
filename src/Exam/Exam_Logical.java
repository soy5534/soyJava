package Exam;

public class Exam_Logical {
	public static void main(String [] args) {
		// 논리연산자 예제
		// Oracle에서 WHERE절 뒤에 적었던 논리연산자 AND, OR
		// 와 같은 역할을 함.
		// ex) 남자이면서 평균편점 4.3이상인 사람 (AND)
		// 		컴퓨터공학과 또는 경영학과인 사람 (OR)
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// num1 cannot be resolved to a variable ( 변수가 선언되지 않음)
		
//		int num1 = 50;
//		int num2 = 30;
		                       // AND //     
//		result1 = (num1 == num2) && (num1 < num2);  // false
								// OR //
//		result2 = (num1 < num2) || (num1 == num2);  // false
//		result3 = (num1 > num2) && (num1 != num2);  // true (!= 다르냐(true/false)
//		result4 = (num1 > num2) || (num1 == num2); // true
	
		// a는 70, b는 55다.
		int a = 70;
		int b = 55;
		 result1 = (a == b) || (a++ < 100);  // true
		 result2 = (a < b) && (--b < 55);   // false
		 result3 = (a != b) && (b-- < a++);   // true 
		 result4 = (a++ != b) || (b++ >= 85);   // true
		 
		// a : 73 , b : 54 

	}
}
