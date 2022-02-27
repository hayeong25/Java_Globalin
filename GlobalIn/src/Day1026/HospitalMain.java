package Day1026;

public class HospitalMain {

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		// 다형성을 이용해 객체 생성
		// 부모 클래스는 Animal
		Animal dog = new Dog();
		Animal cat= new Cat();
		Animal tiger = new Tiger();
		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
	}
}