package com.emp;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TotalPane extends JPanel {
	public TotalPane() {
		setLayout(null); // 레이아웃을 수동으로 설정. 수동으로 설정한 경우, 위치와 크기를 따로 설정해야 함
		
		JTable table = new JTable(new EmployModel());
		
		JScrollPane jp = new JScrollPane(table);
		
		jp.setBounds(30, 10, 500, 500);
		
		add(jp);
	}
}