package Day1029;

enum Operation {
	PLUS { double eval(double x, double y) {return x + y;}},
	MINUS { double eval(double x, double y) {return x - y;}},
	TIMES { double eval(double x, double y) {return x * y;}},
	DIVIDE { double eval(double x, double y) {return x / y;}};
	abstract double eval(double x, double y);
}

public class EnumTest2 {

	public static void main(String[] args) {
		double x = Double.parseDouble("10.2");
		double y = Double.parseDouble("20.2");
		System.out.println(Operation.PLUS.eval(x, y));
		for(Operation op : Operation.values())
			System.out.printf("%.1f %s %.1f = %.2f%n", x, op, y, op.eval(x, y));
	}
}