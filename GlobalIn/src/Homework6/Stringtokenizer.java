package Homework6;

// 교재 280p 2번 문제

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.next();
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");
			int n = st.countTokens();
			System.out.print("어절 개수는 " + n);
		}
		
		sc.close();
	}
}