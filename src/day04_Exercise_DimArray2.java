
public class day04_Exercise_DimArray2 {
	public static void main(String [] args) {
		
		
		// 5 4 3 2 1
		// nums[0][4], nums[0][3], nums[0][2], nums[0][1], nums[0][0]
		// 10 9 8 7 6
		// nums[1][4], nums[1][3], nums[1][2], nums[1][1], nums[1][0]
		// 15 4 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		
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
