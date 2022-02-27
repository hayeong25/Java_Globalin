package com.emp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JButton; // 저장, 다시쓰기 버튼
import javax.swing.JComboBox; // 부서번호
import javax.swing.JLabel;
import javax.swing.JOptionPane; // 알림 메세지
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class AddPane extends JPanel implements ActionListener, ItemListener{

	// Swing 컴포넌트 멤버 선언
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField jtf[] = new JTextField[5];
	private JButton okb; // 저장
	private JButton resetb; // 다시쓰기
   
	private int department = 10; // 부서번호 (콤보박스) 초기화
   
	// Label 제목
	String[] caption = {"이          름  :", "직          책  :", "메          일  :", "부          서  :"};
   
   public AddPane() {
      // 레이아웃 설정
      setLayout(new GridLayout(6, 1));
      EtchedBorder eb = new EtchedBorder(); // 경계선
      setBorder(eb);
      
      // 입력 받을 항목의 개수
      int size = caption.length;
      
      int i;
      
      // 텍스트 필드, 레이블을 패널로 묶어 AddPane에 추가
      for(i = 0; i < (size - 1); i++) {
         jp[i] = new JPanel();
         jl[i] = new JLabel(caption[i]);
         jtf[i] = new JTextField(15);
         
         // 레이블, 텍스트 필드 Panel에 추가
         jp[i].add(jl[i]);
         jp[i].add(jtf[i]);
         
         add(jp[i]);
      }
      
      jp[i] = new JPanel();
      jl[i] = new JLabel(caption[i]);
      jp[i].add(jl[i]); // 화면 공간을 확보함
      add(jp[i]);
      
      // 부서 컴포넌트 추가
      JComboBox combo = new JComboBox();
      combo.addItem("부서번호를 선택하세요");
      
      for (int c = 1; c < 5; c++) {
		combo.addItem(c * 10);
	}
      
      // 패널에 콤보박스 추가
      jp[i].add(combo);
      combo.addItemListener(this);
      
      jp[size] = new JPanel();
      
      okb = new JButton("저장하기");
      okb.addActionListener(this);
      resetb = new JButton("다시쓰기");
      resetb.addActionListener(this);
      
      jp[size].add(okb);
      jp[size].add(resetb);
      
      add(jp[size]);
   }
   
   // 버튼에 대한 이벤트 처리
   @Override
   public void actionPerformed(ActionEvent e) {
	   String ActionEvent_Type = e.getActionCommand();
	   
	   EmployeeVO evo = null;
	   EmployeeDAO edao = null;
	   
	   if(ActionEvent_Type.equals(okb.getText())) { // 저장하기 버튼 클릭 시
		   try {
			   evo = new EmployeeVO(0, jtf[0].getText(), jtf[1].getText(), department, jtf[2].getText());
			   
			   // DAO 객체 생성
			   edao = new EmployeeDAO();
			   
			   // 메소드 호출
			   edao.getEmployeeRegister(evo);
			   
		   } catch (Exception e1) {
			   e1.printStackTrace();
		   }
		   
		   if(edao != null) {
			   JOptionPane.showMessageDialog(this, jtf[0].getText() + "님이 성공적으로 추가되었습니다");
		   }
	   }
	   else if(ActionEvent_Type.equals(resetb.getText())) { // 다시쓰기 버튼 클릭 시
		   int size = caption.length;
		   for (int i = 0; i < (size - 1); i++) {
			   // 모든 텍스트 필드 초기화
			   jtf[i].setText("");
		   }
	   }
   }
   
   // 콤보박스에 대한 이벤트 처리
   @Override
   public void itemStateChanged(ItemEvent e) {
	   if(e.getStateChange() == ItemEvent.SELECTED) {
		   department = Integer.parseInt(e.getItem().toString());
	   }
   }
}