package Day1106;

/*
	Wrapper 클래스
	- 기본 자료형을 객체화 시키는 클래스
	- byte >> Byte
	- short >> Short
	- long >> Long
	- float >> Float
	- double >> Double
	- int >> Integer
	- char >> Character
	- boolean >> Boolean
*/

public class WrapperEx1 {

	public static void main(String[] args) {
		byte a_min = Byte.MIN_VALUE;
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i == i2 : " + (i == i2));
		System.out.println("i.equals(i2) : " + i.equals(i2));
		System.out.println("i.compareTo(i2) : " + i.compareTo(i2));
		System.out.println("i.toString() : " + i.toString());
		System.out.println("i2.toString() : " + i2.toString());
		System.out.println();
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println();
		System.out.println("SIZE : " + Integer.SIZE + "bits");
		System.out.println("BYTES : " + Integer.BYTES + "bits");
		System.out.println("TYPE : " + Integer.TYPE);
		System.out.println();
	}
}