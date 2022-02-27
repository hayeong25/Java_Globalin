package Day1124;

import java.awt.*;

public class List {
	
	public static void main(String[] args) {
		Frame f = new Frame("리스트");
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		Panel p = new Panel();
	    
		//보여지는 리스트 개수 설정(3개)
	    List list1 = new List();

	    list1.add("서울");
	    list1.add("대구");
	    list1.add("대전");
	    list1.add("부산");
	    
	    p.add(list1);
	    f.add(p);
	    
	    f.pack();
	    //f.setSize(300, 300);
	    f.setVisible(true);
	}
}