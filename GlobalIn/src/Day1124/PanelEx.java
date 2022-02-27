package Day1124;

import java.awt.*;

public class PanelEx {
	public static void main(String[] args) {
		
		// 프레임 객체 생성
		Frame f = new Frame();
		
		// 패널 객체 생성
		Panel p = new Panel();
		
		// 패널 바탕화면 설정
		p.setBackground(Color.red);
		
		// 패널을 프레임에 추가
		f.add(p);
		
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		f.setSize(200, 200);
		f.setVisible(true);
	}
}