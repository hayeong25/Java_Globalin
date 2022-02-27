package Day1111;

import java.util.*;

public class VectorEx3 {
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "주황", "연두"};
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		for (String str : colors) {
			v.add(str);
		}
		System.out.println("첫 번째 요소 : " + v.firstElement());
		// 첫 번째 요소를 "흰색"으로 변경
		v.set(0, "흰색");
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("요소 개수 : " + v.size());
		// 첫 번째 요소에 "빨강" 추가
		v.insertElementAt("빨강", 0);
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("요소 개수 : " + v.size());
		// 전체 출력
		System.out.println("==전체 출력==");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		// 오름차순
		Collections.sort(v);
		System.out.println("-- 오름차순 정렬 후 --");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		// 검색
		int idx = Collections.binarySearch(v, "검정");
		// 검색은 오름차순 정렬된 후에 찾을 수 있음
		System.out.println("검정 : " + idx + " index에 위치되어 있음");
		// 내림차순
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("-- 내림차순 정렬 후 --");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		// 내림차순 후의 검색
		idx = Collections.binarySearch(v, "검정", Collections.reverseOrder());
		System.out.println("검정 : " + idx + " index에 위치되어 있음");
	}
}