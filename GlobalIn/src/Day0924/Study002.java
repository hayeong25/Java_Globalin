package Day0924;

import java.util.*;

public class Study002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("몇 층인지 입력하세요 >> ");
		i = sc.nextInt();
		System.out.println((i * 5) + "m입니다.");
		sc.close();
	}
}