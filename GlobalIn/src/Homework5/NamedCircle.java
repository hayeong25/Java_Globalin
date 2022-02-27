package Homework5;

class circle {
	
	private int radius;
	
	public circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
}

public class NamedCircle extends circle {

	String name;
	
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name = name;
	}
	
	public void show() {
		System.out.println(name + ", 반지름 = " + getRadius());
	}
	
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}
