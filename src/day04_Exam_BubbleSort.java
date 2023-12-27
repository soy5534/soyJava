
public class day04_Exam_BubbleSort {
	public static void main(String [] args) {
		// 버블정렬(bubble sort)이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 기본적으로 다른 정렬에 비해서 속도가 느린편이며 역순으로
		// 정렬할 때 가장 느림.
		
		int arrs [] = {2, 5, 4, 1, 3};
		
		if(arrs[0] > arrs[1]) {
			if(arrs[0] > arrs[1]) {
				int temp = arrs[0];
				arrs[0] = arrs[1];
				arrs[1] = temp;
			}
		}
		if(arrs[1] > arrs[2]) {
			int temp = arrs[1];			
				arrs[1] = arrs[2];
				arrs[2] = temp;
			}
		if(arrs[2] > arrs[3]) {
			int temp = arrs[2];			
				arrs[2] = arrs[3];
				arrs[3] = temp;
			}
		if(arrs[3] > arrs[4]) {
			int temp = arrs[3];			
				arrs[3] = arrs[4];
				arrs[4] = temp;
			}
			
		
		
		
		
		for(int i = 0; i < arrs.length-1; i++) {
		for(int j = 0; j < (arrs.length-1)-i; j++) {
			if(arrs[j] > arrs[j+1]) {
				int temp = arrs[j];
				arrs[j] = arrs[j+1];
				arrs[j+1] = temp;
			}
			}
		}
		// 배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		System.out.println();
	}
}
