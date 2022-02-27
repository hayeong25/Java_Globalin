package Day1124;

import java.awt.*;

public class ChoiceEx {
	public static void main(String[] args) {
		Frame f = new Frame("Choice");
		Panel p = new Panel();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		Choice ch = new Choice();
		
		ch.addItem("사과");
		ch.addItem("배");
		ch.addItem("딸기");
		ch.addItem("샤인머스켓");
		ch.addItem("바나나");
		
		p.add(ch);
		
		f.add(p);
		
		f.pack();
		
		f.setSize(300, 100);
		f.setVisible(true);
	}
}