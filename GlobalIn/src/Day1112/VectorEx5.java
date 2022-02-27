package Day1112;

import java.util.Vector;

class MyData {
	public String name;
	public int age;
	public MyData() {
		name = "";
		age = 0;
	}
	public MyData(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class VectorEx5 {
	public static void main(String[] args) {
		Vector<MyData> v = new Vector<MyData>();
		v.add(new MyData("가길동", 27));
		v.add(new MyData("나길동", 23));
		v.add(new MyData("다길동", 20));
		// 출력
		for(MyData ob : v) {
			System.out.printf("이름 : %s, 나이 : %d\n", ob.name, ob.age);
		}
	}
}