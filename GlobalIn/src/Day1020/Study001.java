package Day1020;

/*
 	메소드 오버로딩
 	- 하나의 클래스에서 같은 이름을 가진 메소드가 여러 개 정의되는 것
 	- 같은 이름의 메소드에 인자(매개변수, 파라미터)가 다른 것
 	- 매개변수가 다르다는 것은 개수가 다르거나, 자료형이 다르거나, 매개변수의 순서가 다르다는 것을 의미함
 	- 같은 목적으로 비슷한 동작을 수행하는 메소드들을 모아 이름을 같게 만들어 일관성을 유지하는데 의미를 둔다
 	- 접근제한자		반환형		메소드명 (자료형 인자, 자료형 인자, ... )
 	- 메소드명은 반드시 동일. 자료형 인자는 반드시 다르게 정의해야 함
 	- 접근제한자는 총 4가지
 */

public class Study001 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	private int getLength(String str) {
		System.out.println("입력한 값의 길이 : " + str.length());
		return 0;
	}
	public static void main(String[] args) {

		// 인스턴스 생성
		Study001 sd = new Study001();
		sd.getLength(1000);
		sd.getLength(3.14f);
		sd.getLength("10000");
	}
}