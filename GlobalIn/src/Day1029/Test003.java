package Day1029;

/*
	3. 지역 클래스(로컬 클래스, local class)
	- 메소드 내부에 [public class 클래스명] 또는 [public static class 클래스명] 선언
	- 클래스의 메소드 안에서 클래스를 정의하는 것으로 내부 멤버 클래스와 유사한 성격을 가지고 있긴 하지만 접근제어 지시자는 붙일 수 없다.

*/

class InnerOuterTest {
	static int a = 10;
	int b = 20;
	// 내부 클래스
	class InnerNested {
		int c = 30;
		// 내부 클래스의 메소드
		void write() {
			System.out.println("Inner의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}
	// 외부 클래스의 write() 메소드
	void write() {
		System.out.println("Outer의 write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();

	}
}
public class Test003 {

	public static void main(String[] args) {
		// 외부 클래스의 인스턴스 생성(객체 생성)
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();
		// 외부 클래스의 인스턴스를 사용하지 않고 단독으로 내부 클래스의 인스턴스 생성하는 것은 불가능
		/* 
			InnerNested ob3 = new InnerNested();	>> 불가능
			InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();	>> 불가능
		*/
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		// InnerOuterTest.InnerNested ob5 = new InnerOuterTest().new InnerNested(); 와 같은 구문
		ob5.write();

	}
}