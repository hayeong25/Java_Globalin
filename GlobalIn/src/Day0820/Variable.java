package Day0820;

/* 변수
 * - 데이터를 보관하는 저장소
 * - 메모리의 한 공간이다.
 * int a = 20 : 연산자를 중심으로 오른쪽의 값의 왼쪽에 할당한다
 * - 자바의 변수는 데이터 타입(자료형)과 함께 선언하고 초기화 한 수 사용
 * - 변수의 타입 다음에 변수의 이름을 적어서 선언한다 
 */

class Add { // 더하기
	int a;
	public void add() {
		int a, b, c;
		a=10; b=20;
		c=a+b;
		System.out.printf("%d+%d=%d\n", a, b, c);
	}	
}

class Sub { //빼기
	public void sub() {
		int a, b, c;
		a=10; b=20;
		c=a-b;
		System.out.printf("%d-%d=%d\n", a, b, c);
	}
}

class Mul { // 곱하기
	public void mul() {
		int a, b, c;
		a=10; b=20;
		c=a*b;
		System.out.printf("%d*%d=%d\n", a, b, c);
	}
}

class Div{ // 나누기
	public void div() {
		int a, b;
		a=10; b=20;
		float c = a / b;
		System.out.printf("%d / %d=%7.3f\n", a, b, c);
	}
}


class Bbbb {
	public void bb() {
		System.out.println("나는 BB다");
	}
}

class Aaaa {
	public void aa() {
		System.out.println("나는 AA다");
	}
}

public class Variable {

	public static void main(String[] args) {
		
		Add a = new Add();
		a.add(); // 더하기
		System.out.println();
		Sub b = new Sub();
		b.sub(); // 빼기
		Mul c = new Mul();
		c.mul(); // 곱하기
		Div d = new Div();
		d.div(); // 나누기
		System.out.println();
		System.out.println(a);
		Aaaa aa = new Aaaa();
		aa.aa();
		Bbbb bb = new Bbbb();
		bb.bb();
		
		System.out.println("나는 메인이다");

	}
	
}