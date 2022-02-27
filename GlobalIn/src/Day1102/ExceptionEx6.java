package Day1102;

public class ExceptionEx6 {

	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();
	}
	public static void main(String[] args) throws Exception {

		method1();
		// 같은 클래스 내의 static 멤버이므로 객체 생성 없이 직접 호출 가능
	}
}