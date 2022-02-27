package Day0925;

public class Test002 {

	// 1에서 100까지의 정수 중에서 2, 3, 5, 7의 배수를 제외한 수를 한 행에 10개씩 출력하는 프로그램을 구현하시오
	public static void main(String[] args) {

		int cnt= 0;
		for(int i = 1; i <= 100; i++) {
				if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
					System.out.printf("%d\t", i);
					cnt++;
				}
				if(cnt == 10) {
					System.out.println();
					cnt = 0;
				}
		}
		/* int cnt = 1;
		 * int i;
		 * 
		 * for(i = 1; i <= 100; i++) {
		 * 		if((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0)) {
		 * 			System.out.printf("%3d%c", i, (cnt++ % 10 != 0) ? ' ' : '\n');
		 *		}
		 *  System.out.println();
		 * */
	}
}