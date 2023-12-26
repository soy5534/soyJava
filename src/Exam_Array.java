
public class Exam_Array {
	public static void main(String [] args) {
		int num; // 변수의 선언
		num = 0; // 변수의 초기화
		int nums []; // 배열의 선언, int [] nums
		nums = new int [10]; // 배열의 생성(할당)
		// nums는 배열의 첫번째 칸의 주소, 참조변수
		nums[0] = 11; // 배열의 값 초기화
		System.out.println(nums[0]);
		System.out.println(nums.length);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}
}
