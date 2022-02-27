package Day1203;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class DoubleBufferingEx extends Frame implements KeyListener, Runnable {

	Image image;
	int x, y, mx, my, sel;
	Graphics bufferGraphics;
	Image bufferImage;
	
	public DoubleBufferingEx() {
	
		super("DoubleBuffering");
		
		// Image 객체 생성
		image = Toolkit.getDefaultToolkit().getImage("src/Image/packman.jpg");
		
		x = 225;
		y = 225;
		mx = 0;
		my = 0;
		sel = 0;
		
		Thread t = new Thread(this);
		t.start();
		
		setBounds(200, 200, 500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);
	         }
	    });
		
		addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) { // 그릴 때
		if(bufferImage != null) {
			g.drawImage(bufferImage, 0, 0, this);
		}
	}
	
	@Override
	public void update(Graphics g) { // 지울 때
		Dimension d = getSize();
		
		if(bufferGraphics == null) {
			bufferImage = createImage(d.width, d.height);
			bufferGraphics = bufferImage.getGraphics();
		}
		
		bufferGraphics.setColor(getBackground());
		bufferGraphics.fillRect(0, 0, 500, 500);
		bufferGraphics.drawImage(image, x, y, x+50, y+50, sel*50, 0, sel*50+50, 50, this);
		// 전체 이미지 중 (sel*50, 0) 위치에서부터 ((sel*50)+50, 50)크기만큼의 이미지를 화면 x, y 위치에서 (x+50, y+50)의 크기만큼 화면에 출력
		// 화면 중앙에 이미지가 출력되면서 왼쪽으로 입을 벌렸다 닫았다 하는 이미지가 계속 출력됨
		paint(g);
	}
	
	@Override
	public void run() {
		while(true) {
			x += mx;
			y += my;
			
			if(sel % 2 == 0) { // 현재 출력시킬 이미지를 설정할 수 있도록 2로 나누었을 때 나머지가 0이면 입이 닫힌 이미지를 출력
				sel++;
			}
			else {
				sel--;
			}
			
			if(x <= 50) {
				x = 500;
			}
			else if(x >= 500) {
				x = 0;
			}
			else if(y <= 50) {
				y = 500;
			}
			else if(y >= 500) {
				y = 0;
			}
			
			try {
				repaint();
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT) {
			mx = -10;
			my = 0;
			sel = 0;
		}
		else if(e.getKeyCode() == e.VK_RIGHT) {
			mx = 10;
			my = 0;
			sel = 2;
		}
		else if(e.getKeyCode() == e.VK_UP) {
			mx = 0;
			my = -10;
			sel = 4;
		}
		else if(e.getKeyCode() == e.VK_DOWN) {
			mx = 0;
			my = 10;
			sel = 6;
		}
		else if(e.getKeyCode() == e.VK_SPACE) { // ESC 누르면 종료
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다.", "종료", JOptionPane.INFORMATION_MESSAGE);
		         System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == e.VK_LEFT) {
			mx = 0;
			my = 0;
			sel = 0;
		}
		else if(e.getKeyCode() == e.VK_RIGHT) {
			mx = 0;
			my = 0;
			sel = 2;
		}
		else if(e.getKeyCode() == e.VK_UP) {
			mx = 0;
			my = 0;
			sel = 4;
		}
		else if(e.getKeyCode() == e.VK_DOWN) {
			mx = 0;
			my = 0;
			sel = 6;
		}
	}

	public static void main(String[] args) {
		new DoubleBufferingEx();
	}
}