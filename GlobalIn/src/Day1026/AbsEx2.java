package Day1026;

public class AbsEx2 extends AbsEx1 {

	@Override
	public int getA() { // 부모 클래스의 추상 메소드를 재정의한 것
		return a;
	}
	public String getStr() {
		return null;
	}
}