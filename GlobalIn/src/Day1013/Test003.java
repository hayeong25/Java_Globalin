package Day1013;

/*
20 16 12 8 4
19 15 11 7 3
18 14 10 6 2
17 13  9  5 1
*/

	// 행의 시작값은 (행 * 열 - 1) 이고 열은 (행의 크기 * 열의 인덱스)

public class Test003 {

	public static void main(String[] args) {

		int cnt_i = 4; // 행의 크기
		int cnt_j = 5; // 열의 크기
		// 배열 선언
		int[][] arr = new int[cnt_i][cnt_j];
		int i, j;
		for(i = 0;i < arr.length; i++) { // 행
			for(j = 0; j < arr[i].length; j++) { // 열
				arr[i][j] = ((cnt_i * cnt_j - i) - (cnt_i * j)); // 행의 시작값은 행 * 열 - 1  열은 행의 크기 * 열의 인덱스
			}
		}
		// 출력
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}