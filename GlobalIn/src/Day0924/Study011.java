package Day0924;

import java.util.*;

public class Study011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("식을 입력하세요 >>");
		double op1 = sc.nextDouble();
		String operator = sc.next();
		double op2 = sc.nextDouble();
		double result = 0;
		sc.close();
		switch(operator) {
			case "+" : result = op1 + op2;
				break;
			case "-" : result = op1 - op2;
				break;
			case "*" : result = op1 * op2;
				break;
			case "/" : 
				if(op2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
				result = op1 / op2;
				break;
			default:
				System.out.println("연산 기호가 잘못되었습니다.");
		}
		System.out.println(result);
	}
}