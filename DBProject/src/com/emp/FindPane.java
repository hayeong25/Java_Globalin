package com.emp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField jtf[] = new JTextField[5];
	
	private JButton okb;
	private JButton resetb;
	
	String[] caption = {"번    호 : ", "이    름 : ", "직    책 : ", "부    서 : ", "메    일 : "};

	public FindPane() {
		// 레이아웃 설정
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size = caption.length;
		
		int i;
		for (i = 0; i < size; i++) {
			jl[i] = new JLabel(caption[i]);
			jtf[i] = new JTextField(15);
			jp[i] = new JPanel();
			
			jp[i].add(jl[i]);
			jp[i].add(jtf[i]);
			
			add(jp[i]);
			
			jtf[i].setEditable(false); // 텍스트필드 입력 및 수정 불가능하게 설정
			
			if(i == 0 || i == 1) {
				jtf[i].setEditable(true); // 사원번호와 이름으로 검색할 때에만 입력 가능한 상태로 만듦
			}
		}
		
		jp[size] = new JPanel();
		
		okb = new JButton("사원 정보 조회");
		okb.addActionListener(this);
		
		resetb = new JButton("다시 쓰기");
		resetb.addActionListener(this);
		
		jp[size].add(okb);
		jp[size].add(resetb);
		
		add(jp[size]);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String ActionEvent_Type = ae.getActionCommand(); // 이벤트 발생 캡션 값을 가져옴
		
		// 검색 사원정보를 저장한 VO 객체 생성
		EmployeeVO evo = null;
		
		// DB 처리를 위한 DAO 객체 생성
		EmployeeDAO edao = null;
		
		if(ActionEvent_Type.equals(okb.getText())) { // 조회 버튼 클릭 시
			try {
				edao = new EmployeeDAO();
				
				String sno = jtf[0].getText().trim(); // 사원 번호. 공백 없이
				String sname = jtf[1].getText().trim(); // 사원 이름. 공백 없이
				
				if(!sno.equals("") && !sname.equals("")) {
					// 사원 번호와 이름으로 검색
					int no = Integer.parseInt(sno);
					evo = edao.getEmployeeCheck(no, sname);
				}
				else if(!sno.equals("") && sname.equals("")) {
					// 사원 번호로 검색
					int no = Integer.parseInt(sno);
					evo = edao.getEmployeeNo(no);
				}
				else if(sno.equals("") && !sname.equals("")) {
					// 사원 이름으로 검색
					evo = edao.getEmployeeName(sname);
				}
			} catch (Exception e) {
				System.out.println("e : [" + e + "]");
			}
			
			if(evo != null) { // 정보가 있는 경우
				// 해당 사원이 존재하면 값을 가져옴
				jtf[0].setText(evo.getNo() + " ");
				jtf[1].setText(evo.getName() + " ");
				jtf[2].setText(evo.getJobGrade() + " ");
				jtf[3].setText(evo.getDepartment() + " ");
				jtf[4].setText(evo.getEmail());
			}
			else {
				JOptionPane.showMessageDialog(this, "검색 실패");
			}
		}
		else if(ActionEvent_Type.equals(resetb.getText())) { // 다시 쓰기 버튼 클릭 시
			int size = caption.length;
			
			// 텍스트 필드 초기화
			for (int i = 0; i < size; i++) {
				jtf[i].setText("");
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}