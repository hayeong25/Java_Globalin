package Day1005;

import java.util.*;

public class Study004 {

// 126페이지 실습문제 3번
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		try {
			System.out.println("정수 입력 : ");
			n = sc.nextInt();

			if(n % 2 == 0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
				}
		} catch(InputMismatchException e) {
		System.out.println("숫자가 아니라서 프로그램을 종료합니다");
		} finally {
			sc.close();
		}
	}
}