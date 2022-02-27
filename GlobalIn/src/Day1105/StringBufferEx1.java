package Day1105;

/*
	StringBuffer
	- StringBuffer 클래스는 내부적으로 직접 변경이 가능한 클래스
	- 문자열의 변경이 자주 사용되는 객체일수록 StringBuffer 클래스 주로 사용
	Buffer란?
	- Buffer는 데이터를 한 곳에서 다른 한 곳으로 전송하는 데이터를 보관하는 메모리 영역
*/

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append(" 1.8");
		System.out.println(sb);
		sb.delete(5, 8);
		// 삭제하고자 하는 문자열을 시작 인덱스, 마지막 인덱스 사이의 문자열 삭제
		System.out.println(sb);
		sb.insert(5, "1.");
		System.out.println(sb);
		sb.replace(5, 7, "일점");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}