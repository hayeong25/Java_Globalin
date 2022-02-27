package Day1027;

public class SiegeTank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SiegeTank => x : " + x + ", y : " + y);
	}

	@Override
	void stop() {
		System.out.println("Destination??");
	}

	@Override
	void message() {
		System.out.println("Message :: Go, Siege!!!");
	}

	void changeMode() {
		System.out.println("Yes Sir!!!");
	}
}