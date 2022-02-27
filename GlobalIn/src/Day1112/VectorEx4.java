package Day1112;

// 검색 및 삭제

import java.util.*;

public class VectorEx4 {

	private static final String colors[] = {"검정", "노랑", "녹색", "파랑", "주황", "연두"};
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		for(String str : colors) {
			v.add(str);
		}
		// 전체 출력
		System.out.println("=== 전체 출력 ===");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		// 검색
		String s = "노랑";
		if(v.contains(s)) {
			int i = v.indexOf(s) + 1;
			System.out.println(s + "=> 위치 : " + i);
		}
		// 삭제
		v.remove(0);
		v.remove("파랑");
		System.out.println("=== 삭제 후 ===");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
}