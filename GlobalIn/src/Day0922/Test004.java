package Day0922;

import java.util.*;

public class Test004 {

	// 양의 정수만 입력받아 입력받은 합의 평균을 구하여라. 단, 음의 정수를 입력하면 반복문 종료. for문 사용
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum =0, input =0;
		int count = 0;
		for(; input >= 0; ) {
			sum += input;
			System.out.print("양의 정수 입력 : ");
			input = sc.nextInt();
			count++;
			sc.close();
		}
		System.out.println("지금까지 입력한 양의 정수의 평균 : " + (int)(sum / count));
	}
}