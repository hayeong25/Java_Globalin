package Day1203;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JOptionPaneEx extends JFrame implements ActionListener {

	JButton b1; // Message Dialog
	JButton b2; // Confirm Dialog
	JButton b3; // Input Dialog
	JButton b4; // Option Dialog
	
	// Option Dialog의 Option
	String[] str = {"로그인", "회원가입"};
	
	public JOptionPaneEx() {
		super("JOptionPane");
		
		// Layout 설정
		setLayout(new FlowLayout());
		
		// Button 이름 설정
		b1 = new JButton("Message Dialog");
		b2 = new JButton("Confirm Dialog");
		b3 = new JButton("Input Dialog");
		b4 = new JButton("Option Dialog");
		
		// 
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		pack();
		setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Event 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) { // 이벤트가 발생한 컴포넌트는 b1
			// getSource() : 버튼이 눌러졌을 때 버튼에 지정된 값 가져옴. 값이 없으면 지정된 이름 리턴
			JOptionPane.showMessageDialog(this, "Message Dialog입니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
			// this : Message Dialog를 소유하고 있는 부모 컴포넌트
		}
		else if(e.getSource() == b2) {
			JOptionPane.showConfirmDialog(this, "Confirm Dialog입니다.", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		else if(e.getSource() == b3) {
			JOptionPane.showInputDialog(this, "Input Dialog입니다.", "Input", JOptionPane.YES_NO_OPTION);
		}
		else if(e.getSource() == b4) {
			JOptionPane.showOptionDialog(this, "Option Dialog입니다.", "Option", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			// options : 사용자가 선택할 수 있는 객체 배열(str)
			// initialValue : 기본으로 선택할 객체
		}
	}

	public static void main(String[] args) {
		new JOptionPaneEx();
	}
}