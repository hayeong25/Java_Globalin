package Day1127;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import Day1124.WinEvent;

public class GraphicEx1 extends Frame implements MouseListener, MouseMotionListener {

	private int x;
	private int y;
	private int w;
	private int h;
	
	public GraphicEx1() {
		super("GraphicEx");
		
		setSize(500, 400);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	    
	    addMouseListener(this); // MouseEvent 등록
	    addMouseMotionListener(this); // MouseMotionEvent 등록
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource() == this) {
			w = e.getX();
			h = e.getY();
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == this) {
			x = e.getX(); // 현재 프레임 객체의 x 좌표값을 가져옴
			y = e.getY(); // 현재 프레임 객체의 y 좌표값을 가져옴
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == this) {
			w = e.getX();
			h = e.getY();
			repaint(); // w와 h의 크기만큼 다시 그리는 메소드
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void paint(Graphics g) {
		g.drawOval(x, y, w-x, h-y); // 지정한 위치에 폭과 높이가 있는 타원을 그림
	}
	
	public static void main(String[] args) {
		new GraphicEx1();
	}
}