package Day1026;

public class AbsEx extends AbsEx2 {

	public static void main(String[] args) {

		AbsEx ae = new AbsEx();
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
	}

	@Override
	public String getStr() { // AbsEx2 클래스의 추상 메소드를 재정의
		return str; // str은 AbsEx1 멤버 변수
	}
}