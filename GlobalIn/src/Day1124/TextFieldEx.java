package Day1124;

import java.awt.*;

public class TextFieldEx {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("텍스트 필드");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		Panel p = new Panel();
		
		TextField tf1 = new TextField("아 이 디", 12);
		TextField tf2 = new TextField("비밀번호", 10);
		
		// 문자열 전체를 선택할 수 있는 selectAll 메소드
		tf1.selectAll();
		tf2.selectAll();
		
		// 반향 문자 지정
		tf2.setEchoChar('*');
		
		p.add(tf1);
		p.add(tf2);
		
		f.add(p);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}