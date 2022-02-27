package Day1201;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class RemoveActionListener implements ActionListener {

	JTable table;
	
	public RemoveActionListener(JTable table) {
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow(); // 테이블에서 선택한 행을 가져와서 변수에 저장
		
		if(row == -1) { // 선택한 행이 없으면
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.removeRow(row); // 테이블에서 선택한 행 삭제
	}
}