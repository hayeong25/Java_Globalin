package Day1020;

/*
	this와 this()
	- this : 특정 객체 내에서 자신이 생성되었을 때의 주소 값 변수
	- 객체의 주소는 생성 전까지는 모르기 때문에 객체 생성 후 자신의 주소로 대체됨
	- this() : 현재 객체의 생성자
	- 생성자 안에서 오버로딩 된 다른 생성자를 호출할 경우, this() 키워드로 호출
*/

public class Study004 {

	String name, jumin, tel;
	public Study004() {
		this.name = "Guest";
		this.jumin = "123456-1234567";
		this.tel = "010-1234-1234";
	}
	public Study004(String name) {
		this();
		this.name = name;
	}
	public Study004(String name, String jumin) {
		this(name);
		this.jumin = jumin;
	}
	public Study004(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}
	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() {
		return tel;
	}

	public static void main(String[] args) {

		Study004 st = new Study004();
		System.out.println("Name : " + st.getName());
		System.out.println("Jumin : " + st.getJumin());
		System.out.println("Tel : "+st.getTel());
	}
}