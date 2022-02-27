package Day1203;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class JColorChooserEx extends JFrame implements ActionListener {

	JMenuBar mb;
	JMenu menuselect;
	JMenuItem menucolor;
	
	JLabel l;
	JTextArea jta;
	
	public JColorChooserEx() {
		super("JColorChooser");
		
		// JMenuBar 객체 생성
		mb = new JMenuBar();
		
		// JMenu 객체 생성
		menuselect = new JMenu("선택");
		
		// JMenuItem 객체 생성
		menucolor = new JMenuItem("색상");
		
		l = new JLabel("출력창");
		jta = new JTextArea();
		
		// 메뉴에 메뉴 항목 추가
		menuselect.add(menucolor);
		
		// 메뉴를 메뉴바에 추가
		mb.add(menuselect);
		
		// 프레임에 메뉴바 추가
		setJMenuBar(mb);
		
		add("North", l);
		add("Center", jta);
		
		setBounds(300, 300, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menucolor.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menucolor) {
			// JColorChooser 객체 생성
			JColorChooser chooser = new JColorChooser();
			
			Color color = chooser.showDialog(this, "색상을 고르세요", Color.black);
			
			l.setText("선택한 색상은 " + color);
			
			jta.setBackground(color);
			
			// 선택한 Color 객체를 이용해 JTextArea 배경색 변경
			
		}
	}

	public static void main(String[] args) {
		new JColorChooserEx();
	}
}