package Day1130;

import java.awt.*;
import javax.swing.*;

public class JLabelEx extends JFrame {
   
   // 이미지 Icon의 객체 
   private Icon icon = new ImageIcon("src/image/ico01.jpg");
   
   // 아이콘 생성 방법 1
   private JLabel jlb1 = new JLabel(icon);
   
   // 아이콘 생성 방법 2
   // JLabel에서 위치를 설정
   private JLabel jlb2 = new JLabel("Test2", JLabel.CENTER);

   // 아이콘 생성 방법 3
   // SwingConstants 를 통해 위치를 설정
   private JLabel jlb3 = new JLabel("Test3", icon, SwingConstants.RIGHT);
   
   public JLabelEx() {
      super("JLabel");
      
      Container con = this.getContentPane();
      // GridLayout(3행 1열)
      con.setLayout(new GridLayout(3, 1));
      // 아이콘 생성 방법 1
      con.add(jlb1);
      
      // 아이콘 생성 방법 2
      con.add(jlb2);
      jlb2.setIcon(icon);
      
      // 아이콘 생성 방법 3
      con.add(jlb3);
      
      setSize(300, 200);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
      new JLabelEx();
   }
}