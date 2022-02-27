package Day1102;

/*
	예외 발생시키기
	throw 키워드
	1. 먼저 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체 생성
	2. 키워드 throw를 이용해 예외 발생시킴
*/

public class ExceptionEx5 {

	public static void main(String[] args) {

		try {
			Exception e = new Exception("고의로 예외를 발생 시킴");
			throw e;
			// throw new Exception("고의로 예외를 발생 시킴");
		} catch (Exception e) {
			System.out.println("에러 메시지 :" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 !!");
	}
}