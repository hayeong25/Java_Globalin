package Day1204;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HorseMain extends JFrame implements Runnable {

	private Canvas can;
	private Image buffer;
	private Image[] horse; // 말 이미지 배열
	private boolean bRepeat = true; // 반복 처리
	
	public HorseMain() {
		super("Image Buffering");
		// 말 이미지 출력할 메소드 호출
		initHorse();
		
		// 프레임에 캔버스 객체 생성해 추가 
		add(can = new Canvas() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(buffer, 0, 0, this);
			}
			
			@Override
			public void update(Graphics g) {
				paint(g);
			}
		});
		
		// 키 이벤트 등록
		can.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch(code) {
				case KeyEvent.VK_SPACE :
					bRepeat = !bRepeat;
					if(bRepeat) {
						makeThread();
					}
				}
			}
		});
		
		setBounds(300, 100, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		makeThread();
	}
	
	// 초기화 메소드
	public void initHorse() {
		// 말 이미지를 저장할 배열 공간 할당
		horse = new Image[11];
		
		for (int i = 0; i < horse.length; i++) {
			horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("src/Image/black%02d.png", i+1));
		}
	}
	
	public void bufferPaint(int n) {
		// 캔버스의 가로, 세로 크기만큼 이미지를 생성해서 버퍼 변수에 저장
		buffer = createImage(can.getWidth(),can.getHeight());
		// 이미지에서 그래픽 메소드를 호출해 buffer_g그래픽 변수에 저장
		Graphics buffer_g = buffer.getGraphics();
		// 저장된 이미지 출력
		buffer_g.drawImage(horse[n], 50, 50, this);
		// 캔버스에 다시 이미지 출력하기 위해 repaint() 메소드 호출
		can.repaint();
	}
	
	public void makeThread() {
		// 스레드 객체 생성해 시작 메소드 호출
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		// 스레드 시작하면 호출되는 함수
		while(true) {
			
			for (int i = 0; i < horse.length; i++) {
				if(!bRepeat) {
					return;
				}
				
				try {
					Thread.sleep(50); // 0.05초 간격
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				
				bufferPaint(i); // 배열의 크기만큼 반복해 이미지 출력
			}
		}
	}

	public static void main(String[] args) {
		new HorseMain();
	}
}