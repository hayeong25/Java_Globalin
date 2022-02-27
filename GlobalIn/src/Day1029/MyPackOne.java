package Day1029;

/*
	패키지
	- 자바에서의 패키지는 서로 관련있는 클래스와 인터페이스를 하나의 단위로 묶는 것. 일종의 자료실이라고 할 수 있음
	패키지 선언 방법
	- 주석문을 제외하고 반드시 소스 파일의 첫 줄에 와야 함
	- package 패키지 경로명;
	패키지 사용법
	- import [패키지경로.클래스명;] 또는 import [패키지경로명.*;]
*/

public class MyPackOne {

	public void one() {
		System.out.println("MyPackOne 클래스의 one() 메소드...");
	}
}