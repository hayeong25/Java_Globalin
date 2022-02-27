package Homework5;

interface Shape2 {

	final double PI = 3.14; // 상수
	
	void draw(); // 추상 메소드
	
	double getArea(); // 추상 메소드
	
	default public void redraw() { // 코드가 작성된 디폴트 메소드
		System.out.println("---다시 그립니다---");
		draw();
	}
	
}
