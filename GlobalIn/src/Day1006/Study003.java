package Day1006;

public class Study003 {

	// char 자료형의 배열에 알파벳 대문자를 채우고 채워진 배열의 전체 요소를 출력하는 프로그램을 구현하시오. 단, char 자료형의 배열을 구성하는 과정에서는 반복문 이용
	public static void main(String[] args) {

		char a[] = new char[26];
		int i;
		/* 
		 int b;
		 for(i = 0, b = 65; i < 26; i++, b++) {
			a[i] = (char)b;
			System.out.print(a);
		}
		*/
		for(i = 0; i < a.length; i++) {
			a[i] = (char)('A' + i);
		}
		for(i = 0; i < 26; i++) {
			System.out.print(a[i] + " ");
		}
	}
}