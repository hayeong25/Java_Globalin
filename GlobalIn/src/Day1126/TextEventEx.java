package Day1126;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import Day1124.WinEvent;

public class TextEventEx extends Frame implements ActionListener, TextListener {
	
	TextField tf = new TextField(30);
	TextArea ta = new TextArea(100, 100);
	Button input = new Button("입력");
	Button exit = new Button("종료");
	
	public TextEventEx() {
		
		super("TextEvent");
		
		input.setEnabled(false);
		
		Panel p = new Panel();
		p.add(new Label("제목 : "));
		p.add(tf);
		p.add(input);
		
		add(BorderLayout.NORTH, p);
		add(BorderLayout.CENTER, ta);
		add(BorderLayout.SOUTH, exit);
		
		tf.addTextListener(this);
		input.addActionListener(this);
		exit.addActionListener(this);
		
		setBounds(300, 300, 400, 300);
		setVisible(true);
		
		WinEvent we = new WinEvent();
	    addWindowListener(we);
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		if(tf.getText().equals("")) { // 제목이 공백이면 입력 버튼 활성화 X
			input.setEnabled(false);
		}
		else {
			input.setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("입력")) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();
		}
		else if(str.equals("종료")) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new TextEventEx();
	}
}