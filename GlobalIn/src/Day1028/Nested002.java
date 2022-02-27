package Day1028;

/*
	2. 내부 클래스(inner class)
		- 클래스 내부에... 『public class 클래스명』
    	- static 중첩 클래스와 마찬가지로 프로그램 구조를 보다 더 간단하고 알아보기 쉽도록 할 수 있다.
       	- 외부 클래스의 메소드에서 내부 멤버 클래스를 사용하기 위해서는 반드시 내부 멤버 클래스 객체를 생성해 주어야 한다.
       	- 외부 클래스의 멤버 변수와 메소드를 객체 생성 없이 바로 사용하는 것이 가능하다.
       	- 내부 멤버 클래스는 외부에서 단독으로 객체를 생성하여 사용할 수 없다. 즉, 내부 멤버 클래스는 외부 클래스의 인스턴스 생성이 선행되어야 한다는 것이다.
	  	- static으로 선언된 변수 또는 메소드를 가질 수 없다.
*/

class Test2 {
	static int a = 10; // 전역변수 멤버변수 static변수(클래스변수)
	int b =20;				// 전역변수 멤버변수 인스턴스 변수
	// 첫 번째 write() 메소드
	void write() {
		System.out.println("write()........1");
		final int c = 30; // 지역변수
		int d = 40;
		//변수 c, d는 둘 다 지역변수지만, c는 final 변수이기 때문에 두 번째 write() 메소드에서 언제 접근하더라도 고정된 값을 보장받을 수 있기 때문에 접근 가능
		//d는 그 값이 수시로 변동될 수 있는 상황이므로 LocalTest 클래스의 인스턴스 생성 시점을 보장 받을 수 없기 때문에 d에 접근하는 것은 피해야 한다
		class LocalTest {
			// 두 번째 write() 메소드
			void write() {
				System.out.println("write()........2");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				System.out.println("d : " + d);
			}
		}
		// 첫 번째 write() 메소드에서 인스턴스 생성
		LocalTest ob1 = new LocalTest();
		ob1.write();
	}
}

public class Nested002 {

	public static void main(String[] args) {
		Test2 ob2 = new Test2();
		ob2.write(); // 첫 번째 write()
	}
}