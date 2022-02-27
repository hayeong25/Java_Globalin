package Day1124;

import java.awt.*;

public class DialogEx extends Frame {
	public DialogEx() {
		super("대화상자");
		
		// 다이얼로그 객체를 생성하는데 소유권을 현재 프레임으로 지정하고 제목을 지정함
		Dialog d = new Dialog(this, "사용자 다이얼로그");
		WinEvent we = new WinEvent();
		d.addWindowListener(we);
		
		// 프레임 크기 지정
		setSize(200, 100);
		setVisible(true);
		
		// 다이얼로그 크기 지정
		d.setSize(200, 100);
		d.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DialogEx();
	}
}