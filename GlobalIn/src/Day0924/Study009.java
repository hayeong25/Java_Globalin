package Day0924;

import java.util.*;

public class Study009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int i, j;
		System.out.println("1~99 사이의 정수를 입력하세요 >> ");
		n = sc.nextInt();
		i = n / 10;
		j = n % 10;
		if((i == 3) || (i == 6) || (i == 9)) {
			if((j == 3) || (j == 6) || (j ==9)) {
				System.out.println("박수짝짝");
			}
			else {
				System.out.println("박수짝");
			}
		}
		else if((i != 3) && (i != 6) && (i != 9)) {
			if((j == 3) || (j == 6) || (j ==9)) {
				System.out.println("박수짝");
			}
			else {
				System.out.println("박수없음");
			}
		}
		else {
			System.out.println("박수없음");
		}
		sc.close();
	}
}