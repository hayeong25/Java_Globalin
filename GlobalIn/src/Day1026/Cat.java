package Day1026;

public class Cat extends Animal {

	private String name;
	public Cat() {
		name= getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}
	@Override
	public String scream() {
		return "야옹";
	}
}