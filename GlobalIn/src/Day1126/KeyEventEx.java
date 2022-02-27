package Day1126;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Day1124.WinEvent;

public class KeyEventEx extends Frame implements KeyListener {

	TextArea ta = new TextArea();
	
	public KeyEventEx() {
		super("KeyEvent");
		
		add(ta);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	    
	    ta.addKeyListener(this);
	}
	
	// KeyEventListener 발생 순서 : KeyPressed - KeyReleased - KeyTyped
	// 다 사용하지 않더라도 반드시 구현해야 KeyListener 호출시 에러 발생하지 않음. 사용하지 않는 경우 공백으로 둔다.
	
	@Override
	public void keyTyped(KeyEvent e) { // 손을 뗴고 나서 최종적으로 실행

	}

	@Override
	public void keyPressed(KeyEvent e) { // 키보드 누를 때 실행
		// getKeyCode() : 이벤트에 의해 입력된 문자에 해당하는 코드를 얻어옴. 이때 키보드에 있는 모든 키에 대응되는 코드값은 KeyEvent의 멤버 필드
		if(e.getKeyCode() == e.VK_DOWN) { // VK_DOWN : 아래 방향키
			ta.append("Down Key \n");
		}
		if(e.getKeyCode() == e.VK_UP) { // VK_UP : 위 방향키
			ta.append("Up Key \n");
		}
		if(e.getKeyCode() == e.VK_LEFT) { // VK_LEFT : 왼쪽 방향키
			ta.append("Left Key \n");
		}
		if(e.getKeyCode() == e.VK_RIGHT) { // VK_RIGHT : 오른쪽 방향키
			ta.append("Right Key \n");
		}
		if(e.getKeyCode() == e.VK_ENTER) {
			ta.append("Enter Key \n");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) { // 키보드에서 손을 땔 때

	}
	
	public static void main(String[] args) {
		new KeyEventEx();
	}
}