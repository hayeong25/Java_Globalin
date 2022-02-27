package Day0925;

import java.util.Scanner;

public class Test001 {

	// 키보드로부터 키와 몸무게를 입력받아 다음 조건을 이용하여 정상인지, 비만인지를 출력하는 프로그램을 작성하시오. 단, 몸무게는 실수형태로 입력받는다
	// 조건 : 몸무게 = (키 - 100) * 0.9 이면 정상, 아니면 비만
	// 연산자는 삼항연산자
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String result = "";
		int height, weight;
		System.out.println("키를 입력하세요 : ");
		height = sc.nextInt();
		System.out.println("몸무게를 입력하세요 : ");
		weight = sc.nextInt();
		result = (weight <= ((height - 100) * 0.9)) ? "정상" : "비만";
		System.out.println(result + "입니다.");
		sc.close();
	}
}