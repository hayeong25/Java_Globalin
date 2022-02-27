package Day1022;

public class Child extends Parent {
	int age;
	public void write(int a) {
		this.age = a;
		System.out.println(super.age);
	}
}