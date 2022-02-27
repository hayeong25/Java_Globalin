package Day1124;

import java.awt.*;

public class ButtonEx {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("버튼");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		Panel p = new Panel();
		
		Button b1 = new Button(); // 라벨이 없는 버튼 생성
		Button b2 = new Button("출력");
		Button b3 = new Button("정렬");
		Button b4 = new Button("순위");
		
		b1.setLabel("입력"); // 메소드를 이용하여 라벨 설정
		
		// 버튼을 패널에 추가
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		f.add(p);
		
		// 위치 설정
		f.setLocation(300, 300);
		f.setSize(300, 100);
		f.setVisible(true);
	}
}