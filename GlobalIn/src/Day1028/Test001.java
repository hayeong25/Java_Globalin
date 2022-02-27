package Day1028;

/*
	업캐스팅, 다운캐스팅이 정상적인 경우
	1. 하위 객체 생성
	2. 상위 = 하위; // 업캐스팅
	3. 하위 = 상위; // 에러 발생
	4. 하위 = (하위)상위; // 다운캐스팅
	다운캐스팅이 안 되는 경우
	1. 상위 객체 생성
	2. 하위 = 상위; // 에러 발생
	3. 하위 = (하위)상위; // 다운캐스팅, 에러 발생(런타임 에러)
	업캐스팅은 항상 가능, 다운캐스팅은 경우에 따라 가능
*/

// 슈퍼 클래스(상위)
class SuperTest {
	int a = 10, b = 20;
	void write() {
		System.out.println("슈퍼클래스 write() 메소드");
	}
	int hap() {
		return a + b;
	}
}

// 서브 클래스(슈퍼 클래스를 상속받은 클래스) 하위
class SubTest extends SuperTest {
	int b = 100, c = 200;
	@Override
	int hap() {
		return a + b + c;
	}
	void print() {
		System.out.println("서브클래스 print() 메소드... ");
	}
}

public class Test001 {

	public static void main(String[] args) {

		// 서브클래스 인스턴스 생성
		SubTest ob1 = new SubTest();
		System.out.println("ob1.b : " + ob1.b);
		// 업캐스팅
		SuperTest ob2 = ob1;
		// SuperTest ob2 = (SuperTest)ob1;
		System.out.println("ob2.b : " + ob2.b); // ob2.b는 20
		// 변수는 객체별로 따로 할당되므로 변수 b는 ob2의 변수
		System.out.println("합계 : " + ob2.hap()); // 결과 310
		// hap() 메소드는 오버라이딩 되어 있고 ob2는 ob1을 업캐스팅한 상태이므로 SuperTest의 hap() 메소드를 호출하는 것이 아니라 SubTest의 hap() 메소드를 호출한 것
		// 즉, 메소드는 업캐스팅 되더라도 원래의 것이 나온다
		ob2.write();
		// 슈퍼클래스 write() 메소드
		// 호출이 정상적으로 이루어지고 있다 (슈퍼클래스의 메소드)
		// ob2.print(); 는 에러 발생 >> 다운캐스팅이 필요
		// 다운캐스팅
		((SubTest)ob2).print(); // 서브클래스 print() 메소드
		// 다운캐스팅이 안 되는 경우
		SuperTest parent = new SuperTest();
		SubTest child;
		// System.out.println(parent.c); 에러 발생
		// 상위 객체는 하위 객체의 멤버로 접근 불가능
		// child = parent; 에러 발생
		// 상위 객체는 하위 객체에 넣을 수 없다(참조 불가능)
		child = (SubTest)parent; // 런타임 에러 발생
		// 현재 SubTest 객체가 메모리 할당이 되지 않은 상태이기 때문에 다운캐스팅 불가능
		System.out.println(child.b);
	}
}