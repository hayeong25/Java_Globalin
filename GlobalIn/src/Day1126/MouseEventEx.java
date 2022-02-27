package Day1126;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Day1124.WinEvent;

public class MouseEventEx extends Frame implements ActionListener, MouseListener {

	// 패널 객체 생성
	Panel p = new Panel();
	
	// 컴포넌트 추가
	Button test = new Button("Test");
	Button exit = new Button("Exit");
	TextArea ta = new TextArea();
	
	public MouseEventEx() {
		super("MouseEvent");
		
		// 패널에 컴포넌트 추가
		p.add(test);
		p.add(exit);
		
		// 처음 시작시 ta는 비활성화 상태로
		ta.setEditable(false);
		
		// 각 컴포넌트 위치 배치
		add("South", p);
		add("Center", ta);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	    
	    exit.addActionListener(this);
	    test.addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) { // 버튼 위에서 마우스 클릭 시 호출되는 메소드
		ta.append("Mouse Click Event...\n");
	}

	@Override
	public void mousePressed(MouseEvent e) { // 마우스 누를 때 호출되는 메소드
		ta.append("Mouse Press Event...\n");
	}

	@Override
	public void mouseReleased(MouseEvent e) { // 버튼을 눌렀다 떨어질 때 호출되는 메소드
		ta.append("Mouse Release Event...\n");
	}

	@Override
	public void mouseEntered(MouseEvent e) { // 버튼 위에 마우스 커서가 놓이면 호출되는 메소드
		ta.append("Mouse Enter Event...\n");
	}

	@Override
	public void mouseExited(MouseEvent e) { // 마우스 커서가 버튼에서 떨어지면 호출되는 메소드
		ta.append("Mouse Exit Event...\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new MouseEventEx();
	}
}