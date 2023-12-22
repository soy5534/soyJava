package Exam;

public class Exam_forDouble {
	public static void main(String [] args) {
		// 1*1=1 1*2=2 1*3=3 ... 1*9=9
		// 2*1=2 2*2=4 2*3=6 ... 2*9=18
		// ...
		
		
		for(int i = 1; i < 10; i++) {
			System.out.print("1 * "+i+" = " + 1*i);
			System.out.print("\t");
		}
		
		for(int j = 1; j < 10; j++) {
			System.out.print(j + " * "+i+ " = " + j*i);
			System.out.print("\t");
		}
		System.out.println();
		
	}
	
}
