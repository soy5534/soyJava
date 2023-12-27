
public class day04_Exam_ArraySort {
	public static void main(String [] args) {
		
		//정렬
        //11 13 4 6 2
        //오름차순 => 2 4 6 11 13
        //내림차순 => 13 11 6 4 2
        //머릿속으로 했었던 비교에 순서와 방법을 정리해놓은 것
        //알고리즘 : 문제해결을 하기 위한 절차(순서)나 방법
        //정렬 알고리즘 종류
        //1. 삽입정렬
        //2. 선택정렬
        //3. 버블정렬
        //4. 퀵정렬
        //5. 병합정렬
        //...
        //* temp 알고리즘
        int num1 = 11;
        int num2 = 13;
        int temp;

        System.out.println(num1 + " " +num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " +num2);
        //삽입정렬
        //정렬 알고리즘중에 하나, 가장 간단하고 기본이 되는 알고리즘
        //배열의 N번 인덱스 값을 0번에서 n-1번까지 비교한다.
        //N은 1부터 시작
        //오름차순,작은것 부터 찾는다.
        System.out.println("====================");
        System.out.println("삽입정렬");
        int nums2[] = {2, 5, 4, 1, 3, 2, 3, 4, 6, 5, 1, 1};
        for(int i = 1; i < nums2.length; i++) {
            for(int j = i; j >= 1; j--) {
                if(nums2[j - 1] > nums2[j]) {
                    temp = nums2[j - 1];
                    nums2[j - 1] = nums2[j];
                    nums2[j] = temp;
                }
            }
        }
        for(int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        System.out.println("====================");
        System.out.println("버블정렬");
        int nums1[] = {2, 5, 4, 1, 3, 2, 3, 4, 6, 5};
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums1.length; j++) {
                if(nums1[i] < nums1[j]) {
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
        for(int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
	}
}
