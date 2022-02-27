package Day1130;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class PrintActionListener implements ActionListener{
   
   JTable table;
   
   public PrintActionListener(JTable table) {
      this.table = table;
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      
      // table의 모델(행의 개수, 열의 개수...)을 반환
      TableModel model = table.getModel();
      
      // model에서 row,column의 개수를 가져온다.
      // getRowCount(), getColumnCount()
      int rowNum = model.getRowCount();
      int colNum = model.getColumnCount();
      
      // column의 이름을 가져와서 출력
      for(int col = 0; col < colNum; col++) {
         String colName = model.getColumnName(col);
         System.out.print(colName + "\t\t");
      }
      System.out.println();
      
      // getValueAt(2, 3) : (행, 열)의 위치에 있는 데이터를 가져옴
      for(int row = 0; row < rowNum; row++) {
         for(int col = 0; col < colNum; col++) {
            Object obj = model.getValueAt(row, col);
            System.out.print(obj + "\t\t");
         }
         System.out.println();
      }
      System.out.println("---------------------------------------");
   }
}