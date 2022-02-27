package Day1029;

enum City {
	SEOUL("서울", 1000), BUSAN("부산", 350), DAEGU("대구", 250), INCHON("인천", 200);
	private final String cityName;
	private final int ingu;
	City(String cityName, int ingu) {
		this.cityName = cityName;
		this.ingu = ingu;
	}

	public String getCityName() {
		return cityName;
	}

	public int getIngu() {
		return ingu;
	}
}

public class EnumTest3 {

	public static void main(String[] args) {
		System.out.println("서울 인구 : " + City.SEOUL.getIngu());
		for(City c : City.values())
			System.out.printf("%s(%s) : %d%n", c, c.getCityName(), c.getIngu());
	}
}