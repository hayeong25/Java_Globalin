package Day1113;

import java.util.*;

public class LinkedListEx {
	private static final String colors1[] = {"검정", "노랑", "녹색", "파랑", "주황", "연두"};
	private static final String colors2[] = {"초록", "빨강", "흰색", "남색", "보라"};
	public LinkedListEx() {
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		// colors1의 리스트1에 추가
		// colors2의 리스트2에 추가
		list1.addAll(list2); // 리스트1에 모든 데이터 저장되어 있음
		System.out.println(list1);
	}
	public static void main(String[] args) {
	}
}