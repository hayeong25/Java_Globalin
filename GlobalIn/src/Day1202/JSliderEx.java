package Day1202;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderEx extends JFrame {
	JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, 0); // 슬라이더 방향, 최소값, 최대값, 초기 설정값
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	
	JLabel rgb = new JLabel("RGB(0, 0, 0)", JLabel.CENTER);
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel west = new JPanel(new GridLayout(0, 1));
	JPanel cen = new JPanel(new GridLayout(0, 1));
	JPanel p2 = new JPanel(); // 색상 조합 영역
	
	int r, g, b;
	
	public JSliderEx() {
		super("JSliderEx"); // 타이틀 설정
		
		// setMajorTickSpacing() : 큰 눈금 설정
		// setMinorTickSpacing() : 작은 눈금 설정
		// setPaintTicks(true) : 눈금이 화면에 보이게 설정
		// setPaintLabels(true)
		
		// red 눈금 설정
		red.setMajorTickSpacing(50);
		red.setMinorTickSpacing(5);
		red.setPaintTicks(true);
		red.setPaintLabels(true);
		
		// green 눈금 설정
		green.setMajorTickSpacing(50);
		green.setMinorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true);
		
		// blue 눈금 설정
		blue.setMajorTickSpacing(50);
		blue.setMinorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		
		// JLabel 객체 생성
		JLabel rlabel = new JLabel("RED");
		JLabel glabel = new JLabel("GREEN");
		JLabel blabel = new JLabel("BLUE");
		
		// 라벨 전경색 설정
		rlabel.setForeground(Color.red);
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);
		
		// 라벨 폰트 '돋움체', 굵게, 크기 24로 설정
		rgb.setFont(new Font("돋움체", Font.BOLD, 24));
		
		// rgb label을 왼쪽에 배치
		west.add(rlabel);
		west.add(glabel);
		west.add(blabel);
		
		// 슬라이더 추가
		cen.add(red);
		cen.add(green);
		cen.add(blue);
		
		p1.add("West", west);
		p1.add("Center", cen);
		
		add("North", rgb); // "RGB(0, 0, 0)"을 프레임 위쪽에 배치
		add("South", p1); // p1을 프레임 아래쪽에 배치
		add("Center", p2); // p2는 프레임 가운데로
		
		setBounds(300, 200, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 이벤트 등록
		red.addChangeListener(new Sevent());
		green.addChangeListener(new Sevent());
		blue.addChangeListener(new Sevent());
	}

	// 내부 클래스
	class Sevent implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) { // 눈금이 바뀔 때마다 호출되는 메소드
			JSlider source = (JSlider)e.getSource();
			
			if(e.getSource() == red) {
				r = source.getValue(); // JSlider에 표시된 현재 값을 가져옴
			}
			if(e.getSource() == green) {
				g = source.getValue();
			}
			if(e.getSource() == blue) {
				b = source.getValue();
			}
			
			// p2의 배경색을 r, g, b로 변경
			p2.setBackground(new Color(r, g, b));
			
			// "RGB(0, 0, 0)" 문자열 다시 설정
			rgb.setText("RGB(" + r + ", " + g + ", " + b + ")");
		}
	}
	
	public static void main(String[] args) {
		new JSliderEx();
	}
}