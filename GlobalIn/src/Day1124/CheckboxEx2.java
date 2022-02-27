package Day1124;

import java.awt.*;

public class CheckboxEx2 extends Frame{
	
	GridLayout gl = new GridLayout(4, 1);
	Label la = new Label("당신의 성별은?");
	
	CheckboxGroup cg = new CheckboxGroup();
	
	Checkbox man = new Checkbox("남성", cg, true);
	Checkbox woman = new Checkbox("여성", cg, false);
	
	Button bt = new Button("확인");
	
	public CheckboxEx2() {
		super("CheckboxGroup");
		
		// 레이아웃을 설정하는 메소드(배치)
		setLayout(gl);
		
		add(la);
		add(man);
		add(woman);
		add(bt);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CheckboxEx2 f = new CheckboxEx2();
		WinEvent we = new WinEvent();
		f.addWindowListener(we);
	}
}