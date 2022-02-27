package Day0914;

import java.io.*;

public class IfBufferedreader002 {

	// 사용자로부터 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램을 구현하시오. 단, 입력은 BufferedReader. 조건은 삼항 연산자로 처리하시오.
	// 윤년의 판별조건 : 입력받은 년도가 4의 배수이면서 100의 배수가 아니거나 400의 배수

	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int y = 0;
	String result = "";
	
	System.out.println("연도 입력 : ");
	y = Integer.parseInt(br.readLine());
	
	result = (y % 4 == 0 && y % 100 != 0) ? "윤년" : (y % 400 == 0 ? "윤년" : "평년");
	
	/* 윤년 판별 조건 다른 방법
	* if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
	* 		System.out.println(year + "====> 윤년");
	* else
	* 		System.out.println(year + "====> 평년");
	*/
	
	System.out.println("입력한 연도는 " + result + "입니다.");
	
	}
}