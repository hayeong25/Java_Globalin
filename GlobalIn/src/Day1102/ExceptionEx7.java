package Day1102;

public class ExceptionEx7 {

	public static void main(String[] args) {
		method1();
	}
	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 메소드에서 예외 처리가 되었습니다.");
			e.printStackTrace();
		}
	}
}