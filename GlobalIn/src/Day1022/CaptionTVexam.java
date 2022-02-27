package Day1022;

public class CaptionTVexam {

	public static void main(String[] args) {

		CaptionTV ct = new CaptionTV();
		ct.channel = 23; // 부모 클래스로부터 상속받은 멤버 변수
		ct.channelUp(); // 부모 클래스로부터 상속받은 멤버 메소드
		System.out.println(ct.channel);
		ct.displayCaption("이 채널은 연합 뉴스 채널."); // boolean caption 값이 false이기 때문에 이 문장은 출력 X
		ct.caption = true;
		ct.displayCaption("이 채널은 연합 뉴스 채널입니다."); // boolean caption 값이 true이기 때문에 이 문장이 출력됨
	}
}