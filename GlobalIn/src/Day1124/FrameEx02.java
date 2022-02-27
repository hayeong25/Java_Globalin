package Day1124;

import java.awt.*;

// 프레임 클래스를 상속받아 프레임 구현
public class FrameEx02 extends Frame {
	public FrameEx02() {
		super("두 번째 프레임 구현");
		setSize(300, 200); // 프레임의 크기 설정
		setVisible(true); // 프레임의 보이기 설정
	}
	
	public static void main(String[] args) {
		FrameEx02 f = new FrameEx02();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
	}
}