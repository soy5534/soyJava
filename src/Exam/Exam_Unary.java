package Exam;

public class Exam_Unary {
	public static void main(String [] args) {
		// 단항 연산자
		// a++ or ++a -> a = a + 1;
		// 후위연산, 전위연산
		int a1 = 1;
		System.out.println(++a1);
						// 결과는 다음줄에서 ( a1 = 3 ) 
		System.out.println(a1++);
		System.out.println(a1);
		// 문제1
		// a가 10, b는 20, c는 30
		int a = 10;
		int b = 20;
		int c = 30;
		 a++; // a = 11
		 b = (--a) + b;  // 
		 c = (a++) + (--b)
		System.out.println("a: " + a + ", b : " + b + ", c:" +c);
//		a = 11
//		b = 30 // 29
//		c = 41 // 39
		
		// 문제2
		// x는 100, y는 33, z는 0
		// x--;   x = 99
		// z = x-- + --y;  z = 131
		// x = 99 + x++ + x;  x = 98 / 99 + 99 + 98  x = 296
		// y = y-- + y + ++y;
		// x : ?, y : ?, z : ?
		
//		x = 296 y = 89 -> 95 z = 131  
		
	}
}
