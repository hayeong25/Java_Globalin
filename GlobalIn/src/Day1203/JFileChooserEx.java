package Day1203;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFileChooserEx extends JPanel implements ActionListener {
	
	JButton openButton;
	JButton saveButton;
	
	JTextArea jta;
	
	JFileChooser fc;
	
	public JFileChooserEx() {
		
		// Frame의 LookAndFeel 설정
		// 새롭게 추가된 JFrame이 LookAndFeel에 의해 제공되는 윈도우 수식을 갖출 것인지 설정
		// 윈도우 수식 : 경계선, 윈도우 메뉴, 타이틀 등
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("JFileChooser");
		
		setLayout(new BorderLayout());
		
		jta = new JTextArea(5, 20);
		jta.setMargin(new Insets(5, 5, 5, 5));
		
		JScrollPane jtaScrollPane = new JScrollPane(jta);
		
		// FileChooser 객체 생성
		fc = new JFileChooser();
		openButton = new JButton("open");
		saveButton = new JButton("save");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(openButton);
		buttonPanel.add(saveButton);
		
		add(buttonPanel, BorderLayout.NORTH);
		add(jtaScrollPane, BorderLayout.CENTER);
		
		frame.add(this);
		
		frame.pack();
		frame.setLocation(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		openButton.addActionListener(this);
		saveButton.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new JFileChooserEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == openButton) {
			int returnval = fc.showOpenDialog(this);
			
			if(returnval == JFileChooser.APPROVE_OPTION) {
				// File Dialog 박스의 open 버튼을 클릭한 경우 File Dialog 박스에서 선택한 파일을 파일 객체로 변환
				File file = fc.getSelectedFile();
				
				// jta에 파일 클래스의 getName() 메소드를 이용해 파일명 출력
				jta.setText(file.getName() + "\n");
			}
		}
		else if(e.getSource() == saveButton) {
			int returnval = fc.showSaveDialog(this);
			
			// showSaveDialog() : SaveFileDialog 박스를 띄움
			// this : Dialog 박스의 부모 컴포넌트
			// 메소드의 리턴값 : SaveFileDialog 박스 닫을 때 Dialog 박스 상태
			
			if(returnval == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				jta.setText(file.getName() + "\n");
			}
		}
	}
}