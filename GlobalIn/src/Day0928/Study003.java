package Day0928;

import java.util.*;

public class Study003 {

	// 실습 문제 3
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("정수를 입력하세요 >>");
		try {
			n = sc.nextInt();
			if(n % 2 == 0) {
				System.out.println("짝");
			}
			else {
				System.out.println("홀");
			}
		}
		catch(Exception e) {
			System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
		}
		sc.close();
	}
}