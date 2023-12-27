package Exercise;
import java.util.Scanner;

public class Exercise_Loop2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--)
			System.out.print((i)+" ");
	}
}
