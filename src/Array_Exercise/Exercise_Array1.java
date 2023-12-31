package Array_Exercise;

public class Exercise_Array1 {
	public static void main(String [] args) {
		// 길이가 10인 배열을 선언하고
		// 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		
		// 배열 선언 및 초기화 ( 길이가 [10]인 정수 배열을 선언하고 초기화 )
		int[] nums // 정수형 배열을 선언하는 부분. 'nums'라는 이름의 배열[]을 만들겠다는 선언.  
			= new int[10]; // 이 부분은 'nums'배열을 초기화하는 부분. 'new int[10]은 길이가 10인 정수(int) 배열을 생성함.
							// 배열의 각 요소는 초기화될 때 기본값인 0으로 초기화 됨.
							// 따라서 전체 코드를 통해 'nums'라는 이름의 길이(length)가 [10]인 정수(int) 배열이 생성되고 초기화 됨.
							// 이 배열을 사용하여 나중에 숫자를 저장하고 처리할 수 있음.
		
		// 1부터 10까지의 값을 배열에 넣기
		for (int i = 0; i < nums.length; i++) { // 반복문 시작. 'i'는 반복문의 제어 변수로, 초기값은 0부터 시작. 
			nums[i] = i + 1;  // 배열 'nums'의 각 인덱스 'i'에 값을 할당하는 부분. 여기서 'i + 1'은 현재 반복이 몇 번째인지에 따라 1부터 시작하는 값을 의미함.
		}				   	// 배열의 인덱스는 0부터 시작하므로, 'i + 1'을 사용하여 1부터 10까지의 값을 배열에 순서대로 저장함.
							// 따라서 전체 코드를 통해 1부터 10까지의 값을 배열에 저장하는 반복 작업을 수행함.
							// 배열 'nums'는 이후에 다른 부분에서 사용될 수 있음.
		
		// 배열의 값을 출력
		System.out.println("배열의 값 : "); //"println" : 출력 후 자동 줄바꿈.
		for (int num : nums) { // 배열 'nums'에 저장된 각 요소를 'num' 변수에 차례대로 할당하여 반복하는 역할을 함.
			System.out.print(num + " "); // 줄 바꿈 없이 출력. num + " " 은 각 값을 출력한 후 '공백' 추가. 따라서 배열에 저장된 값들이 공백으로 구분되어 한 줄에 출력됨.
		}
		
	}
}
