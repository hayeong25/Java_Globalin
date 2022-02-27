package Day0922;

import java.util.*;

public class Test006 {

	// 두 개의 정수를 입력받아 그 사이에 존재하는 정수들의 합계를 구하는 프로그램을 구현하시오
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;
		int temp = 0;
		int sum = 0;
		System.out.println("첫 번째 정수를 입력하세요 : ");
		n = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		m = sc.nextInt();
		if(n > m) {
			temp = n;
			n = m;
			m = temp;
		}
		for(int i = n; i <= m; i++) {
			sum += i;	
		}
		System.out.println("두 정수 사이의 합계 : " + sum);
		sc.close();
	}
}