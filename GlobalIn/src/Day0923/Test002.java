package Day0923;

import java.util.*;

public class Test002 {

	// 3의 승수를 입력받아 구하는 프로그램을 작성하시오
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, i, result = 1;
		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			result *= 3;
			sc.close();
		}
		System.out.println("3의 " + n + " 제곱은 " + result + " 입니다.");
	}
}