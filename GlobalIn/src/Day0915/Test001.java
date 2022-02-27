package Day0915;

import java.io.*;

public class Test001 {

	// 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 2의 배수인지 3의 배수인지, 또는 2와 3의 배수인지 아닌지를 판정하는 프로그램을 구현하시오.
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int n = 0;
		System.out.println("정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		if((n % 2 == 0) && (n % 3 == 0)) {
			System.out.println("2와 3의 배수입니다.");
		}
		else if(n % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		else if(n % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("2 또는 3의 배수가 아닙니다.");
		}
		
	}
}