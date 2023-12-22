package Exam;

import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) {
		// 독신여부(true/false)
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력해주세요 :");
				// sc.next(); <- 가 있어야 사용자입력 활성화
				String name = sc.next();
			System.out.print("도시를 입력해주세요 :");
				String city = sc.next();
			System.out.print("나이를 입력해주세요 :");
				int age = sc.nextInt();
			System.out.print("체중을 입력해주세요 :");
				double weight = sc.nextDouble();
			System.out.print("독신 여부를 입력해주세요 :");
				boolean singleYN = sc.nextBoolean();
		System.out.println("이름은 " + name +", 도시는 " + city + ", 나이는 " + age + "살, 체중은 " + weight + "kg, 독신여부는 " +singleYN +"입니다.");
		sc.close();
	}
}
