package Exercise;
import java.util.Scanner;

public class Exercise_Loop4_GPTVer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문제1.
        // 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
        // 만일 1 미만의 숫자가 입력됐다면
        // "1 이상의 숫자를 입력해주세요."를 출력하고 다시 입력받습니다.

        int num1, num2;

        // 첫 번째 숫자 입력 받기 (1 이상의 숫자를 입력받을 때까지 반복)
        do {
            System.out.print("첫번째 숫자 입력 : ");
            num1 = sc.nextInt();

            if (num1 < 1) {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            }

        } while (num1 < 1);

        // 두 번째 숫자 입력 받기 (1 이상의 숫자를 입력받을 때까지 반복)
        do {
            System.out.print("두번째 숫자 입력 : ");
            num2 = sc.nextInt();

            if (num2 < 1) {
                System.out.println("1 이상의 숫자를 입력해주세요.");
            }

        } while (num2 < 1);

        // 두 수 중 작은 수를 min에, 큰 수를 max에 할당
        int min = (num1 > num2) ? num2 : num1;
        int max = (num1 > num2) ? num1 : num2;

        // min부터 max까지의 숫자 출력
        for (int i = min; i <= max; i++) {
            System.out.printf("%d ", i);
        }

        sc.close();
    }
}