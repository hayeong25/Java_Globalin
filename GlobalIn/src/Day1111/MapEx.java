package Day1111;

import java.util.HashMap;
import java.util.Set;

import static java.lang.System.out;

public class MapEx {

	public static void main(String[] args) {
		String[] msg = {"Berlin", "Dortmund", "Frankfurt", "Gelsenkirchen", "Hamburg"};
		// HashMap 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < msg.length; i++) {
			map.put(i, msg[i]); // 맵에 저장
		}
		Set<Integer> keys = map.keySet();
		for(Integer n : keys) {
			out.println(map.get(n)); // 맵에서 읽어옴
		}
	}
}