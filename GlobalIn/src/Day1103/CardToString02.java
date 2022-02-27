package Day1103;

class Card_ {
	String kind;
	int number;
	Card_() {
		this("SPADE", 1);
	}
	Card_(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		// Card인스턴스의 kind와 number를 문자열로 반환한다.
		return "kind : " + kind + ", number : " + number;
	}
}
public class CardToString02 {
	public static void main(String[] args) {
		Card_ c1 = new Card_("HEART", 10);
		Card_ c2 = new Card_();
		System.out.println(c1.toString());
		System.out.println(c2);
	}
}