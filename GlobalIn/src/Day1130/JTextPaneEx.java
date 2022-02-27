package Day1130;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JTextPaneEx extends JFrame {
   public static void main(String[] args) {
      JFrame frame = new JFrame("HI");
      // setSize(200, 70) : 프레임의 크기를 설정 (고정 크기)
      // setPreferredSize(new Dimension(200, 70)) : 컴포넌트의 크기를 다시 설정할 때 사용하는 메소드 (변경 가능)
      frame.setPreferredSize(new Dimension(200, 70));
      frame.setLocation(500, 400);
      
      Container con = frame.getContentPane();
      
      JTextField text = new JTextField();
      JButton button = new JButton("확인");
      JLabel label = new JLabel("Hello ");
      con.add(text, BorderLayout.CENTER);
      con.add(button, BorderLayout.EAST);
      con.add(label, BorderLayout.SOUTH);
      
      // 리스너 연결
      ActionListener listener = new ConfirmButtonActionListener(text, label);
      
      button.addActionListener(listener);
      
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}