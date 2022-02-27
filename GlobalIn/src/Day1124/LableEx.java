package Day1124;

import java.awt.*;

public class LableEx {
	public static void main(String[] args) {
		Frame f = new Frame("라벨");
		Panel p = new Panel();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
		
		Label label1 = new Label("라벨1");
		Label label2 = new Label("라벨2", Label.CENTER); // 가운데 정렬
		Label label3 = new Label("라벨3", Label.LEFT); // 왼쪽 정렬
		Label label4 = new Label("라벨4", Label.RIGHT); // 오른쪽 정렬
		
		label1.setBackground(Color.red);
		label2.setBackground(Color.red);
		label3.setBackground(Color.red);
		label4.setBackground(Color.red);

		p.add(label1);
		p.add(label2);
		p.add(label3);
		p.add(label4);
		
		f.add(p);
		
		f.setSize(300, 100);
		f.setVisible(true);
	}
}