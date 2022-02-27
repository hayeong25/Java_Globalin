package Day1030;

// 예외 처리 구문 실행 순서

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(3 / 0); // ArithmeticException 예외 발생
			System.out.println(4); // 출력 X
		} catch (Exception e) {
			System.out.println(5);
		} finally {
			System.out.println("JAVA"); // try catch 구문에 상관없이 실행되는 구문
		} 
		System.out.println(6);
	}
}