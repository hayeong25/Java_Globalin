package Day1005;

import java.util.*;

public class Study002 {

// 89페이지 실습문제 9번

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int n; // 정수를 입력받아 저장할 변수
	int first; // 입력받은 정수를 10으로 나눈 몫을 저장할 변수
	int second; // 입력받은 정수를 10으로 나눈 나머지를 저장할 변수
	
	System.out.println("1 ~ 99 사이의 정수를 입력하세요>>");
	n = sc.nextInt();

	first = n / 10; // 몫
	second = n % 10; // 나머지
	
	if(first == 0) {
		first = 1;
	} // 3의 배수가 아닌 임의의 수로 변경
	
	if(second == 0) {
		second = 1;
	} // 3의 배수가 아닌 임의의 수로 변경
	
	if((first % 3 == 0) && (second % 3 == 0)) {
		System.out.println("박수짝짝");
	}
	else if(((first % 3 == 0) && (second % 3 != 0)) || ((first % 3 != 0) && (second % 3 == 0))) {
		System.out.println("박수짝");
	}
	else {
		System.out.println("박수없음");
	}
	sc.close();
	}
}