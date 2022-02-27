package Day1023;

/*
	Super
	- 부모 객체의 레퍼런스
	- 부모 클래스의 멤버와 자손 클래스의 멤버가 중복 정의되어 서로 
*/

class Super {
	int a = 5;
}

class Sub extends Super {
	int a = 10;
	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class SuperExam001 {

	public static void main(String[] args) {

		Sub s = new Sub();
		s.test();
	}
}