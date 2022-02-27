package Day0918;

import java.util.*;

public class Test005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float num1, num2;
		char op;
		System.out.println("첫 번째 숫자 입력 : ");
		num1 = sc.nextFloat();
		System.out.println("두 번째 숫자 입력 : ");
		num2 = sc.nextFloat();
		System.out.println("연산자 입력 : ");
		op = sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		break;
		case '/':
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			else {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
		break;
		default:
			System.out.println("오류");
		}
		sc.close();
	}
}