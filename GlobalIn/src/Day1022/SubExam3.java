package Day1022;

public class SubExam3 extends SuperExam3 {

	protected int b = 100;
	public void print() {
		System.out.println("Sub print 메소드 : " + super.b + " : " + c);
	}
	@Override
	public void write() {
		System.out.println("Sub write 메소드 : " + super.b + " : " + c);
	}
}