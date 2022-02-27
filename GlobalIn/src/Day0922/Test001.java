package Day0922;

public class Test001 {

	// 1~100까지의 합을 구하되 10의 배수가 될 때마다 결과를 출력하는 프로그램을 작성하시오
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum += i;
			if(i % 10 == 0) {
				System.out.printf("1부터 %d까지의 합계 : %d\n", i, sum);
			}
			i++;
		}
		/* do while문으로 바꾸면
		 	do {
			sum += i;
			if(i % 10 == 0) {
				System.out.printf("1부터 %d까지의 합계 : %d\n", i, sum);
			}
			i++;
			}
			while(i <= 100) 
		 */
		/* for문으로 바꾸면
		  for(i = 1; i <= 100; i++) {
		  sum += i;
			if(i % 10 == 0) {
				System.out.printf("1부터 %d까지의 합계 : %d\n", i, sum);
			}
		  }
		 */
	}
}