package Day0923;

public class Test004 {

	// for문 2개를 이용하여 삼각형 만들기
	public static void main(String[] args) {

		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		for(i = 0; i < 5; i++) {
			for(j = 1; j <= (5 - i); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		for(i = 1; i <= 5; i++) {
			for(j = 1; (j > (5 - i)) && (j <= 5); j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
}