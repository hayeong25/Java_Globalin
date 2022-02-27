package Day1020;

/*
	static 예약어
	- 메소드나 멤버 변수에 정의할 수 있으며 지역 변수나 클래스에는 정의 불가
	- static 키워드를 사용하면 static 변수(클래스 변수), static 메소드라 지칭
	- 멤버 변수나 멤버 메소드는 해당 객체가 생성될 때 heap(메모리) 영역에 존재
	- static으로 선언된 필드, 메소드는 static 영역에 유일하게 만들어지면서 모든 객체들이 사용할 수 있는 공유 개념을 가지기 때문
	- 객체를 생성하지 않더라도 사용할 수 있음
	- 클래스명.변수명 또는 클래스명.메소드명 으로 접근 가능
	static 메소드 선언
	[접근제한자] static 반환형 메소드명(자료형 인자1, 자료형 인자2, ... ) {}
	static 필드(멤버 변수) 선언
	[접근제한자] static 자료형 변수명;
*/
class Study {
	int x; // 멤버 변수 (객체를 생성해야만 접근 가능)
	static int y; // 클래스 변수 (객체를 생성하지 않고도 접근 가능)
}

public class Study005 {
	public static void main(String[] args) {

		System.out.println(Study.y); // 클래스 변수는 초기화를 하지 않을 경우 자동으로 0으로 초기화
		Study.y = 100;
		System.out.println(Study.y);
		Study st = new Study();
		System.out.println(st.x);
		System.out.println(st.y);
	}
}