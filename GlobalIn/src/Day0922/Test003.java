package Day0922;

import java.util.*;

public class Test003 {

	// 임의의 정수를 입력받아 입력받은 수만큼 3의 배수를 출력하는 프로그램을 구현하시오
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 1;
		int num;
		System.out.println("임의의 정수를 입력하시오 : ");
		num = sc.nextInt();
		while(i <= num) {
			System.out.print((3 * i) + "\t");
			i++;
		}
		sc.close();
	}
}