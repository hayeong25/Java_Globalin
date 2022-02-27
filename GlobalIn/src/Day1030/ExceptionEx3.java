package Day1030;

// finally를 포함한 예외

public class ExceptionEx3 {

	int ss[];
	public ExceptionEx3() {
		ss = new int[3]; // 멤버 필드 초기화
	}
	// 인스턴스 메소드 정의
	public void program() {
		for (int i = 0; i <= ss.length; i++) {
			System.out.println("for문의 시작 " + i + " 번째");
			try {
				System.out.println(ss[i]);
			} catch (Exception e) {
				System.out.println("Exception 발생 " + e);
				return;
			} finally {
				System.out.println("finally 영역");
			}
			System.out.println("for문의 끝 " + i + " 번째");
		}
	}
	public static void main(String[] args) {
		ExceptionEx3 ee = new ExceptionEx3();
		ee.program();
	}
}