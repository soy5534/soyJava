
public class day04_Exercise_DimArray3 {
	public static void main(String [] args) {
		
		
		// 5 10 15 20 15
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21
		
		int nums [][] = new int[5][5];
		int k = 1;
		
		// 2차원 배열 데이터 입력
		for(int i = 0; i < nums.length; i++) {
//			for(int j = 0; j < nums[i].length; j++) {
				for(int j = nums.length-1; j >= 0; j--) {
				nums[i][j] = k++;
			}}
		
		
		// 2차원 배열 출력
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}

