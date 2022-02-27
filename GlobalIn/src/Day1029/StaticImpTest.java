package Day1029;

/*
	static import문
	JDK 5.0 이전에서는 상수 또는 static으로 선언된 것들을 사용하려면 해당 [클래스명.상수]등으로 접근해 왔었다
	하지만 JDK 5.0에서부터는 static import를 사용하여 보다 쉽고 빠르게 static 상수 또는 메소드 등을 호출할 수 있다
	import static [패키지경로.클래스명.*;]
	import static [패키지경로.클래스명.상수필드명;]
*/

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImpTest {

	public static void main(String[] args) {
		int i = (int)(random() * 26 + 65);
		System.out.println();
		out.println((char)i);
	}


	// 추상 클래스는 생성자 없음
}