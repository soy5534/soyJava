package Array_Exercise;

public class Exercise_Array1 {
	public static void main(String [] args) {
		// 길이가 10인 배열을 선언하고
		// 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		// 배열 선언 및 초기화
		int[] nums = new int[10];
		
		// 1부터 10까지의 값을 배열에 넣기
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		// 배열의 값을 출력
		System.out.println("배열의 값 : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		
	}
}
