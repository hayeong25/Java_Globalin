package Day1029;

/*
	열거형(열거체)
	- 상수를 하나의 객체로 인식하고 여러 개의 상수 객체들을 한 곳에 모아둔 하나의 묶음(객체)
	열거형의 구성
	- [접근제한자] enum [열거형 명] {
		상수1, 상수2, 상수3, ... , 상수N
		}
*/

public class EnumEx1 {

	public enum Lesson {
		JAVA, DataBase, HTML, CSS, JAVAscript, AJAX, JSP, Servlet, SpringFrameWork, BigData
	}

	public static void main(String[] args) {
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : " + le);
		System.out.println("AJAX :" + Lesson.AJAX);
		Lesson[] les = Lesson.values();
		for(Lesson l : Lesson.values())
			System.out.println(l + " : " + l.ordinal());
	}
}