
public class day04_Exercise_DimArray1 {
	public static void main(String [] args) {
		
		// 크기가 5x5인 정수형 2차원 배열 'nums'를 선언하고 초기화.
		int nums [][] = new int[5][5];
		// 값을 할당할 변수 'k'를 선언하고 1로 초기화 
		int k = 1;
		
		// 2차원 배열 데이터 입력 
		// 첫 번째 반복문에서는 배열의 행을 순회함.
		for(int i = 0; i < nums.length; i++) {
			// 두 번째 반복문에서는 배열의 열을 순회하며 값을 할당함.
			for(int j = 0; j < nums[i].length; j++) {
				// 현재 위치에 'k'값을 할당하고, 'k'값을 1 증가시킴.
				nums[i][j] = k++;
			}
		}
		// 2차원 배열 출력
		// 배열의 값을 출력하기 위해 다시 행을 순회하는 반복문
		for(int i = 0; i < nums.length; i++) {
			// 열을 순회하며 배열의 값을 출력
			for(int j = 0; j < nums[i].length; j++) {
				// 배열의 값을 출력하고 공백을 추가함.
				System.out.print(nums[i][j] + " ");
			} // <- 두 번째 반복문의 끝을 나타냄
			// 행이 바뀔때마다 줄바꿈을 수행하여 2차원 배열의 형태를 표현함.
			// 행이 바뀔때마다 줄바꿈을 수행하여 전체 배열의 출력을 마무리.
			System.out.println();
			
		// 따라서, 이 코드는 5x5 크기의 2차원 배열에 1부터 25까지의 값을 할당하고, 
		// 그 값을 출력하는 프로그램이다.
		}
	}
}
