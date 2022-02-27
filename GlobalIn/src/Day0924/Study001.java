package Day0924;

import java.util.*;

public class Study001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("두 정수를 입력하세요 >> ");
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println(i + "+" + j + "은 " + (i +j));

		sc.close();
	}
}