package com.emp;

import java.util.*;
import javax.swing.table.AbstractTableModel;

// 사원 전체를 보기 위한 객체
public class EmployModel extends AbstractTableModel {

	Object[][] data;
	Object[] columnName;
	
	EmployeeDAO edao = new EmployeeDAO();
	EmployeeVO evo; // 정보를 저장하고 있는 클래스
	ArrayList<String> title; // 열 이름
	ArrayList<EmployeeVO> list; // 행(레코드)
	
	public EmployModel() {
		// 열의 개수와 행의 개수를 얻어와 2차원 배열 선언
		// 테이블에서 컬럼 이름을 얻어와 1차원 배열 선언
		
		title = edao.getColumnName();
		columnName = title.toArray();
		int columnCount = title.size();
		
		list = edao.getEmployeetotal();
		
		int rowCount = list.size();
		
		data = new Object[rowCount][columnCount];
		
		for(int index = 0; index < rowCount; index++) {
			evo = list.get(index);
			data[index][0] = evo.getNo();
			data[index][1] = evo.getName();
			data[index][2] = evo.getJobGrade();
			data[index][3] = evo.getDepartment();
			data[index][4] = evo.getEmail();
		}
	}
	
	@Override
	public int getRowCount() { // 행 개수
		if(data == null) {
			return 0;
		}
		else {
			return data.length;
		}
	}

	@Override
	public int getColumnCount() { // 열 개수
		if(columnName == null) {
			return 0;
		}
		else {
			return columnName.length;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}
	
	@Override
	public String getColumnName(int column) {
		return (String)columnName[column];
	}
}