package Day1022;

public class AClass {

	protected int x, y;
	protected char ch;
	public AClass() {
	}
	public void write(double result) {
		System.out.printf("%d %c %d = %.2f\n", x, ch, y, result);
	}
}