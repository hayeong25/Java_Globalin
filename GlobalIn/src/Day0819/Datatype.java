package Day0819;

public class Datatype {

	public static void main(String[] args) {
		
		System.out.println("탈주각"); // 문자형 String은 더블 쿼터 ""
		System.out.println('A'); // 문자 Character는 싱글 쿼터 ''
		System.out.println(123); // 숫자는 그냥 입력
		int a; // 정수형 변수 선언. 선언만 해놓고 값은 나중에 지정할 수도 있다
		a=2;
		System.out.println(a);
		
		// byte
		// 1byte boolean 참, 거짓
		// 2byte char
		// 2byte short
		// 4byte int
		// 8byte long
		// 4byte float
		// 8byte double
		// C > C++ > JAVA
		
		//변수의 선언과 초기화
		
		int e = 0; // 정수형 변수 선언
		float f = 3.1f; // 실수형 변수 선언

		boolean ii = false;
		ii = true;

		System.out.println(e);
		System.out.println(f);
		System.out.println(ii);
		String aa;
		aa="우리는 하나";
		System.out.println(aa);

		// Sysout + ctrl + space   = System.out.println() 자동완성 기능

		String text = null; // null 값이 없음
		char character;

		text = "Say Good Bye";
		character = 'A';

		System.out.println(text);
		System.out.println(character);

		// int int int int int
		// 블럭 주석문 만들기 : Ctrl+Shift+/
		// 블럭 주석문 해제 :  Ctrl+Shift+\
		// 주석문 : 코드와 상관없이 실행. 코드의 설명을 적어넣는 부분
		//  // : 한 줄 주석 처리
		// /* ~ */ : 블럭을 지정해서 주석 처리

 	}
}