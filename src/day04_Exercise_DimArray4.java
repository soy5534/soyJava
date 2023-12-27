
public class day04_Exercise_DimArray4 {
	public static void main(String [] args) {
		
		
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		
		int nums [][] = new int[5][5];
		int k = 1;
		
		// 2차원 배열 데이터 입력
		for (int i = 0; i < nums.length; i++) {
		    if (i % 2 == 0) {
		        for (int j = 0; j < nums[i].length; j++) {
		            nums[i][j] = k++;
		        }
		    } else {
		        for (int j = nums[i].length - 1; j >= 0; j--) {
		            nums[i][j] = k++;
		        }
		    }
		}
		
		// 2차원 배열 출력
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}

