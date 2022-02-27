package Day1102;

/*
	throws 예약어 : 예외 전가
	- 자신을 호출한 메소드로 exception 처리를 위임
	형식
	[접근제한자] 반환형 메소드명(인자1, 인자2, ... ) throws 예외 클래스1, 예외 클래스2, ...
*/

public class ExceptionEx4 {

	private static void test() throws Exception {
		System.out.println(3/0);
	}
	public static void main(String[] args) throws Exception {
		test();
		/*
			try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}
}