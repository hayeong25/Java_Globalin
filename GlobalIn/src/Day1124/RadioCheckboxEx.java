package Day1124;

import java.awt.*;

public class RadioCheckboxEx {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("라디오형 체크 박스");
		Panel p = new Panel();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox radio1 = new Checkbox("중졸", group, false);
		Checkbox radio2 = new Checkbox("전문대졸", group, false);
		Checkbox radio3 = new Checkbox("초졸", group, false);
		
		p.add(radio1);
		p.add(radio2);
		p.add(radio3);
		
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}