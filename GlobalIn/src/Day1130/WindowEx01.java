package Day1130;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowEx01 {
   public static void main(String[] args) {
      JFrame frame = new JFrame("시험 응시자 명단");
      
      frame.setPreferredSize(new Dimension(300, 150));
      frame.setLocation(500, 400);
      Container contentPane = frame.getContentPane();
      
      String colNames[] = {"이름", "나이", "성별"};
      Object data[][] = {
            {"강아지", 2, '남'},
            {"고양이", 4, '여'},
            {"곰탱이", 12, '남'},
            {"호랑이", 7, '여'}
      };
      
      // 데이터 항목이 있는 2차원 배열(data[][]), column이 있는 1차원 배열(colNames[])
      JTable table = new JTable(data, colNames);
      
      // 테이블이 올려진 ScrollPane 생성
      JScrollPane scrollPane = new JScrollPane(table);
      
      // ScrollPane를 Container에 추가
      contentPane.add(scrollPane, BorderLayout.CENTER);
      
      JButton button = new JButton("출력");
      contentPane.add(button, BorderLayout.SOUTH);
      
      ActionListener listener = new PrintActionListener(table);
      button.addActionListener(listener);
      
      
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}