package Day1007;

public class Study004 {

	/*
	 1 2 3 4 5
	 6 7 8 9 10
	 11 12 13 14 15
	 16 17 18 19 20
	 21 22 23 24 25 
	 */
	public static void main(String[] args) {

		// 배열 선언
		int a[][];
		// 배열의 메모리 할당
		a = new int[5][5];
		int n = 1; // 초기화 a[0][0] = 1
		int i, j;
		// 배열에 값 저장
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = n;
				n++;
			}
		}
		System.out.println();
		// 배열에 저장된 값 출력
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a.length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}