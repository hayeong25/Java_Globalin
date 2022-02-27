package Day1127;

import java.awt.*;
import java.awt.event.WindowAdapter;

public class WindowEventEx3 extends Frame {
	
	public WindowEventEx3() {
		super("WindowEvent");
		
		addWindowListener(new WindowAdapter() { // 추상 클래스를 객체로 바로 생성
			
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEventEx3();
	}
}