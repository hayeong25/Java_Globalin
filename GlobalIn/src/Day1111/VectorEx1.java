package Day1111;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {

	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	public static void main(String[] args) {
		int i;
		String str;
		Vector v = new Vector();
		// 데이터 벡터에 추가
		for (i = 0; i < colors.length; i++) {
			v.add(colors[i]);
		}

		str = (String)v.firstElement();
		System.out.println("첫 번째 요소 : " + str);
		str = (String)v.get(1);
		System.out.println("두 번째 요소 : " + str);
		str = (String)v.lastElement();
		System.out.println("마지막 요소 : " + str);
		
		System.out.println("\n 전체 출력");
		Iterator it = v.iterator();
		while(it.hasNext()) {
			str = (String)it.next();
			System.out.println(str + " ");
		}
		System.out.println();
	}
}