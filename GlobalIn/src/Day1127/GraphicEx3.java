package Day1127;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Day1124.WinEvent;

/*
	Image 클래스
	- Image im = Toolkit.getDefaultToolkit.getImage("그림파일");
	- 가져온 이미지를 프레임에 그림
	- paint() 메소드 호출해 그림
	- 이미지 지원 형식 : gif, jpg, png
*/

public class GraphicEx3 extends Frame implements ActionListener {

	private Image im;
	private Button bt = new Button("확대");
	private Button bt1 = new Button("축소");
	private int w = 160;
	private int h = 240;
	
	public GraphicEx3() {
		super("GraphicEx");
		
		im = Toolkit.getDefaultToolkit().getImage("src/image/KakaoTalk_20201127_174058789.jpg");
		
		setLayout(new BorderLayout());
		add("North", new Label("이미지 파일", Label.CENTER));
		
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(bt);
		p.add(bt1);
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		
		bt1.setEnabled(false);
		
		add("South", p);
		
		setSize(400, 550); // 프레임 크기
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(im, 40, 50, w, h, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt) { // 확대
			bt.setEnabled(false);
			bt1.setEnabled(true);
			w = 320;
			h = 480;
			repaint();
		}
		else if(e.getSource() == bt1) { // 축소
			bt.setEnabled(true);
			bt1.setEnabled(false);
			w = 160;
			h = 240;
			repaint();
		}
	}

	public static void main(String[] args) {
		new GraphicEx3();
	}
}