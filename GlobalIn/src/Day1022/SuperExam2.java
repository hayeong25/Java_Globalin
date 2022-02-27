package Day1022;

public class SuperExam2 {

	protected double area;
	private String title;
	public SuperExam2() {
	}
	public SuperExam2(String title) {
		this.title = title;
	}
	public void write() {
		System.out.println(title + area);
	}
}