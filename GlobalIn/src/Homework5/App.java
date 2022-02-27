package Homework5;

import java.util.Scanner;

abstract class Calculator {
	protected int a, b;
	
	abstract protected int calc(); // 추상 메소드
	
	protected void input() { // 두 정수를 입력받는 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
	}
	
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
}

class Adder extends Calculator {
	protected int calc() {
		return a + b;
	}
}

class Subtracter extends Calculator {
	protected int calc() {
		return a - b;
	}
}

public class App {

	public static void main(String[] args) {
	
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();	
	}	
}