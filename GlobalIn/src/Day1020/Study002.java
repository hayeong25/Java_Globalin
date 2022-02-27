package Day1020;

	// 메소드의 오버로딩을 활용해 사각형의 넓이, 원의 넓이를 구하시오

public class Study002 {

	public int area(int w, int h) {
		return w * h;
	}
	public double area(int r) {
		return (double)r * r * 3.141592;
	}
	public void write(int result) {
		System.out.println("사각형의 넓이 : " + result);
	}
	public void write(double result) {
		System.out.println("원의 넓이 : " + result);
	}
	public static void main(String[] args) {

		Study002 sd = new Study002();
		int re = sd.area(10, 5);
		double ci = sd.area(10);
		sd.write(re);
		sd.write(ci);
	}
}