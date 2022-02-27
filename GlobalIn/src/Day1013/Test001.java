package Day1013;

/*
 과제 1번 - 레기드(가변) 배열
 1
 2 3
 4 5 6
 7 8 9 10
 */

public class Test001 {

	public static void main(String[] args) {

		int cnt = 4;
		int[][] arr = new int[cnt][]; // 2차원 배열 선언
		int num = 1; // 배열에 저장된 숫자 증가값
		int i, j;
		// int arr[i] = new int[j];
		// 배열 저장
		for(i = 0; i < arr.length; i++) { //행
			arr[i] = new int[(i+1)]; // 레기드 배열 선언 2차원 배열 공간이 하나씩 늘어나게 함
			for(j = 0; j < arr[i].length; j++) { // 열
				arr[i][j] = num++; // 숫자 하나씩 증가
			}
		}
		// 배열 값 출력
		for(i = 0; i < arr.length; i++) { //행
			for(j = 0; j < arr[i].length; j++) { // 열
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}