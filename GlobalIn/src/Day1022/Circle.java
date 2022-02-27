package Day1022;

public class Circle extends SuperExam2 {

	public Circle(String title) {
		super(title);
	}
	public void calc(int r) {
		area = r * r * 3.14;
		write();
	}	
}