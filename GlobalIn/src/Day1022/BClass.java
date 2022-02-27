package Day1022;

import java.io.*;

public class BClass extends AClass {

	// 데이터 입력(메소드 정의)
	boolean input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 두 정수 입력 : ");
		String temp = br.readLine(); // 20 15
		String[] str = temp.split("\\s"); // {"20", "15"}
		if(str.length != 2) {
			return false;
		}
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		System.out.print("연산자 입력[+ - * /] : ");
		ch = (char)System.in.read();
		if((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/')) {
			return true;
		}
		return false;
	}
	// 연산 처리
	double calc() {
		double result = 0;
		switch(ch) {
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		case '*':
			result = x * y;
			break;
		case '/':
			result = (double)x / y;
			break;
		}
		return result;
	}
}