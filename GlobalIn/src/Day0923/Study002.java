package Day0923;

public class Study002 {

	// 구구단 3단씩
	public static void main(String[] args) {

		int i, j, k;
		for(i = 1; i < 8; i += 3) {
			for(j = 1; j < 10; j++) {
				for(k = i; k <= i + 2; k++) {
					System.out.printf("%d * %d = %d\t\t", k, j, (k*j));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}