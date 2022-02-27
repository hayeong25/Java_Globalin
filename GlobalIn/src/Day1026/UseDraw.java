package Day1026;

public class UseDraw {

	public static void main(String[] args) {

		Diagram[] ref = new Diagram[3];

		ref[0] = new Triangle();
		ref[1] = new Circle();
		ref[2] = new Rectangle();
		for(int i = 0; i < ref.length; i++) {
			ref[i].draw();
		}	
	}
}