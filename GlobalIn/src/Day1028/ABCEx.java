package Day1028;

/*
	instanceof 예약어
	- 예약어를 중심으로 왼쪽의 객체가 오른쪽에 명시한 클래스로 형변환이 가능한지 알게 하는 예약어
	- 비교객체이름	instanceof		비교클래스명(클래스타입)
*/

class AClass {
}

interface CInter{
}

class BClass extends AClass implements CInter {
}

public class ABCEx {

	public static void main(String[] args) {

		BClass bp = new BClass();
		System.out.println(bp instanceof Object);
		System.out.println(bp instanceof AClass);
		System.out.println(bp instanceof BClass);
		System.out.println(bp instanceof CInter);
	}
}