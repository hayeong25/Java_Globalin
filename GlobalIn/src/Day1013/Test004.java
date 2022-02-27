package Day1013;

/*
1 5  9  13 17
2 6 10 14 18
3 7 11 15 19
4 8 12 16 20
*/

public class Test004 {

	public static void main(String[] args) {

		int cnt_i = 4; // 행의 크기
		int cnt_j = 5; // 열의 크기
		// 배열 선언
		int[][] arr = new int[cnt_i][cnt_j];
		int i, j;
		for(i = 0;i < arr.length; i++) { // 행
			for(j = 0; j < arr[i].length; j++) { // 열
				arr[i][j] = ((i + 1) + (cnt_i * j));// 행의 시작값은 행 인덱스 + 1  열은 행의 크기 * 열의 인덱스
			}
		}

		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}