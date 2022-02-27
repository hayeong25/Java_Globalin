package Day1127;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEventEx2 extends Frame {
	
	public WindowEventEx2() {
		super("WindowEvent");
		
		addWindowListener(new WindowEventEx());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class WindowEventEx extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new WindowEventEx2();
	}
}