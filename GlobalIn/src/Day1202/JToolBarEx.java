package Day1202;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// JToolBar : 자주 사용하는 메뉴를 버튼 형태의 모양으로 보여주는 컴포넌트

public class JToolBarEx extends JFrame {
	
	public JToolBarEx() {
		super("JToolBar");
		
		JToolBar tbar = new JToolBar(); // JToolBar 객체 생성
		tbar.setMargin(new Insets(5, 5, 5, 5));
		// setMargin() : 여백 설정 메소드
		// Insets 클래스 생성자 이용해 위쪽, 왼쪽, 아래쪽, 오른쪽 순으로 여백 설정
		
		JPanel p = new JPanel(new GridLayout(1, 0));
		
		JButton bt1 = new JButton("Java");
		JButton bt2 = new JButton("JSP");
		JButton bt3 = new JButton("Spring");
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		tbar.add(p); // 패널을 툴바에 추가
		
		add("North", tbar);
		
		setBounds(300, 300, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JToolBarEx();
	}
}