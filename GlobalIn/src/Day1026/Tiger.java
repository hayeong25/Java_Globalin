package Day1026;

public class Tiger extends Animal{

	private String name;
	public Tiger() {
		name= getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}
	@Override
	public String scream() {
		return "어흥";
	}
}