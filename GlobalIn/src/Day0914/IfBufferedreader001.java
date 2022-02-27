package Day0914;

import java.io.*;

public class IfBufferedreader001 {

	// 사용자로부터 임의의 정수를 입력받아 입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램을 구현하시오. 단, 입력은 BufferedReader로 처리하시오.
	
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int n = 0;
	String result;
			
	try {
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		result = (n < 0) ? "음수" : ((n == 0) ? "영" : "양수");
		System.out.println(n + " =====> " + result);
	}
	catch(IOException e) {
		e.printStackTrace();
		}
	
	}
}