package Homework6;

// 교재 279p 1번 문제

public class MyPoint {
	
	private int x, y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "MyPoint(" + x + ", " + y + ")";
	}

	public static void main(String[] args) {
		MyPoint a = new MyPoint(3,20);
		System.out.println(a); // a는 자동으로 a.toString()으로 변환됨
	}
}