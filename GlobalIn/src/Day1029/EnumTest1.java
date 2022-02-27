package Day1029;

enum Color {
	Red, Green, Blue
}

public class EnumTest1 {

	private Color myColor = Color.Red;
	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public static void main(String[] args) {
		EnumTest1 ob = new EnumTest1();
		ob.setMyColor(Color.Green);
		Color color = ob.getMyColor();
		switch(color) {
		case Red :
			System.out.println("Red");
			break;
		case Green :
			System.out.println("Green");
			break;
		case Blue :
			System.out.println("Blue");
			break;
		}
	}
}