package Day1027;

public class InterfaceEx implements InterEx {

	@Override
	public int get() {
		return A;
	}

	public static void main(String[] args) {

		InterfaceEx if1 = new InterfaceEx();
		System.out.println("getA() : " + if1.get());
	}

}