package Day0915;

import java.util.*;

public class Test002 {

	// 사용자로부터 임의의 두 정수를 입력받아 해당 연산자의 처리 결과를 출력하는 프로그램을 구현하시오. 단, if문 사용. 입력은 BufferedReader

	public static void main(String[] args) /* throws IOException */ {
			
		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		char op;
		
		System.out.println("a : ");
		a = sc.nextInt();
		// a = Integer.parseInt(br.readLine());
			
		System.out.println("b : ");
		b = sc.nextInt();
		//b = Integer.parseInt(br.readLine());
			
		System.out.println("op : ");
		op = sc.next().charAt(0);
		//op = br.readLine();
		//op = (char)System.in.read();  아스키 코드로 받음. 엔터키를 누를 때 아스키 코드 값이 입력됨
		// System.in.read(); 은 System.in.skip(); 와 같다
			
		System.out.println("첫 번째 정수 : " + a);
		System.out.println("두 번째 정수 : " + b);
		System.out.println("연산자 입력(+ - * /) : " + op);
		
		if(op == '+') {
			System.out.println(a + "+" + b + "=" + (a + b));
		}
		else if(op == '-') {
			System.out.println(a + "-" + b + "=" + (a - b));
		}
		else if(op == '*') {
			System.out.println(a + "*" + b + "=" + (a * b));
		}
		else if(op == '/') {
			System.out.println(a + "/" + b + "=" + (a / b));
		}
		else {
			System.out.println("wrong");
		}
		sc.close();
		
	}
}