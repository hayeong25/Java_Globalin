package Homework3;

// 교재 129p 보너스 문제

public class Homework007 {

	public static void main(String[] args) {
	
		int intArray[][];
		intArray = new int[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				intArray[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.println();
		}
		int i = 0, sum = 0;
		while(i < 3) {
			for(i = 0; i < intArray.length; i++) {
				for(int j = 0; j < intArray.length; j++) {
					sum += intArray[i][j];
				}
			}
		}
		System.out.println("합은 " + sum);
	}

}