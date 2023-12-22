package Exercise;

public class Exercise_While2 {
	public static void main(String [] agrs) {
		// While문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오
		// 1 ~ 100 사이의 홀수의 합 : ?
		int i = 0;
		int sum = 0;
		while( i < 100) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		
	}
	
}
