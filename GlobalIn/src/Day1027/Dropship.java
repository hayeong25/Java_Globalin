package Day1027;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Take it slow. Droshp => x : " + x + ", y : " + y);
	}

	@Override
	void stop() {
		System.out.println("In the by, by, by, by");
	}

	@Override
	void message() {
		System.out.println("Message :: Can I take ordes..");
	}
}