package com.emp;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	private JTabbedPane tp;
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	public MainFrame() {
		// 프레임에 사원 정보 입력 탭
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();
		
		// 탭에 추가
		tp.addTab("사원 정보 입력", ap);
		tp.addTab("사원 정보 조회", fp);
		tp.addTab("사원 정보 전체 보기", tpa);
		
		getContentPane().add(tp);
		
		setTitle("사원 관리 프로그램");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setSize(600, 600);
	}
}