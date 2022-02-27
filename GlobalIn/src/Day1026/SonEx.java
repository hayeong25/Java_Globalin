package Day1026;

/*
	다형성
	- 한 타입의 참조 변수로 여러 타입의 객체를 참조할 수 있도록 하는 것
	- 부모 클래스 타입의 참조 변수로 자식 클래스의 인스턴스를 참조할 수 있도록 함
	class Super {
	int a;
	void test()
	}
	기존의 선언 및 생성
	Super super = new Super();
	Sub sub = new Sub();
	class Sub {
	int b;
	void test2();
	}
	다형성 선언 및 생성
	Super s = new Sub();
	sub1		sub2		sub3
	int b;	int b;	int b;
	test();	test();	test();
	Super s1 = new Sub1();
	Super s2 = new Sub2();
	Super s3 = new Sub3();
*/

class ParentEx { // 부모 클래스
	int foo = 5;
	public int getNumber(int a ) {
		return a + 1;
	}
}


public class SonEx extends ParentEx { // 자식 클래스

	int foo = 7;
	@Override
	public int getNumber(int a ) {
		return a + 2;
	}
	public static void main(String[] args) {

		ParentEx pe = new SonEx();
		System.out.println(pe.getNumber(0)); // 결과 2
		System.out.println(pe.foo); // 결과 5
	}
}