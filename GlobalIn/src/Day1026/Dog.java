package Day1026;

public class Dog extends Animal {

	private String name;
	public String getName() {
		return name;
	}
	public Dog() {
		name= getClass().getSimpleName();
	}
	@Override
	public String scream() {
		return "멍멍 깨갱";
	}
}