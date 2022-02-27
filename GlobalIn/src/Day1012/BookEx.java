package Day1012;

public class BookEx {

	public static void main(String[] args) {
		// book에 대한 인스턴스 생성(객체)
		Book JAVA = new Book();
		JAVA.name = "명품자바 프로그래밍";
		JAVA.writer = "황기태";
		JAVA.isbn = "12345678";
		JAVA.price = 20000;
		// System.out.println(책 이름.toString());
		System.out.println(JAVA.toString());
		// System.out.println("책 이름 : " + JAVA.name));
		// System.out.println("책 이름 : " + JAVA.getName));
		Book DataBase = new Book();
		DataBase.name = "오라클 데이터베이스";
		DataBase.writer = "홍길동";
		DataBase.isbn = "987456123";
		DataBase.price = 30000;
		System.out.println(DataBase.toString());
	}
}