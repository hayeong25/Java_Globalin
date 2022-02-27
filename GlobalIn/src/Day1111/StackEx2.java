package Day1111;

import java.util.*;

public class StackEx2 {
	// 문자 배열을 선언하고 초기화
	private static final String[] Colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	public StackEx2() {
		// Stack 인스턴스 생성
		Stack<String> st = new Stack<String>();
		// 스택에 데이터 추가
		for (String color : Colors) {
			st.push(color);
		}
		// 데이터 출력
		popStack(st);
	}
	public void popStack(Stack<String> st) {
		System.out.println("pop : ");
		while(!st.empty()) {
			System.out.println(st.pop() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		new StackEx2();
	}
}