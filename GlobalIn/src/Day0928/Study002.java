package Day0928;

import java.util.*;

public class Study002 {

	// 실습 문제 1
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n;
		System.out.println("알파벳 한 문자를 입력하세요 >> ");
		n = sc.next();
		char s = n.charAt(0);
		for(int i = 'a'; i <= s; i++) {
			System.out.print((char)i);
			for(int j = (i + 1); j <= s; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		sc.close();
	}
}