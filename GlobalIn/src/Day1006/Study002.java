package Day1006;

public class Study002 {

	public static void main(String[] args) {

		char[] ch; // 문자형 배열 선언
		ch = new char[4];
		// 배열에 값 저장(JAVA)
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		// 값 지정 안 하면 초기화 null 값 (문자열이니까 null. 숫자는 0)
		// 배열 내용 출력
		for(int i = 0; i < 4; i++) {
			System.out.print(ch[i]);
		}
		System.out.print(ch[0]);
		System.out.print(ch[1]);
		System.out.print(ch[2]);
		System.out.print(ch[3]);
	}
}