package Day1130;

import java.awt.*;
import javax.swing.*;

public class JButtonEx extends JFrame {
   
   private Icon icon1 = new ImageIcon("src/image/ico04.jpg");
   private Icon icon2 = new ImageIcon("src/image/ico03.jpg");
   private Icon icon3 = new ImageIcon("src/image/ico02.jpg");
   private Icon icon4 = new ImageIcon("src/image/ico05.jpg");
   
   JRadioButton[] jb = new JRadioButton[4];
   private ButtonGroup bg = new ButtonGroup();
   
   public JButtonEx() {
      super("JButton");
      Container con = this.getContentPane();
      con.setLayout(new GridLayout(2, 2));
      
      for(int i = 0; i < 4; i++) {
         jb[i] = new JRadioButton(i + 1 + "번 버튼", icon1);
         con.add(jb[i]);
         jb[i].setToolTipText(i + 1 + "번째 버튼입니다. 눌러주세요...");
         // 아스키 코드 활용 ( 1 : 49 ~ 9 : 57 )
         jb[i].setMnemonic(i + 49);
         
         // setRolloverIcon(Icon) : 마우스커서가 버튼의 범위에 들어갔을 때
         jb[i].setRolloverIcon(icon2);
         // setPressedIcon(Icon) : 마우스를 눌렀을 때
         jb[i].setPressedIcon(icon3);
         // setSellectedIcon(Icon) : 선택(라디오박스 형식)했을 때
         jb[i].setSelectedIcon(icon4);
         bg.add(jb[i]);
      }
      
      
      pack();
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) {
      new JButtonEx();
   }
}