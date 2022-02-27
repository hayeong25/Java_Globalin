package Day1023;

/*
	상속에서의 생성자 : super()
	- 자식의 기본 생성자에는 super() 가 생략되어 있음
	- 객체 생성시 무조건 부모 클래스부터 생성됨
	- 즉, 부모의 생성자를 무조건 먼저 호출해야 함
	- this(), super()는 생성자의 가장 위에 명시
*/

class SSuper {
	public SSuper(int x) {
		System.out.println("상위 클래스의 생성자 : " + x);
	}
}

class SSub extends SSuper {
	public SSub() {
		super(5); // 상위 클래스의 생성자 함수 호출
		System.out.println("하위 클래스의 생성자");
	}
}

public class SuperExam002 {

	public static void main(String[] args) {

		new SSub();
	}
}