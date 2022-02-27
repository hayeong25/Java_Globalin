package Day1125;

import java.awt.*;
import Day1124.WinEvent;

public class AWTexam extends Frame {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("사원등록");
		
		Panel p1 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p2 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p3 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p5 = new Panel(new FlowLayout(FlowLayout.LEFT));
		Panel p6 = new Panel(new FlowLayout());
		Panel p7 = new Panel();
		
		Panel pg1 = new Panel();
		Panel pg2 = new Panel();
		Panel pg3 = new Panel();
		
		Label label1 = new Label("성명");
		Label label2 = new Label("성별");
		Label label3 = new Label("주민번호");
		Label label4 = new Label("-");
		Label label5 = new Label("주소");
		Label label6 = new Label("부서명");
		Label label7 = new Label("취미");
		Label label8 = new Label("자기소개");
		
		TextField tf1 = new TextField(8);
		TextField tf2 = new TextField(6);
		TextField tf3 = new TextField(7);
		TextField tf4 = new TextField(30);
		
		CheckboxGroup option1 = new CheckboxGroup();
		Checkbox radio1 = new Checkbox("남자", true);
		Checkbox radio2 = new Checkbox("여자", false);
		
		Choice ch1 = new Choice();
		ch1.addItem("기획부");
		ch1.addItem("총무부");
		ch1.addItem("회계부");
		ch1.addItem("영업부");
		ch1.addItem("자재부");
		
		Checkbox ck1 = new Checkbox("운동", true);
		Checkbox ck2 = new Checkbox("음악감상");
		Checkbox ck3 = new Checkbox("영화");
		Checkbox ck4 = new Checkbox("컴퓨터");
		
		TextArea ta1 = new TextArea(9, 45);

		Button b1 = new Button("저장");
		Button b2 = new Button("종료");
		b1.setSize(20, 20);
		b2.setSize(20, 20);
		
		p1.add(label1);
		p1.add(tf1);
		p1.add(label2);
		p1.add(radio1);
		p1.add(radio2);
		
		p2.add(label3);
		p2.add(tf2);
		p2.add(label4);
		p2.add(tf3);
		
		p3.add(label5);
		p3.add(tf4);
		
		p4.add(label6);
		p4.add(ch1);
		
		p5.add(label7);
		p5.add(ck1);
		p5.add(ck2);
		p5.add(ck3);
		p5.add(ck4);
		
		p6.add("North", label8);
		p6.add(ta1);
		
		p7.add(b1);
		p7.add(b2);		
		
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());
		pg3.setLayout(new BorderLayout());
		
		pg1.add("North", p1);
		pg1.add("Center", p2);
		pg1.add("South", p3);
		
		pg2.add("North", p4);
		pg2.add("Center", p5);
		
		pg3.add("North", p6);
		pg3.add("Center", p7);
		
		f.add("North", pg1);
		f.add("Center", pg2);
		f.add("South", pg3);
		
		f.setSize(350, 400);
		f.setVisible(true);
		WinEvent we = new WinEvent();
	    f.addWindowListener(we);
	}
}