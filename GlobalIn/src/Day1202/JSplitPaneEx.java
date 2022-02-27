package Day1202;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 프레임 분할(수평, 수직)
public class JSplitPaneEx extends JFrame {
	
	JSplitPane splitPane, splitPane1;
	
	public JSplitPaneEx() {
		super("JSplitPane");
		
		// 2개의 JScrollPane을 jta1, jta2를 추가해 생성
		JTextArea jta1 = new JTextArea(20, 10);
		JScrollPane jta1ScrollPane = new JScrollPane(jta1);
		
		JTextArea jta2 = new JTextArea(20, 10);
		JScrollPane jta2ScrollPane = new JScrollPane(jta2);
		
		// 수직 분할로 JSplitPane 객체 생성. 상하로 나뉨
		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jta1ScrollPane, jta2ScrollPane);
		
		JTextArea jta3 = new JTextArea(20, 10);
		JScrollPane jta3ScrollPane = new JScrollPane(jta3);
		
		splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, splitPane, jta3ScrollPane);
		
		// splitPane의 분할
		splitPane.setDividerLocation(100);
		
		// splitPane과 splitPane1의 크기 설정
		splitPane.setPreferredSize(new Dimension(200, 200));
		splitPane1.setPreferredSize(new Dimension(400, 200));
		
		add(splitPane1);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JSplitPaneEx();
	}
}