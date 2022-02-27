package Day1029;

/*
	4. 무명클래스 (익명 클래스, anonymous class)
	- 이름 없는 클래스
	- 클래스 또는 인터페이스에 대한 객체를 생성하면서 바로 클래스 또는 인터페이스를 정의하는 클래스.
	- 정의하는 부분과 생성하는 부분이 하나로 묶여져 new 수식이 있는 곳에서 바로 클래스 또는 인터페이스를 정의하는 것을 의미
	- awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
	- 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	- 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는 번거로움 때문에 익명의 클래스를 생성하여 처리

	- 클래스명$1.class 형태의 파일이 생성되며 $ 뒤의 숫자가 순차적으로 부여됨
	- 형식
	new 상위 클래스의 생성자()
	{
		접근제어 지시자 자료형 메소드() {
		}
	};
	>> 반드시 세미콜론 붙여야 한다
*/

class Test3 {
public Object getString() {

	// return ___;  ← Object
	// Object ob = new Object();
	// return ob;

	// return new Object();
	return new Object() {
		@Override
		public String toString() {
			return "익명의 클래스...";
		}
	};
}
}

public class Test004 {

	public static void main(String[] args) {
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		System.out.println(ob2.getString());
		//-- System.out.println(ob2.getString().toString()); 와 동일, toString()은 Object가 가진 메소드라 상속받아 불러와짐 
		//--==> Test3@6d06d69c
		//      익명의 클래스...
	}
}