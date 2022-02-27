package Day1104;

// clone() : 자신을 복제하여 새로운 인스턴스를 생성

// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 
// 이 인터페이스를 구현하지 않고 clone()을 호출하면 예외가 발생한다.
	class Point implements Cloneable {
		 int x;
		 int y;
	 public Point(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
	 @Override
	 public String toString() {
		 return "x= " + x + ", y= " + y;
	 }
	 @Override
	 public Object clone() {
 
		 Object obj = null;
		 try {
			 // clone메서드에는 CloneNotSupportedException이 선언되어 있으므로 이 메서드를 호출할 때는
			 // try-catch문을 사용해야한다.
			 obj = super.clone();
		 } catch (CloneNotSupportedException e) {}
		 return obj;
	 }
}
	public class CloneEx01 {
		public static void main(String[] args) {

			Point original = new Point(3, 5);
			Point copy = (Point)original.clone(); // 복제(clone)해서 새로운 객체를 생성
			System.out.println(original);
			System.out.println(copy);
	 }
}