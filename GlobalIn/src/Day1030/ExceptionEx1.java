package Day1030;

/*
	예외 처리
	- 프로그램 실행 시 발생할 수 있는 예외 발생에 대한 예비 코드를 작성하는 것
	- 목적 : 프로그램의 비정상적인 종료를 막고, 정상적인 실행 상태를 유지하는 것
*/

public class ExceptionEx1 {

	public static void main(String[] args) {
		int number = 50;
		int result = 0;
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 5); // try catch 안 쓰면 예외 발생
				System.out.println(result);
			} catch(ArithmeticException ae) {
				// ArithmeticException 매개변수를 통해서 예외 전달
				ae.printStackTrace();
				System.out.println("계산 오류");
				}
		}
	}
}