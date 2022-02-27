package Day1023;

/*
	메소드 오버라이딩(Method Overriding)의 특징
	- 메소드 이름, 리턴 타입(반환형), 파라미터 수나 타입이 완전 일치해야 함
	- 반드시 상속 관계가 있어야 한다
	- 재정의 된 하위 클래스의 메소드 접근제어 지시자는 상위 클래스 메소드의 접근 제어 지시자보다 범위가 크거나 같아야 한다
	ex)
	- 상위 클래스의 메소드의 접근제어 지시자가 protected인 경우
	- 하위 클래스가 이 메소드를 오버라이딩 할 때 접근제어 지시자는 protected 또는 public이어야 한다
	- 단, static, final, private 메소드는 오버라이딩 대상이 될 수 없다
	- 즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에 새로운 exception 추가 불가능
*/

// Super class (부모 클래스)
class SuperEx {

	private int a = 5;
	protected int b =10;
	public int c = 20;
	int d = 150; // default 접근제어 지시자(변경자)
	public void write() {
		System.out.println("SuperEx write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// Sub class (자식 클래스)
class SubEx extends SuperEx {
	protected int b = 300;
	public void print() { // Sub의 멤버 메소드
		// System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		// 슈퍼 클래스에서 선언된 변수 a에 접근 불가. 접근제어 지시자가 private이기 때문
		System.out.println("Sub print() 메소드 : " + super.b + " : " + c);
		// 슈퍼 클래스에서 선언된 변수 b에 접근하기 위해서는 변수 앞에 super 키워드를 같이 사용해야 한다
		// 슈퍼 클래스에 선언된 변수 c에 접근하는 데에는 아무런 제약사항이 없다
	}
	@Override
	public void write() { // 메소드 안에 수행문을 수정하여 처리 (재정의)
		System.out.println("Sub write() 메소드 : " + b + " : " + c);
		// 접근제어 지시자가 private이기 때문에 슈퍼 클래스에서 선언된 변수 a에는 접근할 수 없다
	}
}

public class Test001 {
	public static void main(String[] args) {
		SubEx se = new SubEx();
		se.write(); // 300 20
		se.print(); // 10 20
		System.out.println(se.b); // 300
		System.out.println(((SuperEx)se).b);
	}
}