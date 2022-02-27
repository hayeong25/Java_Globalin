package Day1021;

/*
	final 예약어
	- 더 이상의 확장이 불가능함을 알리는 종단(상수)과 같은 의미
	- 변수에 final 적용 시의 상수를 의미함
	- 메소드에 final 적용 시 오버라이딩으로의 확장 불가능
	- 클래스에 final 적용 시 더 이상의 상속 확장 불가능
*/

class FinalTest {

	public static final double PI; // 한 번만 초기화 가능
	// static : 클래스가 로딩되는 순간 메모리에 할당됨(객체 생성하지 않아도 언제든지 사용 가능)
	static {
		PI = 3.141592;
	}
	public double area; // 인스턴스 변수(멤버 변수)
	// 메소드에 final 키워드를 붙이면 오버라이딩 불가능
	// 클래스에 final 키워드를 붙이면 상속 불가능
	public void write(String title) {
		System.out.println(title + area);
	}
}

class Fi extends FinalTest {
	@Override
	public void write(String title) {
		super.write(title);
	}
}

public class FinalEx {

	public static void main(String[] args) {

		FinalTest ft = new FinalTest();
		// ft.PI = 3.0f; >>  final 붙어서 PI 수정 불가
		ft.area = 10.0 * 10.0 * FinalTest.PI;
		ft.write("원의 넓이 : ");
	}
}