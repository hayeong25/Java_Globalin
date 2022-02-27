package Day1202;

import javax.swing.*;
import java.awt.event.*;

public class JProgressBarEx extends JFrame implements ActionListener {
	
	private JProgressBar progressBar1;
	private JButton startButton;
	private int currentValue; // 버튼을 누를 때마다 값을 증가시켜 값을 변경시키는 변수

	public JProgressBarEx() {
		super("JProgressBar");
		
		startButton = new JButton("Start");
		progressBar1 = new JProgressBar(0, 100); // 최소값과 최대값을 가지는 progressBar 객체 생성
	
		progressBar1.setValue(0); // setValue로 progressBar의 초기값 설정
		progressBar1.setStringPainted(true); // progressBar 내의 진행률을 표시할 것인지 설정   
		  
		//패널에 컴포넌트 추가
		JPanel panel = new JPanel();
		panel.add(startButton);
		panel.add(progressBar1);

		add(panel);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 시작 버튼에 이벤트 등록
		startButton.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new JProgressBarEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		currentValue += 10; // currentValue 값이 10만큼 증가
		progressBar1.setValue(currentValue); // progressBar 값 변경
		if(currentValue == 100) {
			currentValue = 0; // 현재 값이 100이 되면 다시 현재 값을 0으로 설정
		}
	}
}