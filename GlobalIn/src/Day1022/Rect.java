package Day1022;

public class Rect extends SuperExam2{

	private int w, h;
	public Rect() {
	}
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area = this.w * this.h;
		write();
	}
	@Override
	public void write() { // 오버라이딩
		System.out.println("w :" + w + ", h : " + h);
		System.out.println("사각형 : " + area);
	}
}