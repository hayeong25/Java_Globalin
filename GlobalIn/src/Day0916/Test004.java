package Day0916;

import java.io.*;

public class Test004 {

	// 숫자 하나 입력 받기
	
	public static void main(String[] args) throws IOException {

		int num1;
		int num2;
		System.out.println("숫자 1 : ");
		num1 = System.in.read() - '0'; // 입력한 값에서 ' ' 안의 수의 아스키 코드 값만큼 빼겠다는 뜻
		// ex) num1 = 1, -'0' >> 1의 아스키 코드 값은 49, 0은 48이므로 결과값은 1
		
		System.in.read();
		System.in.read();
		
		System.out.println("숫자 2 : ");
		num2 = System.in.read() - '0';
		System.out.printf("%d, %d",num1, num2);

	}
}