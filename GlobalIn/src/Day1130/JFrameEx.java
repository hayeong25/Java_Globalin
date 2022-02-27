package Day1130;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* 
	컨테이너
    - 다른 컴포넌트를 포함할 수 있는 컴포넌트
    - 컨테이너 역시 컴포넌트임에 유의한다.(즉, 컨테이너는 다른 컨테이너에 포함될 수 있다.)
    - 컨테이너의 종류 : JFrame, JDialog, JApplet, JWindow, JPanel, JScrollPane, JTabbedPane, JSplitPane, JToolBar, JLayeredPane, JDesktopPane 등
    - 최상위 컨테이너 : 다른 컨테이너에 속하지 않고도 독립적으로 존재하여 출력될 수 있는 컨테이너
    - 최상위 컨테이너의 종류 : JFrame, JDialog, JApplet
    - 최상위 컨테이너가 아닌 컨테이너들은 독립적으로 존재할 수 없으며, 다른 컨테이너에 부착될 때만 화면에 출력된다.
      
    컴포넌트
    - 다른 컴포넌트를 포함할 수 없으며, 컨테이너에 부착되어야 화면에 출력된다.
    - 컴포넌트의 종류 : JLabel, JTextField, JTextArea, ,JButton, JComboBox, JCheckBox, JRadioButton, JTextPane, JEditorPane, JPasswordPane, JSpinner, JList, JTable, JTree, JScrollBar, JSlider 등
*/

public class JFrameEx extends JFrame{
   
   public JFrameEx() {
      super("JFrame");
      
      JButton bt1 = new JButton("Hello Swing North");
      JButton bt2 = new JButton("Hello Swing Center");
      
      // JFrame 프레임에서 getContentPane() 메소드를 통해 contentPane(AWT : Panel) 객체를 생성
      Container con = getContentPane();
      
      // bt1에 North 값을 정했기 때문에 bt2를 프레임에 바로 추가하여 나머지 영역을 사용한다.
      con.add(BorderLayout.NORTH, bt1);
         //  => con.add("North", bt1);
      
      add(bt2);
      
      setSize(200, 200);
      setVisible(true);
      
      // window 창 강제 종료 (AWT : WindowListener => JFrame에서는 종료창 메소드 제공)
      // 프레임이 종료될 때 명시적으로 자원을 해제시키면서 종료할 수 있도록 지정함
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // 위 문장이 없어도 종료버튼이 정상적으로 작동이 될 수 있도록 JFrame에 기능에 구현이 되어있다.
   }
   
   public static void main(String[] args) {
      new JFrameEx();
   }
}