package Day1124;

import java.awt.*;

public class CanvasEx {
	public static void main(String[] args) {
		Frame f = new Frame("Canvas");
		WinEvent we = new WinEvent();
		f.addWindowListener(we); // 종료 버튼 이벤트
		
		// 프레임 위치
		f.setLocation(300, 300);
		
		// 프레임 크기
		f.setSize(200, 200);
		
		f.setVisible(true);
	}

	public void paint(Graphics g) {
		
	}
}