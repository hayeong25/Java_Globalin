package Day1029;

import java.awt.*; // 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*; // AWT 이벤트 사용을 위한 경로명
import java.awt.event.WindowAdapter; // 스윙 컴포넌트 클래스들의 경로명
import java.awt.event.WindowEvent; // 스윙 이벤트를 위한 경로명

public class WindowEventEx extends Frame {

	public WindowEventEx() {
		super("EventTest");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowEventEx();
	}
}