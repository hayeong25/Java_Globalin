package Day1202;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTabbedPaneEx extends JFrame {
	
	public JTabbedPaneEx() {
		super("JTabbedPane");
		
		ImageIcon icon1, icon2, tabicon;
		JButton b1, b2;
		JTabbedPane jp;
		
		// 버튼에 필요한 이미지 아이콘 객체 생성
		icon1 = new ImageIcon("src/Image/ico01.jpg");
		icon2 = new ImageIcon("src/Image/ico02.jpg");
		
		// JTabbedPane에 필요한 아이콘 객체 생성
		tabicon = new ImageIcon("src/Image/ico03.jpg");
		
		b1= new JButton("사진1", icon1);
		b2 = new JButton("사진2", icon2);
		
		jp = new JTabbedPane(); // JTabbedPane 객체 생성
		
		jp.addTab("탭1",new ImageIcon(" "), b1);
		jp.addTab("탭2", new JPanel().add(new JTextArea(7, 20)));
		jp.addTab("탭3", tabicon, b2, "탭에 추가한 사진이 어떤가요??");
		
		add(jp);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTabbedPaneEx();
	}
}