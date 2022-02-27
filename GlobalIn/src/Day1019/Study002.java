package Day1019;

public class Study002 {

	// 오버로딩
	public void print() { // 파라미터 無. 오버로딩 아님
		System.out.println("인자가 없는 메소드");
	}
	public void print(int val) { // 파라미터 有. 오버로딩
		System.out.println("int형 인자가 있는 메소드");
	}
	public void print(long val) { // 파라미터 有. 오버로딩
		System.out.println("long형 인자가 있는 메소드");
	}
	public void print(short val) { // 파라미터 有. 오버로딩
		System.out.println("short형 인자가 있는 메소드");
	}
	public void write() {

	}
	public void write(short val) {
	}
	public void write(int val) {
	}
	public void write(long val) {
	}
	public void write(double val) {
	}	
	public static void main(String[] args) {
		Study002 oo = new Study002();
		short s = 10;
		int i = 10;
		long l = 10;
		oo.print();
		oo.print(s);
		oo.print(l);
		oo.print(i);
		oo.write();
		oo.write(s);
		oo.write(l);
		oo.write(i);
	}
}