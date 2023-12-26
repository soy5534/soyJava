
public class memojang {
	public static void main(String [] args) {
		
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
