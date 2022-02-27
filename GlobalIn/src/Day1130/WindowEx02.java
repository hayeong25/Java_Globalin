package Day1130;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import Day1201.RemoveActionListener;

import java.awt.event.*;

public class WindowEx02 {
   public static void main(String[] args) {
      JFrame frame = new JFrame("시험 응시자 명단");
      frame.setPreferredSize(new Dimension(400, 200));
      frame.setLocation(500, 400);
      
      Container con = frame.getContentPane();
      
      String colNames[] = {"이름", "나이", "성별"};
      
      DefaultTableModel model = new DefaultTableModel(colNames, 0);
      
      JTable table = new JTable(model);
      
      JPanel panel = new JPanel();
      JTextField text1 = new JTextField(6);
      JTextField text2 = new JTextField(3);
      JTextField text3 = new JTextField(2);
      
      JButton button1 = new JButton("추가");
      JButton button2 = new JButton("삭제");
      
      panel.add(new JLabel("이름"));
      panel.add(text1);
      panel.add(new JLabel("나이"));
      panel.add(text2);
      panel.add(new JLabel("성별"));
      panel.add(text3);
      
      panel.add(button1);
      panel.add(button2);
      
      con.add(panel, BorderLayout.SOUTH);
      con.add(new JScrollPane(table), BorderLayout.CENTER);
      
      button1.addActionListener(new AddActionListener(table, text1, text2, text3)); // 행 추가 이벤트 등록
      button2.addActionListener(new RemoveActionListener(table)); // 행 삭제 이벤트 등록
      
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}