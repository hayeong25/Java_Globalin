package Day1020;

/*
	생성자
	- 메모리 내에 객체가 생성될 때 호출되어 객체의 구조를 인식하게 하고 생성되는 멤버 변수들의 초기화를 하는 데 그 목적을 둔다
	- 생성자명은 클래스명과 같아야 하고 return 타입을 정의하면 안 된다
	- 프로그래머가 어떠한 생성자도 정의하지 않았을 경우, 컴파일러가 default 생성자를 자동으로 생성
	- 생성자에 인자 없는 생성자
	생성자의 접근 제한
	- 생성자의 접근 제한을 둘 경우, 해당 객체를 생성할 수 있는 접근 권한을 가진다
	- 클래서의 접근 제한이 public으로 정의되어도 생성자를 private로 정의하면 클래스 내부에서만 접근 가능
	- protected로 정의되는 클래스는 상속관계인 객체들만 생성할 수 있다
	생성자 구성
	[접근제한자] [생성자명](자료형 인자1, 자료형 인자2, ...) {
	수행문;
	수행문;
	}
	생성자 특징
	- 클래스명과 똑같다
	- 반환형을 명시할 수 없다
	- 클래스 내부에 생성자가 없을 때는 컴파일러가 자동으로 생성
	- 하나의 클래스에는 인자 수가 다르거나, 인자 자료형이 다른 생성자가 여러 개 존재할 수 있다 (생성자 오버로딩)
	- 생성자의 첫 번째 라인에서 this(인자) 생성자를 사용해서 다른 생성자를 호출할 수 있다
	생성자 오버로딩
	- 객체를 생성할 수 있는 방법의 수를 제공하는 것과 같으며 메소드의 오버로딩과 같다
	- 각 생성자를 구분 또는 인자로 구별
*/

public class Study003 {

	private String name;
	private int age;
	public Study003() {
		name = "무명";
	}
	public Study003(String n) {
		name = n;
	}
	public Study003(int a, String n) {
		age = a;
		name = n;
	}
	public Study003(String n, int a) {
		age = a;
		name = n;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Study003 st = new Study003();
		Study003 st2 = new Study003("아라치");
		Study003 st3 = new Study003("마루치", 36);
		Study003 st4 = new Study003(30, "빅자바");
		System.out.println(st.getName() + ", " + st.getAge()); // 초기화하지 않으면 age 값은 0
		System.out.println(st2.getName() + ", " + st2.getAge());
		System.out.println(st3.getName() + ", " + st3.getAge());
		System.out.println(st4.getName() + ", " + st4.getAge());
	}
}