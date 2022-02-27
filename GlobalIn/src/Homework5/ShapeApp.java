package Homework5;

class Circle implements Shape2{
	
	int r;
	
	public Circle(int r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.print("반지름 " + r + " ");
	}

	@Override
	public double getArea() {
		return r * r * PI;
	}
}

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape2 coin = new Circle(10); // 반지름이 10인 코인 객체 생성
		coin.redraw(); // 코인 다시 그리기
		System.out.println("코인의 면적은 " + coin.getArea());	
	}	
}