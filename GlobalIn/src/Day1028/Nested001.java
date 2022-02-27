package Day1028;

/*
	중첩 클래스
	- 클래스 안에 다른 클래스가 선언되는 형태로, 클래스 내부에서만 사용할 보조 클래스가 필요한 경우 클래스를 중첩하여 프로그램의 구조를 보다 더 간단하고 알아보기 쉽게 할 수 있다
	- 특정 클래스를 자신의 클래스 내부적인 용도로만 사용함을 목적으로 쓰이는 특정 클래스를 마치 자신의 멤버 변수나 메소드처럼 사용할 수 있다
	중첩 클래스 종류(4가지)
	1. static 중첩 클래스(중첩 내부클래스)
		- 클래스 내부에 [public static class 클래스명]
		- 중첩 클래스를 감싸는 외부 클래스의 { } 안에 static 을 붙인 새로운 클래스를 설계하는 것으로 모든 접근제어지시자를 사용할 수 있다
		- static 중첩 클래스가 포함하고 있는 메소드에서는 외부 클래스의 인스턴스 변수나 인스턴스 메소드에는 접근할 수 없고 (외부 클래스의 객체를 생성하지 않은 상태) 클래스 변수와 클래스 메소드만 접근할 수 있다.
		- 프로그램의 구조를 보다 더 간단하고 알아보기 쉽게 구성할 수 있다
		- static 으로 선언된 내부 클래스이다.
      	- 중첩 클래스의 객체는 중첩 클래스를 포함하고 있는 외부 클래스의 객체와 동등하다.
      	- 외부 클래스의 클래스 변수와 클래스 메소드는 바로 접근하여 사용하는 것이 가능하다.
      	- 중첩 클래스와 중첩 클래스를 포함하고 있는 외부 클래스의 인스턴스 변수와 인스턴스 메소드는 객체를 생성하여 서로 접근하는 것이 가능하다.
      	- 중첩 클래스를 외부에서 단독으로 사용 가능하다.

*/

class Test { // 외부 클래스
	static int a = 10;
	int b =20;
	// 중첩 내부 클래스
	public static class StaticNested {
		int c = 30;
		// 내부 클래스 메소드
		void write() {
			System.out.println("내부 클래스의 write().....");
			System.out.println("a : " + a);
			// System.out.println("b : " + b); 인스턴스는 메모리 할당 전이라 에러 발생
			// StaticNested 클래스가 메모리를 할당 받았다고 해서 Test 클래스의 인스턴스 변수 b가 메모리를 할당 받았다는 보장이 없다
			System.out.println("c : " + c);
		}
	}
	// 외부 클래스 메소드
	void print() {
		StaticNested x = new StaticNested();
		x.write();
	}
}

public class Nested001 {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		// StaticNested t2 = new StaticNested();
		// 중첩 내부 클래스는 외부에서 단독으로 객체 생성
		Test.StaticNested t3 = new Test.StaticNested();
		t3.write();
	}
}