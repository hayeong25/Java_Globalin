package Day1201;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.util.*;

public class JTextComponentEx extends JFrame {
	public JTextComponentEx() {
		super("JTextComponent");
		
		JPanel panel1 = new JPanel();
		JTextField field = new JTextField(5); // 이름
		
		class NumberDocument extends PlainDocument {
			public void insertString(int offset, String value, AttributeSet a) throws BadLocationException {
				char[] valueArr = value.toCharArray(); // 추가할 문자열을 char 배열로 반환
				
				// char 배열의 문자열을 하나씩 꺼내어 isDigit() 메소드로 숫자인지 구분. 숫자가 아닌 경우 경고음만 내고 문자열은 추가하지 않고 그대로 문자 배열 반환
				for (int i = 0; i < valueArr.length; i++) {
					if(!Character.isDigit(valueArr[i])) { // 숫자가 아닌 경우
						getToolkit().beep(); // beep : 경고음
						return;
					}
				}
				
				super.insertString(offset, value, a); // insertString() 메소드를 호출하여 문자열 추가
			}
		}
		
		JTextField numberField = new JTextField(2); // 나이
		numberField.setDocument(new NumberDocument()); // 넘버필드 객체의 Document 설정
		// 설정 이유 : JTextField에 숫자가 아닌 값을 추가하지 않기 위해서
		
		JPasswordField passField = new JPasswordField(5); // 패스워드
		
		// 패널에 라벨과 각 컴포넌트 추가
		panel1.add(new JLabel("Name : "));
		panel1.add(field);
		panel1.add(new JLabel("Age : "));
		panel1.add(numberField);
		panel1.add(new JLabel("Password : "));
		panel1.add(passField);
		
		JPanel panel2 = new JPanel(new BorderLayout());
		JTextArea textArea = new JTextArea(5, 10); // 가로 5, 세로 10
		
		textArea.setLineWrap(true); // 지정한 세로의 범위를 벗어나면 자동으로 내려쓰기 기능 설정
		
		// JTextArea 컴포넌트에 스크롤 기능 설정. 수직은 항상 나오고 수평은 X
		JScrollPane tscroll = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel2.add("North", new JLabel("자기소개"));
		panel2.add("Center", tscroll);
		
		add("North", panel1); // 패널 1을 위쪽 영역으로
		add("Center", panel2); // 패널 2를 가운데 영역으로
		
		pack();
		setLocation(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTextComponentEx();
	}
}