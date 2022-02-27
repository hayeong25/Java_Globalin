package Day0922;

import java.util.*;

public class Test005 {

	// 무한대로 두 정수를 입력받아 합을 구하는 프로그램을 구현하시오. for문 이용. 0이 나오면 종료
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;
		for(; ; ) {
			System.out.println("첫 번째 정수를 입력하세요 : ");
			n = sc.nextInt();
			if(n == 0) {
				System.out.println("오류");
				break;
			}
			System.out.println("두 번째 정수를 입력하세요 : ");
			m = sc.nextInt();
			if(m == 0) {
				System.out.println("오류");
				break;
			}
			System.out.println("두 정수의 합계 : " + (n + m));
			sc.close();
			break;
		}
	}
}