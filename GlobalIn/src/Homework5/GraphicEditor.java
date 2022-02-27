package Homework5;

abstract class Shape {
	public abstract void draw();
}

class Line implements Shape2 {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect implements Shape2 {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle2 implements Shape2 {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class GraphicEditor {

}
