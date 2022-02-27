package Homework8;

import java.awt.*;
import javax.swing.*;

public class Homework007 extends JFrame {
	public Homework007() {
		this.setTitle("3개의 패널을 가진 프레임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel NorthPanel = new JPanel();
		JPanel CenterPanel = new JPanel();
		JPanel SouthPanel = new JPanel();
		
		c.add(NorthPanel, BorderLayout.NORTH);
		c.add(CenterPanel, BorderLayout.CENTER);
		c.add(SouthPanel, BorderLayout.SOUTH);
		
		NorthPanel.setBackground(Color.YELLOW);
		NorthPanel.setLayout(new FlowLayout());
		NorthPanel.add(new JButton("새로 배치"));
		NorthPanel.add(new JButton("종료"));
		
		CenterPanel.setLayout(null);
		JLabel [] label = new JLabel[10];
		int randNum1 = 0;
		int randNum2 = 0;
		for(int i = 0; i < 10; i++) {
			label[i] = new JLabel("*");
			randNum1 = (int)(Math.random()*200)+50;
			randNum2 = (int)(Math.random()*150)+50;
			label[i].setBounds(randNum1, randNum2, 20, 20);
			label[i].setForeground(Color.RED);
			c.add(label[i]);
		}
		
		SouthPanel.setBackground(Color.LIGHT_GRAY);
		SouthPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		SouthPanel.add(new JButton("별 개수 수정"));
		SouthPanel.add(new JTextField(15));
				
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Homework007();
	}
}