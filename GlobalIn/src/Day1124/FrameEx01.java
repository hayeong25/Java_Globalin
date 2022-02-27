package Day1124;

import java.awt.Frame;

// 프레임 생성 방법 첫 번째(객체 생성해서 프레임 만듦)
public class FrameEx01 {
	public static void main(String[] args) {
		Frame f = new Frame(); // 프레임 객체 생성 -2
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		f.setSize(300,200); // 3
		f.setVisible(true); // 4
	}
}