package Day1005;

import java.util.*;

public class Study001 {

// 87페이지 실습문제 5번

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean a, b, result = false;
		String op;
		
		System.out.println("논리 연산을 입력하세요>>");
		a = sc.nextBoolean();
		op = sc.next(); // 논리 연산자 문자열 읽기
		b = sc.nextBoolean();
		
		switch(op) { // jdk 1.7버전부터 switch 괄호 안에 문자열도 허용
			case "AND" :
				result = a && b;
				break;
			case "OR" :
				result = a || b;
				break;
			default :
				System.out.println("잘못된 논리 연산자입니다.");
		}
		System.out.println(result);
		sc.close();
	}
}