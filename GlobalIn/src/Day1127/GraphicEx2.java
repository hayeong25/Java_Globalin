package Day1127;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicEx2 extends Frame {

	Button bt1, bt2, bt3;
	Panel north_p;
	Canvas can;
	private Color color;
	int x, y;
	
	public GraphicEx2() {
		super("Graphic Event");
		
		north_p = new Panel();
		north_p.add(bt1 = new Button("Red"));
		north_p.add(bt2 = new Button("Blue"));
		north_p.add(bt3 = new Button("Green"));
		
		// 각 버튼 바탕색 설정
		bt1.setBackground(Color.red);
		bt2.setBackground(Color.blue);
		bt3.setBackground(Color.green);
		
		// 버튼 전경색 설정
		bt1.setForeground(Color.white);
		bt2.setForeground(Color.white);
		bt3.setForeground(Color.white);
		
		add(north_p, "North");
		
		add(can = new Canvas() {
			@Override
			public void update(Graphics g) { // 지우기 메소드
				paint(g);
			}
			
			@Override
			public void paint(Graphics g) { // 그리기 메소드
				g.setColor(color);
				g.fillOval(x-2, y-2, 4, 4);
			}
		});
		
		// 버튼에 이벤트 등록 처리
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("red");
				color = Color.red; // 색상 클래스에 색상을 선택하여 컬러 멤버 변수에 저장
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("blue");
				color = Color.blue;
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("green");
				color = Color.green;
			}
		});
		
		can.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				
				can.repaint();
			}
		});
		
		addWindowListener(new WindowAdapter() {	
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(200, 200, 600, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GraphicEx2();
	}
}