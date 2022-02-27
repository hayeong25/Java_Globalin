package Day1124;

import java.awt.*;

public class MyCanvas extends Canvas {
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(20, 20, 100, 100);
	}
	
	public static void main(String[] args) {
		Frame f = new Frame("Canvas");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		MyCanvas canvas = new MyCanvas(); // 캔버스 객체 생성
		canvas.setBackground(Color.yellow); // 캔버스 바탕색을 노란색으로 설정
		
		f.add(canvas); // 캔버스를 프레임에 추가 시힘
		f.setLocation(300, 300);
	}
}