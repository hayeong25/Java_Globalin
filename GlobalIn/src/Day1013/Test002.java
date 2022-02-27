package Day1013;

/*
 과제 2번 문제
 1    2   3   4   5
 10  9   8   7   6
 11 12 13 14 15
 20 19 18 17 16
 */

public class Test002 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int num = 1, i, j;
		for(i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				for(j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				}
			}	
			else {
				for(j = (arr[i].length - 1); j >=0; j--) {
				arr[i][j] = num++;
				}
			}
		}
		for(i = 0; i < arr.length; i++) {
			System.out.println();
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");}
			}
			System.out.println();
	}
}