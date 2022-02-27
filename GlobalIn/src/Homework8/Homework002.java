package Homework8;

import java.awt.*;
import javax.swing.*;

public class Homework002 extends JFrame {
	public Homework002() {
		this.setTitle("BorderLayout Practice");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(50, 20));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Homework002();
	}
}