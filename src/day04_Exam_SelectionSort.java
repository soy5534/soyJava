
public class day04_Exam_SelectionSort {
	public static void main(String [] args) {
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		// 알고리즘
		// 특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n+1번 ~ 마지막 인덱스까지 비교함.
		// {2, 5, 4, 1, 3}
		// 첫번째 결과 {1, 5, 4, 2, 3}
		// {1, 5, 4, 2, 3}
		// 두번째 결과 {1, 2, 4, 5, 3}
		// {1, 2, 4, 5, 3}
		// 세번째 결과 {1, 2, 3, 5, 4}
		// {1, 2, 3, 5, 4}
		// 네번째 결과 : {1, 2, 3, 4, 5}
		
		int arrs [] = {2, 5, 4, 1, 3};		
		// 1. 최소값을 구한 뒤 배열값 교환
		// 2. 최소값을 구하면 배열이기 때문에 최소값이 저장되어있는
		// 	  인덱스를 구해서 사용할 수 있음.
		int min = 0;
		// 최소값을 구하는 코드 + a
		for (int j = 0; j < arrs.length-1; j++) {
		for(int i = j+1; i < arrs.length; i++) {
			if(arrs[min] > arrs[i]) {
				min = i;
		}
		}
		}
		int temp = arrs[0];
		arrs[0] = arrs[min];
		arrs[min] = temp;
	}
	// 배열 출력
	for(int i = 0; i < arrs.lengthl; i++) {
		System.out.print(arrs[i] + " ");
	}
}
