package Day1126;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import Day1124.WinEvent;
import java.awt.*;

public class ItemEventEx extends Frame implements ActionListener, ItemListener {

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	TextArea ta = new TextArea(5, 20);
	
	// 이벤트 소스
	Button exit = new Button("종료");
	Checkbox cb1 = new Checkbox("축구", false);
	Checkbox cb2 = new Checkbox("야구", false);
	Checkbox cb3 = new Checkbox("농구", false);
	Checkbox cb4 = new Checkbox("배구", false);
	
	public ItemEventEx() {
		super("ItemEvent");
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		
		p2.add(exit);
		
		add("North", p1);
		add("Center", ta);
		add("South", p2);
		
		// 이벤트 소스와 이벤트 리스너가 구현된 객체
		exit.addActionListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);

		WinEvent we = new WinEvent();
	    addWindowListener(we);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) { // ItemEvent를 처리하는 이벤트 핸들러
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(e.getItem() + "을 선택했습니다.\n");
		}
		else if(e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(e.getItem() + "을 취소했습니다.\n");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // ActionEvent를 처리하는 이벤트 핸들러
		System.exit(0);
	}

	public static void main(String[] args) {
		new ItemEventEx();
	}
}