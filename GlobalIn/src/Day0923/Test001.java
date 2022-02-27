package Day0923;

import java.util.*;

public class Test001 {

	// 임의의 정수를 입력받아 입력받은 정수의 팩토리얼을 구하는 프로그램을 작성하시오. 단 for문 사용
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, i, sum = 1;

		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			sum *= i;
			System.out.println(n + "의 팩토리얼 값은 " + sum + "입니다.");
			sc.close();
		}
		
		/* while문으로 바꾸면
		 	while(i <= n) {
		 		sum *= i;
		 		i++;
		 	}
		 */
		/* do while문으로 바꾸면
	 	do {
	 		sum *= i;
	 		i++;
	 	}
	 	while(i <= n)
	 */
	}
}