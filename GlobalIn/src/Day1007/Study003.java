package Day1007;

public class Study003 {

	public static void main(String[] args) {

		int test[][] = new int[2][3]; // 2행 3열의 2차원 배열 선언
		/*
		 int test[][];
		 test = new int[2][3];
		 */
		// 첫 번째 행에 값 저장
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		// 두 번째 행에 값 저장
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		// int test[][] = {100, 200, 300, 400, 500, 600}
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		System.out.println(test[1][2]);
		int i, j;
		for(i = 0; i < test.length; i++) {
			for(j = 0; j < test.length; j++) {
				System.out.print("test[" + i + "][" + j + "] :" + test[i][j] + "\t");
			}
			System.out.println();
		}
	}
}