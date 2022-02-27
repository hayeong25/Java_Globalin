package Day0924;

import java.util.*;

public class Study005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Boolean a, b;
		String op;
		System.out.println("논리 연산을 입력하세요 >>");
		a = sc.nextBoolean();
		op = sc.next();
		b = sc.nextBoolean();
		switch(op) {
		case "AND":
			System.out.println("false");
		case "OR":
			System.out.println("true");
		}
		System.out.println(a + op + b);
		sc.close();
	}
}