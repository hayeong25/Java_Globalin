package Day1111;

import java.util.Vector;

/*
	Object가 무한 배열로 추가 가능
	동일한 클래스 내에서 효율적
*/

class AA {
	int a;
	public AA(int a) {
		this.a = a;
	}
}

public class VectorEx {
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add(new AA(10)); // vc 0
		vc.add(new AA(20));
		vc.add(new AA(30));
		vc.add(new AA(10));
		vc.add(new AA(40));
		vc.add(new AA(50));
		vc.add(new AA(15));
		for (int i = 0; i < vc.size(); i++) {
			AA ap =(AA)vc.elementAt(i);
			System.out.println(ap.a);
		}
	}
}