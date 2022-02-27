package Day1126;

import java.awt.*;
import java.awt.event.*;
import Day1124.WinEvent;

public class ActionEventEx extends Frame implements ActionListener {

	Panel p;
	Button input, exit;
	TextArea ta;
	
	public ActionEventEx() {
		super("ActionEvent");
		
		p = new Panel();
		input = new Button("입력"); // 이벤트 소스. "입력"이라는 Label만 있는 상태
		exit = new Button("종료"); // 이벤트 소스. "종료"라는 Label만 있는 상태
		ta = new TextArea();
		
		p.add(input);
		p.add(exit);
		add(p, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	    
	    input.addActionListener(this);
	    exit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트 리스너
		String name;
		name = e.getActionCommand();
		// getActionCommand() : Action을 발생시킨 객체의 명령 문자열을 얻어옴. Button에서 명령 문자열을 설정하지 않았다면 Button의 label을 반환함
		if(name.equals("입력")) {
			ta.append("버튼이 입력되었습니다.\n");
		}
		else {
			ta.append("프로그램을 종료합니다.\n");
			try {
				Thread.sleep(2000); // 2000 = 2초
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new ActionEventEx();
	}
}