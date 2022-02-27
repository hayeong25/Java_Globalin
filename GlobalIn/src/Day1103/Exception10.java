package Day1103;

public class Exception10 {

	static void method1() throws Exception {
		try {
			System.out.println("method1()이 호출되었습니다.");
			// throw new Exception();  현재 실행 중인 메소드를 종료한다
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("method1 메소드에서 예외가 처리되었습니다.");
			// throw e;  다시 예외 발생 시킴
			// return 1;  catch 블럭 내에서 return문이 필요
			throw new Exception(); // return문 대신 예외를 호출한 메소드로 전달
		}
	}
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메소드에서 예외가 처리되었습니다.");
		}
	}
}