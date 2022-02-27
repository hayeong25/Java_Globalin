package Day1007;

public class Test001 {

	/*
	 1 2 3 4 5
	 2 3 4 5 6
	 3 4 5 6 7
	 4 5 6 7 8
	 5 6 7 8 9	 
	 */
	public static void main(String[] args) {

		int a[][];
		a = new int[5][5];
		int n = 1; // 초기화 a[0][0] = 1
		int i, j;
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				a[i][j] = (n + i + j);
			}
		}
		System.out.println();
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a.length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
}