package Day1127;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import Day1124.WinEvent;

public class MouseMotionEventEx extends Frame implements ActionListener, MouseMotionListener {

	Label move = new Label("마우스 따라 다니기", Label.CENTER);
	Button exit = new Button("종료");
	
	public MouseMotionEventEx() {
		setTitle("Mouse Motion Event");
		
		setLayout(null); // 레이아웃을 null로 지정하게 되면 모든 컴포넌트의 위치를 각각 지정해야 함
		
		move.setBounds(100, 50, 150, 20);
		exit.setBounds(250, 500, 60, 40);
		
		// 라벨 바탕색 설정
		move.setBackground(Color.red);
		
		// 컴포넌트를 프레임에 추가
		add(move);
		add(exit);
		
		setBounds(300, 100, 500, 600);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	    
	    exit.addActionListener(this);
	    addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint();
		// getPoint() 메소드 : 현재 좌표를 Point 객체로 반환
		// Point 클래스 : 좌표 관리 클래스
		
		move.setLocation(p); // 좌표값을 알 수 있는 getX(), getY() 메소드를 포인터 객체에서 제공
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new MouseMotionEventEx();
	}
}