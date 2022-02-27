package Day1022;

public class SuperExam1 {

	protected double area;
	// protected : 하위 클래스, 동일 패키지에서만 접근 가능
	// private : 하위 클래스에서도 접근 불가(클래스 내에서만 사용 가능)
	public SuperExam1() {
		System.out.println("Super Class .............. ");
	}
	public void write(String title) {
		System.out.println(title + area);
	}
}