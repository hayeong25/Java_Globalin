package Day1130;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class JEditorPaneEx extends JFrame{
   
   public JEditorPaneEx() {
      super("JEditorPane");
      
      // JEditorPane :
      
      JEditorPane editorPane = new JEditorPane();
      // setEditable() : 편집 가능 여부 (true : 활성화, false : 비활성화)
      editorPane.setEditable(false);
      try {
         // 페이지 설정
         // URL이 잘못 입력됬을 경우의 예외처리(IOException)
         editorPane.setPage("https://www.daum.net/");
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      // ScrollPane 객체 생성
      JScrollPane sp = new JScrollPane(editorPane);
      // 수직바(스크롤바)를 항상 나오도록 정함
      sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      // setPreferredSize(new Dimension(800, 600)) : JScrollPane 의 사이즈를 가로 800, 세로 600 크기로 정한다
      sp.setPreferredSize(new Dimension(800, 600));
      add(sp);
      
      // pack() : 컴포넌트에 맞춰 프레임을 자동으로 프레임의 크기를 설정해준다.
      pack();
      setLocation(300, 200);
      setResizable(false);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args) throws IOException {
      new JEditorPaneEx();
   }
}