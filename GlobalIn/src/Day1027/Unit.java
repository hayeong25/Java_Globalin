package Day1027;

public abstract class Unit { // 추상 클래스 선언

	int x, y;
	// 추상 메소드 정의
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}