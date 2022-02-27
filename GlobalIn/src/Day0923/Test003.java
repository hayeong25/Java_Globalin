package Day0923;

public class Test003 {

	// 중첩 for문
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i < 10; i++) {
			for(j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t\t", j, i, (i*j));
			}
			System.out.println();
		}
	}
}