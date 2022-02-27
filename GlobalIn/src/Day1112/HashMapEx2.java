package Day1112;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", new Integer(90));
		map.put("이순신", new Integer(100));
		map.put("이기자", new Integer(60));
		map.put("자바다", new Integer(100));
		System.out.println(map);
		// 키와 값을 set 형태로 저장(HashMap을 이용할 때 key와 value를 묶어주기 위해서 entry를 이용함)
		// 맵의 엔트리 (키와 값은 한 쌍<페어>)
		// Map.entrySet 메소드는 현재 클래스에 속하는 요소를 가지는 맵의 컬렉션 뷰를 리턴
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		// 맵 엔트리의 참조값을 취득하는 유일한 방법은 반복자 이용
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("이름 : " + e.getKey() + "점수 : " + e.getValue());
		}
		Set set2 = map.keySet(); // 키 값만 set에 저장
		System.out.println("응시자 명단 : " + set2);
		Collection<Integer> v = map.values(); // 값을 컬렉션에 저장
		Iterator<Integer> it2 = v.iterator();
		// 점수 합 구하기
		int total = 0;
		while(it2.hasNext()) {
			Integer i = it2.next();
			total += i;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set2.size());
		System.out.println("최고 점수 : " + Collections.max(v));
		System.out.println("최저 점수 : " + Collections.min(v));
	}
}