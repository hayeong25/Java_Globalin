package Day1124;

import java.awt.*;

public class TextAreaEx {
	public static void main(String[] args) {
		Frame f = new Frame("TextArea");
		Panel p = new Panel();
		
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		TextArea ta1 = new TextArea("기본", 5, 30);
		TextArea ta2 = new TextArea("Vertical", 10, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		p.add(ta1);
		p.add(ta2);
		
		f.add(p);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
