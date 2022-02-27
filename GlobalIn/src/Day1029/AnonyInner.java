package Day1029;

abstract class TestAbst {
	int data = 10000;
	public abstract void printData(); // 추상 메소드
}

public class AnonyInner {

	TestAbst inn = new TestAbst() {

		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
	}
}