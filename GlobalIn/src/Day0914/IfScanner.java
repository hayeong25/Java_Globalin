package Day0914;

import java.util.*;

public class IfScanner {

	// if scanner문 홀수짝수
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 변수선언
		int n;
		String result = "";
			
		// 2. 안내메시지 및 입력 저장처리
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
			
		// 3. 연산처리
		if(n % 2 == 0) {
			result = "짝수";
		}
		else result = "홀수";
		// 삼항연산자로 표현하면 result = (n % 2 == 0 ? "짝수" : "홀수")
			
		// 4. 결과출력
		System.out.println("입력한 정수는 " + result + "입니다.");

		sc.close();
	
	}	
}