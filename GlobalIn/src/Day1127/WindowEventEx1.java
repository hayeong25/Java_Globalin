package Day1127;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx1 extends Frame implements WindowListener {

	public WindowEventEx1() {
		super("WindowEvent");
		
		setSize(300, 200);
		setVisible(true);
		
		addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) { // Window가 열릴 때 호출

	}

	@Override
	public void windowClosing(WindowEvent e) { // Window의 X 버튼 누르면 호출

	}

	@Override
	public void windowClosed(WindowEvent e) { // Window가 닫히고 나서 호출
		
	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) { // Window가 활성화 될 때 호출

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	public static void main(String[] args) {
		new WindowEventEx1();
	}
}